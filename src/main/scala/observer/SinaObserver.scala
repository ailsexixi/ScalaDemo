package observer

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class SinaObserver extends Observer {
    override def update(temperature: Double, humidity: Double, pressure: Double): Unit = {
        print(s"""
        |temperature: $temperature
        |humidity: $humidity
        |pressure: $pressure
                """.stripMargin)
    }
}
