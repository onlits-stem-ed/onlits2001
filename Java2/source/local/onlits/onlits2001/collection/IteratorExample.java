package local.onlits.onlits2001.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Muzaffarpur");
        cities.add("Patna");
        cities.add("Hajipur");
        cities.add("Gaya");
        cities.add("Darbhanga");

        Iterator<String> it = cities.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
