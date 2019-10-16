import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("please give me a number how big triangle you want to see: ");
        Scanner scanner = new Scanner(System.in);
        int askedNumber= scanner.nextInt();

        for (int i = 1; i <=askedNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = askedNumber-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
