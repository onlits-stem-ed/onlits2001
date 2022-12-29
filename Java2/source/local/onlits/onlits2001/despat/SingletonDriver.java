package local.onlits.onlits2001.despat;

public class SingletonDriver {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.message("This is a singleton class");
        Singleton t = Singleton.getInstance();
        t.message("Really it is?");
        System.out.println(s);
        System.out.println(t);
        Singleton u = Singleton.getInstance();
        System.out.println(u);
    }
}