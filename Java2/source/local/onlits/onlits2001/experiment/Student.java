package local.onlits.onlits2001.experiment;

public class Student {
    private String name;
    private int age;
    private String phoneNumber;
    private int boardMarks;
    private static int studentCount;

    Student(String name, int age, String phoneNumber, int boardMarks) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.boardMarks = boardMarks;
    }

    void eligible() {
        if (boardMarks > 40)
            System.out.println("Eligible");
        else
            System.out.println("Not-eligible");
    }

    static void increaseStudentCount() {
        studentCount++;
    }

    static void printStudentCount() {
        System.out.println("Total student count is: " + studentCount);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raju Kumar", 20, "8456953258", 56);
        s1.eligible();
        Student.increaseStudentCount();
        Student s2 = new Student("Ujjwal Kumar", 21, "7458236985", 35);
        s2.eligible();
        Student.increaseStudentCount();
        Student.printStudentCount();
    }
}
