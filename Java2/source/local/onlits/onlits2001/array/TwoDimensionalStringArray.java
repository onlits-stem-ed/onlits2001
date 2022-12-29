package local.onlits.onlits2001.array;
public class TwoDimensionalStringArray {
    public static void main(String[] args) {
        String[][] employees = {
            {"E001", "Mrityunjay", "SWE2"},
            {"E002", "Pawan Kumar", "SWE2"},
            {"E003", "Venkatragavan Krishna Aiyar", "SWE4"}
        };

        System.out.printf("%-15s%-30s%s\n", "Employee Id", "Employee Name", "Designation");
        for (String[] employee : employees) {
            System.out.printf("%-15s%-30s%s\n", employee[0], employee[1], employee[2]);
        }
    }
}