package local.onlits.onlits2001.principles.di.ex2;

public class MyMessageDITest {
    public static void main(String[] args) {
        String message = "Hi Mrityunjay";
        String email = "mrityunjay.kumar@onlits.com";
        String phone = "9856236589";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(message, email);

        //send sms
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(message, phone);

    }
}
