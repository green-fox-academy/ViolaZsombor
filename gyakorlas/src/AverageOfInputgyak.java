import java.util.Scanner;

public class AverageOfInputgyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us 5 numbers separated with space");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        double total = ((number1+number2+number3+number4+number5));


        System.out.println("The numbers you gave:"+ number1 +", "+ number2 +", "+ number3 +", "+ number4 +", "+ number5);
        System.out.println("Sum: " +total);
        System.out.println("Average: " + (total/5));

    }
}

