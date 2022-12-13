package decorator.component.coffee

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
abstract class Drink {

    var description:String = null
    var price = 0.0f

    def setDescription(description:String): Unit ={
        this.description = description
    }

    def getDescription(): String ={
        "description: " + this.description + " price: " + this.price
    }

    def setPrice(price:Float): Unit ={
        this.price = price
    }

    def getPrice(): Float ={
        this.price
    }

    def cost():Float

}
