/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
public class Order {

    public static void main(String[] args) {

        int[] ints = {8, 3, 5, 70, 6};

        int[] ints1 = new int[ints.length];


        //互换顺序排序
        for (int i = 0; i < ints.length; i++) {
            int a ;
            for (int j = i + 1; j < ints.length  ; j++) {
                if(ints[i] > ints[j]){
                    a =  ints[j];
                    ints[j] =  ints[i];
                    ints[i] =  a;
                }
            }
        }
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}
