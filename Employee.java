import java.util.Scanner;

public class Employee {
    private int eNo;
    private String eName;
    private double eSalary;

    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public int getENo() {
        return eNo;
    }

    public String getEName() {
        return eName;
    }

    public double getESalary() {
        return eSalary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        // Read employee information
        for (int i = 0; i < n; i++) {
            System.out.print("Enter eNo for employee " + (i+1) + ": ");
            int eNo = scanner.nextInt();
            System.out.print("Enter eName for employee " + (i+1) + ": ");
            String eName = scanner.next();
            System.out.print("Enter eSalary for employee " + (i+1) + ": ");
            double eSalary = scanner.nextDouble();

            employees[i] = new Employee(eNo, eName, eSalary);
        }

        // Search for an employee by eNo
        System.out.print("Enter the eNo of the employee you want to search for: ");
        int searchENo = scanner.nextInt();

        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getENo() == searchENo) {
                System.out.println("Employee found: " + emp.getEName() + " - " + emp.getESalary());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}

