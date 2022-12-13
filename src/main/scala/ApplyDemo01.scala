import scala.collection.{JavaConversions, JavaConverters, mutable}
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object ApplyDemo01 {
    def main(args: Array[String]): Unit = {
//        val list = List(1, 2, 5)
//        println(list)

        val pig = new Pig("小花")

        //使用apply方法来创建对象
        val pig2 = Pig("小黑猪") //自动  apply(pName: String)
        val pig3 = Pig() // 自动触发 apply()
        val pig4 = Pig  //返回的是pig$ 对象

//        println("pig2.name=" + pig2.name) //小黑猪
//        println("pig3.name=" + pig3.name) //匿名猪猪

//        val array = Array(0,"1")
//        val arrayBuffer = ArrayBuffer(0,"6")
//
//        import scala.collection.JavaConversions.bufferAsJavaList
////        val list = JavaConverters.bufferAsJavaList(arrayBuffer)
////        val javaArr = new ProcessBuilder(arrayBuffer)
//        val list = JavaConverters.bufferAsJavaList(arrayBuffer)
//
//        val buffer = JavaConverters.asScalaBuffer(list)
//        val toArray = buffer.toArray
//        val toBuffer = toArray.toBuffer
//
//        val tuple = (1,"2",true)
//        val tuple2 = ((1,"2",true),(1,"2",3.5D))
//
//        val List=scala.collection.immutable.List
//        val Nil2=Nil
//        val Nil3=scala.collection.immutable.Nil
//
//        val List2=List(0,1,2)
//        println(0::List2:::Nil)  //将集合的每一个元素加入到集合中（List）
//        val ints = List2.+:(2)  //在前面加元素
//        val ints2 = List2.:+(2) //在后面加元素
//        println(List)
//        println(List2)
//        println(ints)
//        println(ints2)
//        println(Nil2)
////        println(queue)
//        println(ints2)
//        println(9::List2::Nil)
//
//        val listbuffer = new ListBuffer[Any]
//        listbuffer.append("1")
//        listbuffer += ("7")
//        println(listbuffer.++=(List2))  //将集合的每一个元素加入到集合中(ListBuffer)
//
//        println("================")
//        //队列
//        val queue = new mutable.Queue[Int]()
//
//        queue.++=(List2)
//        queue  += 9
//
//        queue.dequeue()  //从头部清除掉一个元素
//        queue.enqueue(9)  //从后面添加一个元素
//
//        println(queue.head)
//        println(queue.last)
//        println(queue.tail)
//        println(queue.tails)
//        println(queue)
//        println(queue ++= List2) //将集合的每一个元素加入到集合中(Queue)
//        println(queue += 8) //加入单个元素
//
//        var aaa = 3
//        printf("价格为%d\n",aaa)
//
//        val set = mutable.Set(1,2,3)
//        set += 8
//        set.++=(List2)
//        println(set)
//
//        val map = mutable.Map((1,"a"),(2,"b"))
//        println(map(1))
//        println(map.get(1).get)
//        println(if(map.contains(3)) map(1) else null)
//        println(map.getOrElse(3,null))
//        println(map.keys)
//        println(map.values)
//        for (elem <- map) {
//
//        }
//        var lst = 9::List2::Nil
//        println(lst.flatMap( x => List(x)))
//
//
//        val list1 = List(
//            List(1,2), List(3,4)
//        )
//        val lo: List[Int] = list1.flatMap(//返回类型还是List[Int]
//            list => {//整体
//                list   //容器   map处理后的还是两层的结合
//            }
//        )
//        println(lo)
//        println(lo.reduce(_ + _))
//        println(lo.reduceLeft(_ + _))
//        println(lo.reduceRight(_ - _))
//        println(lo.reduce(_ - _))
//        println(lo.fold(5)(_ - _))
//        println(lo.foldLeft(5)(_ - _))   // (((5- 1) - 2) - 3)-4)
//        println(lo.foldRight(5)(_ - _))  // 1- (2- (3 - (4-5)))
//        val sentence="AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
//        var map2 = Map[Char,Int]()
//        def charCount(map3:Map[Char,Int],c:Char):Map[Char,Int] ={
//            map3 + ((c,(map3.getOrElse(c,0) + 1)))
//        }
//        sentence.foldLeft(map2)(charCount) //这里不能用fold
//
//        def numsForm(n:BigInt):Stream[BigInt] = n#::numsForm(n+1)

    }
}

//案例演示apply方法.
class Pig(pName:String) {
//    var name: String = pName
}

object Pig {
    //编写一个apply
    def apply(pName: String): Pig = new Pig(pName)

    def apply(): Pig = new Pig("匿名猪猪")
}
