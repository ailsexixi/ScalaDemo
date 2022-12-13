package caseclass

import kafka.server.DelayedFuturePurgatory

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object Test2 {

    def main(args: Array[String]): Unit = {
        import caseclass.AAAAA1
        val aaaaa = new AAAAA1
        import aaaaa.b
        import aaaaa.a
        var d = 2.0
        im
        im2(d)

        im3(d)

        val mySQL = new MySQL1
        mySQL.sayOk()
        mySQL.addSuffix()
    }

    def im(implicit a:Double): Unit ={
        println("aad")
    }

    def im2(implicit a:Int): Unit ={
        println("aad")
    }

    def im3(a:Int)(implicit b:Double): Unit ={
        println(a + b)
    }

    implicit class DB1(m:MySQL1){//ImplicitClassDemo$DB1$2
        def addSuffix():String={m+"scala"}}

//    class DB1{}
    class MySQL1(){
        println("ss")
        def sayOk():Unit={
            println("sayOk")
        }
    }

    val d = (x:Int) => x + 1

    def tt(f:Double =>Double): Unit ={

    }


}
