package local.onlits.onlits2001.principles.di.ex2;

public class MyDIApplication implements Consumer {
    private MessageService service;

    public MyDIApplication(MessageService service) {
        this.service = service;
    }

    public void processMessages(String message, String receiver) {
        service.sendMessage(message, receiver);
    }
}
