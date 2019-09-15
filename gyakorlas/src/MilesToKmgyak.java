import java.util.Scanner;


public class MilesToKmgyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us a double as a distance in mile, and we will convert it to km (like this:2,3)");
        Double miletokm = scanner.nextDouble();
        System.out.println("The distance you gave is " + (miletokm*1.609)+ " in km.");
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}
