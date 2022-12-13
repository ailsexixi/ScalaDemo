package decorator.component.coffee

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class Coffee extends Drink {
    override def cost(): Float = {
        getPrice()
    }
}
