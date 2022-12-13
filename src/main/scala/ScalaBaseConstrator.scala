/**
  *
  *
  * @author 1111358@cecdat.com
  * @version 1.0.0
  */
object ScalaBaseConstrator {

    def main(args: Array[String]): Unit = {
        //分析一下他的执行流程
        // 1.因为scala遵守先构建父类部分extendsPerson700()
        // 2.Person...
//        val emp=new Emp700()
        // 分析一下他的执行流程
        // 1.因为scala遵守先构建父类部分extendsPerson700()
        // 2.Person...
        // 3.Emp....(Emp700的主构造器)
        println("=====================")
        val emp2 = new Emp700("mary")
        // println("**************************")
        // 分析执行的顺序
        //1.Person...
        // 2.默认的名字
        // 3.Emp....
        // 4.Emp辅助构造器~
         val emp3=new Emp700("smith")
    }
}

    // 父类Person
    class Person700(pName: String) {
        var name = pName
        println("Person...")

        def this() {
            this("默认的名字")
            println("默认的名字")
        }
    }

    // 子类Emp继承
    // Person
    class Emp700() extends Person700() {
        println("Emp....")

        // 辅助构造器
        def this(name: String) {
            this //必须调用主构造器this.name=name
            println("Emp辅助构造器~")
        }
    }

