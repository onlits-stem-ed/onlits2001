package local.onlits.onlits2001.collection;

import java.util.Vector;

class MyVector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        // for(int i=0; i<v.size(); i++) {
        //     System.out.println(v.get(i));
        // }

        for (Integer x : v) {
            System.out.println(x);      //unboxing
        }
    }
};