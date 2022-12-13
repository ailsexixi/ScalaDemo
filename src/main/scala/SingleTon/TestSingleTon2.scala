package SingleTon

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object TestSingleTon2 {
    def main(args: Array[String]): Unit = {
        val s1 = SingleTon2.getInstance()
        val s2 = SingleTon2.getInstance()
        println(s1 == s2)
    }

}

class SingleTon2 private(){}

object SingleTon2{
     private var s:SingleTon2 = new SingleTon2

    def getInstance(): SingleTon2 ={
        s
    }
}
