package decorator.decortor

import decorator.component.coffee.Drink

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class Decortor extends Drink{

    private var drk:Drink = null

    def this(drink:Drink){
        this
        this.drk = drink
    }

    override def cost(): Float = {
        super.getPrice() + drk.cost()
    }


    override def getDescription(): String = {
        super.getDescription() + "&& " + drk.getDescription()
    }

}
