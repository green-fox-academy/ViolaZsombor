import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
           // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a decimal wich represent a distance in mile");

     double mile = scanner.nextDouble();
     double km = mile   * 1.6;
        System.out.println("The distance " + mile + " mile you gave is " + km + " in km");





    }
}