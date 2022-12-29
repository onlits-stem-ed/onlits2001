package local.onlits.onlits2001.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSort {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(67);
        list.add(4);
        list.add(32);
        list.add(50);
        list.add(9);

        for(Integer n : list) {
            System.out.println(n);
        }

        System.out.println("The length of list is " + list.size());

        list.add(2, 94);

        for(Integer n : list) {
            System.out.println(n);
        }

        System.out.println("The length of list is " + list.size());

        Collections.sort(list);

        for(Integer n : list) {
            System.out.println(n);
        }
    }
}
