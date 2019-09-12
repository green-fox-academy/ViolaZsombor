import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how many chickens the farmer has? ");
        int chikens = scanner.nextInt();
        System.out.println("The farmer has " + chikens + " chickens.");
        System.out.println("Tell me how many pigs the farmer has? ");
        int pigs = scanner.nextInt();
        System.out.println("The farmer has " + pigs + " chickens.");
        int legs = (pigs*4) + (chikens*2);
        System.out.println("So in total All the animals have " + legs + " legs.");


    }
}
