/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object Demo5{
    def main(args: Array[String]): Unit = {
        val demo = new Demo4
        demo.d
        // demo.b 无法访问，因为在class Demo中，并没有提供get和set方法，只在Demo4$中才有
        Demo4.b
        println("aaaaa")
    }
}


class Demo4{

    var d =4  //get 和 set方法都是公共的
    private var e = 5  //private 修饰后，get 和 set方法都是私有的,假如在object类中有访问到改属性，
    // 则该属性的方法会被设为public，但是只能在本类中访问，在同包及子类中不让访问，因为编译器语法不让通过
    protected var h = 9
    //protected修饰后，get和set方法都是public，
    // 但是只能在子类中访问，在同包中不让访问，因为编译器语法不让通过
    def test(de: Demo4): Unit ={
        Demo4.b
        Demo4.a = 6
        Demo4.a

        println("aaa")
    }
}

object Demo4 {


    def test2(de: Demo4) {
        println("" + de.d)
        de.e = 6
        println("" + de.e)
        println("" + a)
        println("" + b)
    }

    private var a = 1   //private 修饰后，编译后get 和 set方法在class$都是私有的,
    // 在class中没有提供get和set方法，无论是否在class类中被引用
    // 假如在class类中有访问到改属性，则class$类中改属性的方法会被设为public，
    // 但是只能在本类中访问，在同包及子类中不让访问，因为编译器语法不让通过
    var b = 3  //在class$类中 get 和 set方法都是公共的，
    // 编译后在class 类中有静态的get和set方法，在class$类中有公共的get和set方法

    //object 里面的成员属性在编译后的文件 Demo4$ 类中都不是static的 ，
    // 只是在编译后的class Demo4 类中提供了提供了静态的的get和set方法，
    // 如果是private，则不会提供静态方法
}


