package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author 1111358@cecdat.com
 * @version 1.0.0
 */
public class Collect {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(10); //10 代表初始容量，后续可以扩容

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");

        int[] arr = new int[3];
        int[] arr2 = {1,2,3};
        int[] arr3 = new int[]{1,2,3};

        HashSet<String> hashSet = new HashSet<String>();
        TreeSet<String> hashSet2 = new TreeSet<String>();
        hashSet.add("1");

    }
}
