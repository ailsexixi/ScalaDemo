/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */

object Demo3 {

    var j = 1

    println("aaaa")

    def test4(de: Demo3): Unit ={
        println("" + de.a)
        println("" + de.b)
        println("" + de.c)
    }
}

class Demo3 {

    var a = 1
    private val b = "string"  //get 和 set方法都是私有的
    private var c = "str"

    def test3(de: Demo3): Unit ={
        println("" + de.a)
        println("" + de.b)
        println("" + de.c)
    }
}


