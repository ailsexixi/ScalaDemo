/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
public class Test4 {
    public Test4(String name){
        System.out.println(name);
    }
    public Test4(){
        System.out.println("dasdas");
    }

    public static void main(String[] args) {

    }
}

class Test5 extends Test4{

    public Test5() {
//        super("nae");
        System.out.println("bbbbbbb");
    }

    public Test5(String name) {
//        super("nae");
        System.out.println("czcca");
    }
}
