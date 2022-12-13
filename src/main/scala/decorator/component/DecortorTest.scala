package decorator.component

import decorator.component.coffee.{Drink, Espresso}
import decorator.decortor.{Chocolate, Milk}

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object DecortorTest {

    def main(args: Array[String]): Unit = {
        var decortor:Drink = null

        val espresso = new Espresso
        println(espresso.getDescription())

        decortor = new Chocolate(espresso)
        println(decortor.getDescription())

        decortor = new Milk(decortor)

        println(decortor.getDescription())
        println(decortor.cost())
    }

}
