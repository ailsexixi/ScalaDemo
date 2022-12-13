/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object CaseDemo {

    def main(args: Array[String]): Unit = {

        var ch = 20
        //守卫匹配
        ch match {
            case _ if(ch > 100) => println("100")
            case _ if(100 >= ch && ch >= 50) => println("50")
            case _ if(ch < 50) => println("0")
        }

        //变量匹配
        ch match {
            case id => printf("id为%d\n",id)
            case _ => printf("id为%d\n",0)
        }
//        var a = 8
//        val obj=if(a==1)1
//        else if(a==2)"2"
//        else if(a==3)BigInt(3)
//        else if(a==4) Map("aa"->1)
//        else if(a==5) Map(1->"aa")
//        else if(a==6) Array(1,2,3)
//        else if(a==7) Array("aa",1)
//        else if(a==8) Array("aa")
//        //类型匹配,需要变量的类型为Any
//        obj match {
//            case Int => printf("Int")
//            case String => printf("Int")
//            case Map[String,Int] => printf("Map[String,Int]\n")
//            case Array[Int]() => printf("Array[Int]\n")
//            case Array[String] => printf("Array[String]\n")
//        }

//        val arrs2 = Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0),Array(1,1,0,1))
//        for (arr <- arrs2) {
//            arr match
//            {
//                case Array(x) => println(x)
//                case Array(x, y) => println(x + " " + y)
//                case Array(x, y, z) => println(x + " " + y + " " + z)
//                case Array(x, _*) => println(0 + "... ")
//            }
//        }
//        println(0::1::Nil)
//        for(list<-Array(List(0),List(1,0),List(88),List(0,0,0),List(1,0,0),List(0,1,2,3))) {
//            list match {
//                case x::Nil => println(x)
//                case x::y::Nil => println(x + " " + y)
//                case x::y::z::Nil => println(x + " " + y + " " + z)
//                case x::tail => println("x....")
//            }
//        }
//        //对象匹配
//        val n = Square(5.0)
//        n match {
//            case Square(n) => printf("匹配成功\n")
//            case _ => println("匹配不成功")
//        }
//
//        //样例类匹配
//        val currency = Currency2(1000.0, "RMB")
//        for(amt<-Array(Dollar2(1000.0),currency,NoAmount2)){
//            amt match {
//                case Dollar2(v) =>println("Dollar2 " + v )
//                case Currency2(v,f) => println("Currency2 " + v + f)
//                case NoAmount2 => println("NoAmount2")
//            }
//        }
//        val currency2 = currency.copy()
//
//
//        val list10=List(1,2,3,4,1.2,2.4,1.9f,"hello")
//
//        //偏函数，new PartialFunction定义一个define和apply方法，
//        val list11=list10.collect{
//            case i:Int=>i+1
//            case j:Double=>(j*2).toInt
////            case k:Float=>(k*3).toInt
//        }
//        println("list11="+list11)//(2,3,4,5)
//
//        //匿名函数不用写返回类型，用的自动推断
//        val intToInt = (x:Int) => x+ 1
//        var a = 8
//        val caseclass=if(a==1) String
//        else if(a==2) Int
////        else scala.collection.mutable.Map[String,Int]
////        else if(a==3)BigInt(3)
////        else if(a==4) Map("aa"->1)
////        else if(a==5) Map(1->"aa")
////        else if(a==6) Array(1,2,3)
////        else if(a==7) Array("aa",1)
////        else if(a==8) Array("aa")
//        //类型匹配,需要变量的类型为Any
//         caseclass match {
//            case Int => printf("Int")
//            case String => printf("Int")
//            case scala.collection.mutable.Map[String,Int] => printf("Map[String,Int]\n")
//            case scala.collection.mutable.Map[String,Int] =>
            //            case Array[Int]() => printf("Array[Int]\n")
            //            case Array[String] => printf("Array[String]\n")
        }



}

object Square{
    def apply(z:Double):Double = z*z

    def unapply(z:Double):Option[Double]= {
        println("unapply被调用z是="+z)
        Some(math.sqrt(z))
    }
}

abstract sealed class Amount2 //密封类,case 的子类不能声明在其他源文件中
case class Dollar2(value:Double) extends Amount2//样例类
case class Currency2(value:Double,unit:String) extends Amount2//样例类
case object NoAmount2 extends Amount2//样例类


