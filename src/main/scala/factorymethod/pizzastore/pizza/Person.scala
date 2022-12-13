package factorymethod.pizzastore.pizza

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class Person() {
    var name: String = _
    var age: Int = _

    def this(name:String){
        //辅助构造器无论是直接或间接，最终都一定要调用主构造器，执行主构造器的逻辑
        // 而且需要放在辅助构造器的第一行[这点和java一样，java中一个构造器要调用同类的其它构造器，也需要放在第一行]this()
        // 直接调用主构造器
        this()
        this.name=name
    }
}
