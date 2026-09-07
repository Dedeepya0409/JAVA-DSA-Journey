import java.util.Scanner;

public class TimeCoversion {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // long seconds = sc.nextLong();
        long seconds = 60;
        long minutes = seconds;
        long hour = seconds*seconds;
        long day = 24*seconds*seconds;
        long year = 365*24*seconds*seconds;

        System.out.println("One Minute=" +minutes);
        System.out.println("One Hour=" +hour);
        System.out.println("One Day=" +day);
        System.out.println("One Year="+year);

    }
}



