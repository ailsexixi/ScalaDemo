package decorator.decortor

import decorator.component.coffee.Drink

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class Milk(obj:Drink) extends Decortor(obj) {

    super.setPrice(2.0f)
    super.setDescription("牛奶")
}
