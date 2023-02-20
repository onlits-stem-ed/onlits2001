import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

interface TestInterface {

}

class ImplementTestInterface implements TestInterface {

}

class Factory {
    static TestInterface returnTestInterface() {
        return new ImplementTestInterface();
    }
}

class ObjectVsInstanceTest {
    public static void main(String[] args) {
        System.out.println(new ObjectVsInstance());
        ObjectVsInstance objectVsInstance = new ObjectVsInstance();
        System.out.println(objectVsInstance);
        ObjectVsInstance objectVsInstance2  = objectVsInstance;
        System.out.println(objectVsInstance2);

        TestInterface testInterface = Factory.returnTestInterface();
        System.out.println(testInterface);

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost","2001", "2001");
            System.out.println(con);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}