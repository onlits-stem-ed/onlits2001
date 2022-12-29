package local.onlits.onlits2001.principles.di.ex2;

public class SMSService implements MessageService {
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with message= " + message);
    }
}
