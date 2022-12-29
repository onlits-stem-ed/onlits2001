package local.onlits.onlits2001.principles.di.ex2;

public class EmailService implements MessageService {
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with message= " + message);
    }
}
