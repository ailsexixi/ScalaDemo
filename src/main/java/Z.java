/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
class X {
    M b = new M();

    X() {
        System.out.print("X");
    }
}
class Y {
    Y() {
        System.out.print("Y");
    }
}

class M {
    M() {
        System.out.print("M");
    }
}

public class Z extends X {
    Y y = new Y();
    Z() {
        super();
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();   //结果是 YXYZ
    }
}
