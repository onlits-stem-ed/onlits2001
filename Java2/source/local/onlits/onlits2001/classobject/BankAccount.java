package local.onlits.onlits2001.classobject;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.io.Console;

public class BankAccount {
    private int acNo; // Instance variable
    private String name;
    private String acType;
    private float balance;

    BankAccount() {
    }

    BankAccount(int acNo) {
        this.acNo = acNo;
    }

    public void authenticate() {
        Scanner scan = new Scanner(System.in);
        Console console = System.console();
        System.out.print("Enter user id: ");
        String userid = scan.next();
        System.out.print("Enter password: ");
        char[] pass = console.readPassword();
        String password = new String(pass);
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
            String sql = "SELECT * FROM user WHERE user_id=? AND password=PASSWORD(?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, userid);
            stmt.setString(2, password);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                menu();
            } else {
                System.out.println("\n Invalid user id or password");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void menu() {
        int ch;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("MAIN MENU");
            System.out.println("1. New Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Print Account");
            System.out.println("5. Print Statement");
            System.out.println("6. Check AQB");
            System.out.println("7. Check Interest");            
            System.out.print("Enter choice (0 to exit): ");
            ch = scan.nextInt();
            switch (ch) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    newAccount();
                    // scan.close();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    printAccount();
                    break;
                case 5:
                    printStatement();
                    break;
                case 6:
                    getAQB();
                    break;
                case 7:
                    getInterest();
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }
    }

