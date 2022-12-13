/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class Demo6 {
    var a = "jack"
    println("dada")


    def this(a:String){
        this
        println("dasdas")
    }
}


class Demo7(name:String) {
    var a = "tom"
    println("Demo7")
    def this(){
        this("dasd")
        println("eeee")
    }

}


class Demo8 extends Demo7 {
    var b = "tom2"
    println("Demo8")

}


object Demo9{
    def main(args: Array[String]): Unit = {
        new Demo8
    }
}