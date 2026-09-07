

// import java.util.Scanner;



// public class StudentReport {
//     public static void main(String args[]){

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter Name:");
//     String name = sc.nextLine();

//     System.out.println("Enter Rollno:");
//     int rollno = sc.nextInt();

//     System.out.println("Enter Age:");
//     int age = sc.nextInt();

//     System.out.println("CGPA:");
//     double cgpa = sc.nextDouble();

//         System.out.println("-----STUDENT REPORT-----");
//         System.out.println("Name: "+name);
//         System.out.println("RollNumber: "+rollno);
//         System.out.println("Age: "+age);
//         System.out.println("CGPA: %.2f"+cgpa);
     




//     }
    
   

// }


import java.util.Scanner;

public class StudentReport {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Rollno:");
        int rollno = sc.nextInt();

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        System.out.println("Enter Branch:");
        String branch = sc.nextLine();

        System.out.println("CGPA:");
        double cgpa = sc.nextDouble();

        System.out.println("----- STUDENT REPORT -----");

        System.out.println("Name       : " + name);
        System.out.println("RollNumber : " + rollno);
        System.out.println("Age        : " + age);
        System.out.println("Branch     : " + branch);
        System.out.printf("CGPA       : %.2f%n", cgpa);

        
    }
}