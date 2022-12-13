package rmi

import java.rmi.Naming

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
class MyRemoteClient {

    def go(): String ={
        val remote = Naming.lookup("rmi://127.0.0.1:9999/RemoteHello").asInstanceOf[MyRemote]
        remote.sayHello()
    }

}

object MyRemoteClient{
    def main(args: Array[String]): Unit = {
        val remoteClient = new MyRemoteClient
        println(remoteClient.go())
    }
}
