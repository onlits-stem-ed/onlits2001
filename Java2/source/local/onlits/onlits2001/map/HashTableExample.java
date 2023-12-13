package local.onlits.onlits2001.map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        var numbers = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);

        Integer n = numbers.get("two");
        if(n != null) {
            System.out.println("two = " + n);
        } else {
            System.out.println("null");
        }
    }
}
