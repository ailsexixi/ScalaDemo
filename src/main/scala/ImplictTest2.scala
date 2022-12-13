import java.util

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object ImplictTest2 {
    def main(args: Array[String]): Unit = {
        implicit class Close(mySQL1: MySQL1){
            def closed(): Unit ={
                println("" + mySQL1)
                println("closed...")
            }
        }
        val l = new MySQL1("d")
        l.sayOk()
        l.closed()

    }

}

class DB1{

}
class MySQL1(name:String){
    println(name)
    def sayOk():Unit={
        println("sayOk")
    }
}
