package local.onlits.onlits2001.principles.di.ex1;

public class EmailService {
    public void sendEmail(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with message = " + message);
    }
}
