/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object TraitDemo {

    def main(args: Array[String]): Unit = {
        val aa = new AA1
        println("====================")
        aa.test()
        println("====================")
        val aa2 = new AA2 with C1 with D1 {
            override def test2(): Unit = {
                println("eeeee")
            }
//            override def test(): Unit = {
//                println("ttttt")
//            }
            override var b: String = "ooooo"
        }
        aa2.test()
    }
}

trait A1{
    println("aaaa")
    def test()={
        println("A1")
    }
}




trait B1{
    println("bbbb")
    def test()={
        println("B1")
    }
}


trait C1 extends A1{
    var b:String
    println("cccc")

    override def test(): Unit = {
        println("C1")
    }
    def test2()
}

trait D1 extends A1{
    println("dddd")
    override def test()={
        println("D1")
    }
}

class AA1 extends C1 with D1 {
    println("cccc")

    override def test2(): Unit = {
        println("AA1")
    }

    override def test(): Unit = {
        println("AA12")
        super[C1].test()
    }

    override var b: String = "ppp"
}

class AA2  {
    println("AA2")
}

//自身类型
trait LogException {
    this:Exception =>
    def getMessage(): Unit ={

    }
    println("aaa")
}