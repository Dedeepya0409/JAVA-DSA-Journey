import java.util.Scanner;

public class Electricbill {
    public static void main(String []args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter consumerId:");
    long consumerId = sc.nextLong();
    sc.nextLine();

    System.out.println("Enter consumerName:");
    String consumerName = sc.nextLine();

    System.out.println("Enter previous meter reader:");
    int previousMeterReader = sc.nextInt();

    System.out.println("Enter current meter reader:");
    int currentMeterReader = sc.nextInt();

    System.out.println("Enter cost per unit:");
    float costPerUnit = sc.nextFloat();

    System.out.println("Enter your Fixed value:");
    float fixedvalue = sc.nextFloat();

    System.out.println("Enter Tax percentage:");
    double taxPercentage = sc.nextDouble();


    float unitsconsumed = currentMeterReader - previousMeterReader;
    double energyconsumed = unitsconsumed*costPerUnit; 
    double tax = (unitsconsumed  * taxPercentage)/100;
    double finalBill= energyconsumed + fixedvalue +taxPercentage;

    System.out.println("Your Final Bill is :" + finalBill);



    }
}
