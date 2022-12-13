/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object OutClassTest {
    def main(args: Array[String]): Unit = {
        val out = new Out
        val inner = new out.Inner
        val inner2 = new out.Inner
        inner.test3(inner2)
        new Out.StaticInner
    }
}

object Out{
    myInner =>
    class StaticInner{
        def test2(): Unit ={
            println("StaticInner")
        }
    }
    def test(): Unit ={
        println("Out static")
    }
}

class Out{
    private var a = "aaa"
    class Inner{
        var a = 1
        def test2(): Unit ={
            Out.this.a = "bbbb"
            println(Out.this.a)
            println(a)
            println("Inner")
        }
        def test3(a:Inner): Unit ={
            println("aaaa")
        }
    }
}
