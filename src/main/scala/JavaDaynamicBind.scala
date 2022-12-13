/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object JavaDaynamicBind {
    def  main(args: Array[String]) {


        //将一个子类的对象地址，交给了一个AA(父类的)引用
        //java的动态绑定机制的小结
        //1.如果调用的是方法，则Jvm机会将该方法和对象的内存地址绑定
        //2.如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应值
//        AAA obj = new BBB();
        val obj:AAA = new BBB()
        System.out.println(obj.sum());  //40 //? 30
        System.out.println(obj.sum1()); //30 //? 30  i被覆写了

    }
}

class AAA {
    val i = 10;

    def sum(): Int = {
        getI() + 10
    }

    def sum1(): Int = {
        i + 10
    }
    def getI(): Int ={
         i
    }
}

class BBB extends AAA {
    override val i = 20;
    //    public int sum() {
    //        return i + 20;
    //    }
    override def getI():Int ={
         i;
    }
    //    public int sum1() {
    //        return i + 10;
    //    }
}

