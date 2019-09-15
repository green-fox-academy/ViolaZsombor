import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give us a number how many chickens the farmer has");
        int chickens = scanner.nextInt();
        System.out.println("Give us a number how many pigs the farmer has");
        int pigs = scanner.nextInt();

        System.out.println("All of the farmer's animals have [" +((chickens*2) + (pigs*4)) + "] legs in total");
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
    }
}
