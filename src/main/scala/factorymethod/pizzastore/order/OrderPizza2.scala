package factorymethod.pizzastore.order

import factorymethod.pizzastore.pizza.Pizza

import scala.io.StdIn
import scala.util.control.Breaks.{break, breakable}

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class OrderPizza2 {
//    var absFactory: AbsFactory = null
//    var orderType: String = null

    def this(abs: AbsFactory) {
        this
        breakable {
            var orderType: String = null
            var pizza:Pizza = null
            do {
            println ("请输入pizza的类型 使用工方法模式~~")
            orderType = StdIn.readLine ()
            pizza = abs.createPizza (orderType)
            if (pizza == null) {
            break ()
        }
            pizza.prepare ()
            pizza.bake ()
            pizza.cut ()
            pizza.box ()
        } while (true)

        }
    }




}
