/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        c2 c = new c2();
    }
}

    class c2 extends c1{
//         public  String s="BBBB";

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
        protected   String s="AAAA";
        //父类构造函数
        public c1(){
            call();
        }
        public void call(){
            System.out.println("父类：" + s);
        }
        public String call2(){
            return s;
        }
    }
