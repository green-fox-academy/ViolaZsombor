import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(task(number));
    }


    public static int task(int input) {
        int sum = 0;
        for (int i = 0; i < input ; i++) {
            sum+=i;


        }
        return sum;
    }
}
