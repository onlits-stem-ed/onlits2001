package local.onlits.onlits2001.map;

import java.util.HashMap;

public class HashMapStudent {
    public static void main(String[] args) {
        var student = new HashMap<String, String>();
        student.put("name", "Mrithynjay Kumar");
        student.put("address", "Muzaffarpur");

        System.out.println("Name: " + student.get("name"));
    }
}
