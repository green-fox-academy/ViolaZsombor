import java.util.Scanner;

public class OddEvengyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please gave us a number: ");
        int numb = scanner.nextInt();
        if (numb % 2 == 0) {
        System.out.println("Even");
        } else {   System.out.println("Odd");
        }

    }
}
