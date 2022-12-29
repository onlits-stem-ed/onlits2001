package local.onlits.onlits2001.principles.di.ex2;

public class SMSServiceInjector implements MessageServiceInjector
{

    public MyDIApplication getConsumer() {
        return new MyDIApplication(new SMSService());
    }
}