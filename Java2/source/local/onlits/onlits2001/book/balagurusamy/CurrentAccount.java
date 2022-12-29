package local.onlits.onlits2001.book.balagurusamy;

public class CurrentAccount extends Account {

    CurrentAccount() {
        typeOfAccount = "CA";
    }
    
    void checkMinimumBalance() {
        if(balance < 5000)
        {
            System.out.println("Failed to maintain minimum balance requirement. Penalty of Rs. 100 + 18% GST imposed");
            balance -= 118;
        }
    }
}