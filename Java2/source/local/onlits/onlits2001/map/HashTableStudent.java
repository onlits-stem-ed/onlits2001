package local.onlits.onlits2001.map;

import java.util.Hashtable;

public class HashTableStudent {
    public static void main(String[] args) {
        var student = new Hashtable<String, String>();
        student.put("name", "Mrityunjay Kumar");
        student.put("address", "Muzaffapur");

        System.out.println("Name: " + student.get("name"));
    }
}
