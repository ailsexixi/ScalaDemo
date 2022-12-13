package factorymethod.pizzastore.order

import factorymethod.pizzastore.pizza.Pizza

trait AbsFactory {

    def createPizza(pizzatype:String):Pizza

}
