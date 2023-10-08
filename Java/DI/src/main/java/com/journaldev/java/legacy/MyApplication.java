package com.journaldev.java.legacy;

public class MyApplication {
    private EmailService email = null;

    public MyApplication(EmailService svc) {
        email = svc;
    }
    
    public void processMessage(String msg, String rec) {
        //We would like to perform some validations
        email.sendEmail(msg, rec);
    }
}
