import scala.collection.mutable

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object Demo1 {

    def test(a:Int)(b:Int)(c:Int) = (a + b) * c
    def test2(a:Int)(b:Int)(c:Int)(p:(Int,Int,Int) => Int):Int = (a + b) * c

    def main(args: Array[String]): Unit = {
//        println(test(1)(2)(3))
//        println(test2(1)(2)(3)((a:Int,b:Int,c:Int) => a + b + c))

        val array = Array(1,2,3,4)
        val arrays = new Array[Int](5)

//        arrays(5) = 1
//        println(array.length)
//        println(array(0))
//        println(arrays.length)
//        println(arrays(5))

//        tt(4)
//
//        def tt(num: Int): Unit = {
//            if (num > 2) {
//                tt(num - 1)
//                println(num)
//            }
//        }
//
//        Demo2.a
//
        val s = s"""
           |akka.actor.provider="akka.remote.RemoteActorRefProvider"
           |akka.remote.netty.tcp.hostname=workerHost
           |akka.remote.netty.tcp.port=workerPort""".stripMargin
        println(s)
//        val a = 0
//        val b = 9
//        println(b/a)

        val workers=mutable.Map[String,WorkerInfo]()

//        val workerInfos = workers.values
//        val nowTime = System.currentTimeMillis()
//        //先把超时的所有workerInfo,删除即可
//        workerInfos.filter(workerInfo => (nowTime - workerInfo.lastHeartBeat) > 6000)
//                .foreach(workerInfo => workers.remove(workerInfo.id))
//        println("当前有 " + workers.size + " 个worker存活的")

        val nowTime: Long = System.currentTimeMillis()
        for (worker <- workers.values) {
            println(worker.lastHeartBeat)
            if(nowTime - worker.lastHeartBeat > 6000){
                workers.remove(worker.id)
            }
        }
        println("当前有" + workers.size + "个存活的worker" + workers)
    }


}

case class WorkerInfo(val id:String,val cpu:Int,val ram:Int){
    var lastHeartBeat = System.currentTimeMillis()
}

