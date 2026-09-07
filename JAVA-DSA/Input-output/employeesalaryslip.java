import java.util.Scanner;

public class employeesalaryslip {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Employee name: ");
        String name = sc.nextLine();

        System.out.println("Employee id : ");
        String id = sc.nextLine();

        System.out.println("Basic Salary: ");
        double salary = sc.nextDouble();

        System.out.println("HRA: ");
        double hra = sc.nextDouble();

        System.out.println("DA: ");
        double da = sc.nextDouble();

        System.out.println("Tax %: ");
        double taxPercent = sc.nextDouble();

    
        double grossSalary = salary + hra + da;

        double tax = grossSalary * taxPercent / 100;

        double netSalary = grossSalary - tax;

        System.out.println();
        System.out.println("----- EMPLOYEE SALARY SLIP -----");

        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);

        System.out.printf("Basic Salary  : %.2f%n", salary);
        System.out.printf("HRA           : %.2f%n", hra);
        System.out.printf("DA            : %.2f%n", da);
        System.out.printf("Gross Salary  : %.2f%n", grossSalary);
        System.out.printf("Tax Amount    : %.2f%n", tax);
        System.out.printf("Net Salary    : %.2f%n", netSalary);

    }
}