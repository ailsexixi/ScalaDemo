package observer

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object ObserverTest {

    def main(args: Array[String]): Unit = {
        val sinaObserver = new SinaObserver
        val sinaObserver2 = new SinaObserver
        val currentCondition = new CurrentCondition
        currentCondition.registerObserver(sinaObserver)
        currentCondition.registerObserver(sinaObserver2)
        currentCondition.setData(20,30,40)
    }

}
