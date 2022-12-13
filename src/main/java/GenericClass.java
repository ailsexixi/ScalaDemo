/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */

public class GenericClass<T> {

        private T value;

//        public GenericClass(T value) {
//
//            this.value = value;
//        }

        public T getValue() {

            return value;

        }

        public void setValue(T value) {

            this.value = value;

        }

    public static void main(String[] args) {
        GenericClass<Integer> stringGenericClass = new GenericClass<Integer>();
        stringGenericClass.setValue(123);
        System.out.println(stringGenericClass.getValue());
    }
}
