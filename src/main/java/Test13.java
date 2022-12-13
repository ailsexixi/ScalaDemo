import java.util.List;

/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
public class Test13 {
    public static void main(String[] args) {
        Test14 test14 = new Test14();

    }

    public static void sayHi(Test14 test14) {
        System.out.println("Hello...");
    }

}

class Test14{
    String name;
    public Test14(){
        Test13.sayHi(this);
        System.out.println(this);
        test();
    }

    public void test(){
        System.out.println("adad");
    }
}
