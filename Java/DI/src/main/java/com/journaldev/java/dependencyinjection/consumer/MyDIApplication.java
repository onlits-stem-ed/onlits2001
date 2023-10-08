package com.journaldev.java.dependencyinjection.consumer;

import com.journaldev.java.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService svc) {
        service = svc;
    }

    @Override
    public void processMessages(String msg, String rec) {
        service.sendMessage(msg, rec);
    }
}
