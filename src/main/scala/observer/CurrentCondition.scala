package observer

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class CurrentCondition extends Subject {
    var observerList = scala.collection.mutable.ListBuffer[Observer]()

    var temperature:Double = _
    var humidity:Double = _
    var pressure:Double = _

    def getTemperature(): Double ={
        temperature
    }

    def getHumidity(): Double ={
        humidity
    }

    def getPressure(): Double ={
        pressure
    }

    override def registerObserver(observer: Observer): Unit = {
        observerList += observer
    }

    override def removeObserver(observer: Observer): Unit = {
        observerList -= observer
    }

    override def notifyObserver(): Unit = {
        for (observer <- observerList) {
            observer.update(getTemperature(),getHumidity(),getPressure())
        }
    }
    def setData(temperature:Double,humidity:Double,pressure:Double): Unit ={
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        dataChange()
    }

    def dataChange(): Unit ={
        notifyObserver()
    }
}
