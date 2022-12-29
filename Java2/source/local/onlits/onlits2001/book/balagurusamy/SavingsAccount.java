package local.onlits.onlits2001.book.balagurusamy;

public class SavingsAccount extends Account {

    SavingsAccount()
    {
        typeOfAccount = "SA";
    }

    void computeInterest() {
        double si;
        float p = balance;
        float r = 4.0f;
        float t = 1;

        si = (p * r/4.0f * t) / 100;

        System.out.println("Quarterly Interest is " + si);
        balance += si;
    }
}
