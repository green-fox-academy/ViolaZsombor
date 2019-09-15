import java.util.Scanner;

public class CountTogyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease give us 2 numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("The second number must be bigger");
        } else {
            for (int i = a; i < b; i++) {
                System.out.println(i);
            }

        }
    }
}
