import java.util.Scanner;

public class DigitalStorageConverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many bytes:");
        long bytes = sc.nextLong();
        long Bytes = bytes;
        long kiloBytes = bytes/1024L;
        long megaBytes = bytes/(1024L*1024);
        long gigaBytes = bytes/(1024L*1024*1024);
        long teraBytes = bytes/(1024L*1024*1024*1024);

        System.out.printf("Bytes: %d%n",+Bytes);
        System.out.printf("KiloBytes:%d%n ",+kiloBytes);
        System.out.printf("MegaBytes:%d%n ",+megaBytes);
        System.out.printf("GigaBytes:%d%n ",+gigaBytes);
        System.out.printf("TeraBytes:%d%n ",+teraBytes);




    }
}
