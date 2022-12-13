package rmi

import java.rmi.registry.LocateRegistry
import java.rmi.{Naming, RemoteException}
import java.rmi.server.UnicastRemoteObject

/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
//UnicastRemoteObject 同意传播对象的接口
class MyRemoteImpl extends UnicastRemoteObject with MyRemote {

    @throws(classOf[RemoteException])
    override def sayHello(): String = {
        "Hello"
    }
}

object MyRemoteImpl{
    def main(args: Array[String]): Unit = {
        val service = new MyRemoteImpl
//        LocateRegistry.createRegistry(9999)
//        Naming.rebind("RemoteHello",service)
        Naming.rebind("rmi://127.0.0.1:9999/RemoteHello",service)
        println("远程服务开启，在127.0.0.1的9999端口监听，服务名为RemoteHello")
    }
}
