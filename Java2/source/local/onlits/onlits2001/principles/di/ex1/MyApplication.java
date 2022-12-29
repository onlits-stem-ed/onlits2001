package local.onlits.onlits2001.principles.di.ex1;

public class MyApplication {
    private EmailService email = new EmailService();

    public void processMessages(String message, String receiver) {
        email.sendEmail(message, receiver);
    }
}
