import java.util.Scanner;

public class BankAccountPrecision {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter account number:");
        long accountNumber = sc.nextLong();
        sc.nextLine();  

        System.out.println("enter account holder name:");
        String accountHoldername = sc.nextLine();

        System.out.println("enter initial balance:");
        double initialBalance = sc.nextDouble();

        System.out.println("the amount you wanted to withdraw:");
        double withdraw = sc.nextDouble();

        System.out.println("enter interest rate:");
        double interestRate = sc.nextDouble();

        System.out.println("enter deposit amount:");
        double depositamount = sc.nextDouble();

        System.out.println("how many number of years:");
        int numberofyears = sc.nextInt();

        
        double balance = initialBalance + depositamount - withdraw;
        double simpleinterest = (balance*interestRate*numberofyears)/100;
        double finalBalance = balance + simpleinterest;

        System.out.printf("%.2f", finalBalance);

    }
}
