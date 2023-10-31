package local.onlits.onlits2001.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListSort {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new Vector<Integer>();
        arr.add(67);
        arr.add(4);
        arr.add(32);
        arr.add(50);
        arr.add(9);

        for (Integer n : arr) {
            System.out.println(n);
        }

        System.out.println("The length of arr is " + arr.size());

        arr.add(2, 94);

        for (Integer n : arr) {
            System.out.println(n);
        }

        System.out.println("The length of arr is " + arr.size());
        
        Collections.sort(arr);

        for (Integer n : arr) {
            System.out.println(n);
        }
    }
}
