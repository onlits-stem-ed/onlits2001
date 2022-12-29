package local.onlits.onlits2001.classobject;
import java.awt.event.*;
public class FinalizeTest extends Object implements ActionListener {
    FinalizeTest() {
        System.out.println("Object created");
    }

    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }

    public static void main(String[] args) {
        // FinalizeTest ft = new FinalizeTest();
        // ft.finalize();
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
