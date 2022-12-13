package factorymethod.pizzastore.order
import factorymethod.pizzastore.pizza.{BJCheesePizza, BJPepperPizza, Pizza}

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class BJFactory extends AbsFactory {
    override def createPizza(pizzatype: String): Pizza = {
        var pizza:Pizza = null
        if(pizzatype == "cheese"){
            pizza = new BJCheesePizza
        } else if(pizzatype == "pepper"){
            pizza =  new BJPepperPizza
        }
        return pizza
    }
}
