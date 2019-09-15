import java.util.Scanner;

public class OneTwoALotgyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease give u a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Not enough");
        } else if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else  {
            System.out.println("A lot");
        }
    }
}
