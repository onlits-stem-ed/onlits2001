package com.journaldev.java.legacy;

public class MyLegacyTest {
    public static void main(String[] args) {
        MyApplication app = new MyApplication(new EmailService());
        app.processMessage("Hi Pankaj", "pankaj@abc.com");
    }    
}
