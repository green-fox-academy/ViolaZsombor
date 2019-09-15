import java.util.Scanner;

public class PrintBiggergyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease give u 2 numbers separated by space");
        int biggnumb = scanner.nextInt();
        int bignumb2 = scanner.nextInt();
        if (biggnumb > bignumb2) {
            System.out.println("The bigger number is " +biggnumb);
        } else{
            System.out.println("The bigger number is " +bignumb2);
        }
    }
}
