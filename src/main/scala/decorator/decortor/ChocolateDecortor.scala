package decorator.decortor

import decorator.component.coffee.Drink

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class Chocolate(obj:Drink) extends Decortor(obj) {

    super.setPrice(3.0f)
    super.setDescription("巧克力")

}
