import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me 2 numbers spaced apart: ");
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        if (numb1 > numb2) {
            System.out.println(numb1);

        } else  {
            System.out.println(numb2);
        }
    }
}
