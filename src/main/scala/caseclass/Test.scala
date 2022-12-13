package caseclass

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object Test {

    def main(args: Array[String]): Unit = {

        var a = HeartBeat  //构建了一个HeartBeat$ 对象
        val aa = MySQL3 //只有声明为object的对象才可以这么引用
        println(a)
        var b = HeartBeat("24") //调用了apply方法，构建了一个HeartBeat对象
        println(b)
        println(b.id)
        //        var v = java.lang.String
        var c = RemoveTimeOutWorker //构建了一个RemoveTimeOutWorker$ 对象
        println(c)

        val aaaaa = new AAAAA1
        println(aaaaa.a)
    }
}

case class HeartBeat(id:String)

//case object StartOutTimeWorker

case object RemoveTimeOutWorker

class MySQL2(){
    println("ss")
    def sayOk():Unit={
        println("sayOk")
    }
}

object MySQL3{
    println("ss")
    def sayOk():Unit={
        println("sayOk")
    }
}


trait AAA1{
    println("aaaa")
    def test()={
        println("A1")
    }
    implicit def a:Double
    implicit def b(c:Double):Int
}

class AAAAA1 extends AAA1{

    override implicit def a: Double = 3

    override implicit def b(c: Double): Int = c.toInt
}
