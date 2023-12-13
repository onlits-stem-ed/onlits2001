package local.onlits.onlits2001.map;

import java.util.LinkedHashMap;

public class LinkedHashMapStudent {
    public static void main(String[] args) {
        var student = new LinkedHashMap<String, String>();
        student.put("name", "Mrityunjay");
        student.put("address", "Muzaffarpur");

        System.out.println("Address: " + student.get("address"));

    }
}
