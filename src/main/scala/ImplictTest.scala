/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object ImplictTest {

    def main(args: Array[String]): Unit = {
        val demo = new ImplictDemo
        // demo.test(3.5D)
        //隐式函数，增加方法
        implicit def addDB(t: ImplictDemo) = {
            new DB
        }
        demo.insert(0)

        //隐式函数
        //    implicit def convert(num: Double): Int ={
        //        num.toInt
        //    }
        //    demo.test(2.4D)


        demo.test2()
    }
}

class ImplictDemo{

    //隐式函数
    implicit def convert(num: Double): Int ={
        num.toInt
    }



    var a:Int = 3.4D

    //隐式值
    implicit var n:Int = 1
    def test2(): Unit ={
        test
    }

    def test(implicit n2:Int = 2): Unit ={
        println(n)
    }



}

class DB{
    def insert(n:Int): Unit ={
        println("插入了数据： " + n)
    }
}


