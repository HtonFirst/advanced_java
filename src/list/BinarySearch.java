package list;

import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-2);
        arr.add(-4);
        arr.add(56);
        arr.add(8);
        arr.add(-44);
        arr.add(0);
        arr.add(83);
        arr.add(55);
        arr.add(55);
        arr.add(3);
        arr.add(9);
        arr.add(14);
        arr.add(-22);
        arr.add(15);

        Collections.sort(arr);
        System.out.println(arr);
        int index = Collections.binarySearch(arr,0);
        System.out.println(index);
        Collections.reverse(arr);
        System.out.println(arr);




    }
}
