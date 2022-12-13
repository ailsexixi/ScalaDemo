/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */

/**
 * 当子类中也有变量s时，创建对象c时，先初始化父类成员变量，在父类执行构造函数中，函数中调用call方法，
 * 但call方法被子类重写，此时调用子类的call方法，但与前面不同的就是子类中也有变量s，那么就不会使用父类中的变量s，
 * 而子类的成员变量在这时还没有初始化，所以为null。之后再初始化子类的成员变量，执行子类构造函数
 */
public class CCC {
    public static void main(String[]args){
        CCC t = new CCC();
        CCC.c2 c = t.new c2();
    }

    class c2 extends c1{
         public String s="BBBB";
        //子类构造函数
        public c2(){
            call();
        }
        //重写父类中的call函数
        public void call(){
            System.out.println("子类：" + s);
        }
    }

    class c1{
        public String s="AAAA";
        //父类构造函数
        public c1(){
            call();
        }
        public void call(){
            System.out.println("父类：" + s);
        }
    }
}

class DD{
    
}

