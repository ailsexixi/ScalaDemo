/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object RecursiveDemo {

    def main(args: Array[String]): Unit = {
        //递归
        def max(x: List[Int]): Int = {
            if (x.size == 1) {
                x.head
            }else if (x.head > max(x.tail)) x.head else max(x.tail)
        }

        val list = List(2,4)
        println(max(list))

        //求阶乘
        def factorial(n:Int):Int ={
            if(n == 1) 1 else n * factorial(n-1)
        }

        println(factorial(4))
    }

}