    public void newAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter depositor name: ");
        name = scan.nextLine();
        System.out.print("Enter account type (SA/CA): ");
        acType = scan.next();
        System.out.print("Enter initial balance: ");
        balance = scan.nextFloat();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO account(name, actype) VALUES('" + name + "', '" + acType + "')";
            stmt.executeUpdate(sql);
            System.out.println("Account created successfully!");
        } catch (SQLException ex) {
            System.out.println("MyError: " + ex.toString());
        }
    }

    public void editAccount() {

    }

    public int checkAccount() {
        int stat = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acNo = scan.nextInt();
        String sql = "SELECT * FROM account WHERE acno=" + acNo;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_2001", "2001", "2001");
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                stat = 1;
                name = result.getString("name");
                acType = result.getString("actype");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            // TODO: handle exception
        }
        return stat;
    }

    public void getBalance() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
            Statement stmt = con.createStatement();
            String sql = "SELECT ((IFNULL((SELECT SUM(amount) FROM transaction WHERE acno=" + acNo
                    + " AND type='Cr'), 0)) - (IFNULL((SELECT SUM(amount) FROM transaction WHERE acno=" + acNo
                    + " AND type='Dr'),0))) AS balance";
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                balance = result.getFloat("balance");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void printAccount() {
        if (checkAccount() == 1) {
            getBalance();
            System.out.println("\nAccount number: " + acNo);
            System.out.println("Name: " + name);
            System.out.println("Account Type: " + acType);
            System.out.println("Account Balance: " + balance);
        } else {
            System.out.println("\nAccount not found!\n");
        }
        System.out.println();
    }

    public void deposit() {
        if (checkAccount() == 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Name: " + name);
            System.out.print("Continue? (y/n): ");
            String c = scan.next();
            if (c.equals("n")) {
                return;
            }
            System.out.print("Enter amount: ");
            float amount = scan.nextFloat();
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
                Statement stmt = con.createStatement();

                // ----------- Fetching old balance ------------------
                String sql = "SELECT balance FROM transaction WHERE acno=" + acNo + " ORDER BY id DESC LIMIT 1";
                ResultSet result = stmt.executeQuery(sql);
                if (result.next()) {
                    balance = result.getFloat("balance");
                }
                balance += amount;

                // ----------- Updating transaction --------------------
                sql = "INSERT INTO transaction(date, acno, particulars, type, amount, balance) VALUES(CURDATE(), "
                        + acNo
                        + ", 'Cash Deposited', 'Cr', " + amount + ", " + balance + ")";
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            System.out.println("\nAmount credited!\n");
        } else {
            System.out.println("\nAccount not found!\n");
        }
    }

    public void withdraw() {
        if (checkAccount() == 1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Name: " + name);
            System.out.print("Continue? (y/n): ");
            String c = scan.next();
            if (c.equals("n")) {
                return;
            }
            System.out.print("Enter amount: ");
            float amount = scan.nextFloat();
            getBalance();
            if (balance >= amount) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
                    Statement stmt = con.createStatement();
                    // ----------- Fetching old balance ------------------
                    String sql = "SELECT balance FROM transaction WHERE acno=" + acNo + " ORDER BY id DESC LIMIT 1";
                    ResultSet result = stmt.executeQuery(sql);
                    if (result.next()) {
                        balance = result.getFloat("balance");
                    }
                    balance -= amount;

                    // ----------- Updating transaction --------------------
                    sql = "INSERT INTO transaction(date, acno, particulars, type, amount, balance) VALUES(CURDATE(), "
                            + acNo
                            + ", 'Cash Withdraw', 'Dr', " + amount + ", " + balance + ")";
                    stmt.executeUpdate(sql);
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
                System.out.println("\nAmount debited!\n");
            } else {
                System.out.println("\nTransaction declined. Insufficient balance.\n");
            }
        } else {
            System.out.println("\nAccount not found!\n");
        }
    }

    void horizontalRule(int size) {
        for (int i = 1; i <= size; i++)
            System.out.print("-");
        System.out.println();
    }

    public void printStatement() {
        if (checkAccount() == 1) {
            System.out.println("ACCOUNT STATEMENT");
            System.out.println("Account Number: " + acNo);
            System.out.println("Account Name: " + name);
            getBalance();
            System.out.println("Balance: " + balance);
            horizontalRule(80);
            System.out.printf("%-5s%-15s%-30s%-10s%-10s%-10s\n", "Sl#", "Date", "Particulars", "Cr/Dr", "Amount",
                    "Balance");
            horizontalRule(80);
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
                Statement stmt = con.createStatement();
                String sql = "SELECT * FROM transaction WHERE acno=" + acNo;
                ResultSet result = stmt.executeQuery(sql);
                int i = 1;
                while (result.next()) {
                    System.out.printf("%-5d%-15s%-30s%-10s%10.2f%10.2f\n", i, result.getString("date"),
                            result.getString("particulars"), result.getString("type"), result.getFloat("amount"),
                            result.getFloat("balance"));
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            horizontalRule(80);
        }
    }

    void getAQB() {
        if (checkAccount() == 1) {
            float sum = 0.0f;
            float aqb;
            int days = 0;
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
                Statement stmt = con.createStatement();

                String sql = "SELECT date FROM transaction WHERE acno=" + acNo + " ORDER BY id LIMIT 1";
                ResultSet result = stmt.executeQuery(sql);
                if (result.next()) {
                    LocalDate stDate = LocalDate.parse(result.getString("date"));
                    while (!stDate.equals(LocalDate.of(2022, 7, 1))) {
                        sql = "SELECT balance FROM transaction WHERE date='" + stDate + "' AND acno=" + acNo
                                + " ORDER BY id DESC LIMIT 1";
                        result = stmt.executeQuery(sql);
                        if (result.next()) {
                            balance = result.getFloat("balance");
                        }
                        sum += balance;
                        days++;
                        stDate = stDate.plusDays(1);
                    }
                    aqb = sum / days;
                    System.out.println("AQB = " + aqb);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    void getInterest() {
        if (checkAccount() == 1) {
            float dailyInterest=0, totalInterest=0;
            
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
                Statement stmt = con.createStatement();

                String sql = "SELECT date FROM transaction WHERE acno=" + acNo + " ORDER BY id LIMIT 1";
                ResultSet result = stmt.executeQuery(sql);
                if (result.next()) {
                    LocalDate stDate = LocalDate.parse(result.getString("date"));
                    while (!stDate.equals(LocalDate.of(2022, 7, 1))) {
                        sql = "SELECT balance FROM transaction WHERE date='" + stDate + "' AND acno=" + acNo
                                + " ORDER BY id DESC LIMIT 1";
                        result = stmt.executeQuery(sql);
                        if (result.next()) {
                            balance = result.getFloat("balance");
                            dailyInterest = (balance * 2.7f/100.0f)/365.0f;
                        }
                        totalInterest += dailyInterest;
                        stDate = stDate.plusDays(1);
                    }
                    System.out.println("\nInterest = " + totalInterest);
                    Scanner scan = new Scanner(System.in);
                    System.out.println(stDate);
                    System.out.println(scan);
                    System.out.println(con);
                    System.out.println(stmt);

                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    float balanceUptoDate(String from, String to) {
        float balance = 0.0f;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank_2001", "2001", "2001");
            Statement stmt = con.createStatement();
            String sql = "SELECT ((IFNULL((SELECT SUM(amount) FROM transaction WHERE acno=" + acNo
                    + " AND type='Cr' AND date BETWEEN '" + from
                    + "' AND '" + to + "'), 0)) - (IFNULL((SELECT SUM(amount) FROM transaction WHERE acno=" + acNo
                    + " AND type='Dr' AND date BETWEEN '" + from + "' AND '" + to + "'),0))) AS balance";
            ResultSet result = stmt.executeQuery(sql);
            if (result.next()) {
                balance = result.getFloat("balance");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return balance;
    }

    public static void main(String[] args) {
        // System.out.println(new BankAccount(1).balanceUptoDate("2022-04-01",
        // "2022-04-24"));
        new BankAccount().authenticate();
        // new BankAccount(1).getAQB();
    }
}