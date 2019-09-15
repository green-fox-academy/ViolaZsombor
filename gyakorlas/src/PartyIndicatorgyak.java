import java.util.Scanner;

public class PartyIndicatorgyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give u the number of girls on the party: ");
        int girls = scanner.nextInt();
        System.out.println("Please give u the number of boys on the party: ");
        int boys = scanner.nextInt();

        if ((girls == boys) && ((girls + boys) > 20)) {
            System.out.println("the party is excellent");
        } else if ((girls != boys) && ((girls + boys) > 20)) {
            System.out.println("Quite cool party");
        } else if (girls + boys < 20) {
            System.out.println("Average Party");
        } else if (girls == 0) {
            System.out.println("Sausage Party");
        }
    }
}
