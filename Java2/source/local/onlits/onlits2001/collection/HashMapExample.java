package local.onlits.onlits2001.collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("India", "New Delhi");
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        for (String s : capitalCities.keySet())
            System.out.println(s);

        for (String s : capitalCities.values())
            System.out.println(s);

        for (String s : capitalCities.keySet())
            System.out.println(s + "\t\t" + capitalCities.get(s));
    }
}
