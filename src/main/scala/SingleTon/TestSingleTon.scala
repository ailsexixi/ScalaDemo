package SingleTon

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object TestSingleTon {
    def main(args: Array[String]): Unit = {
        val s1 = SingleTon.getInstance()
        val s2 = SingleTon.getInstance()
        println(s1 == s2)
    }

}

class SingleTon private(){}

// 懒汉式
object SingleTon{
    private var s:SingleTon = null

    def getInstance(): SingleTon ={
        if(s == null){
            s = new SingleTon
            s
        }else{
            s
        }
    }
}
