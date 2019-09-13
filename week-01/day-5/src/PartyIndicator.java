import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me 2 numbers spaced apart: ");
        int girls = scanner.nextInt();
        int guys = scanner.nextInt();
        int total = girls + guys;
        if (girls == 0) {
            System.out.println("Sausage party!");
        }
        else {
            if (total >= 20) {
                if ((girls == guys) ) {
                    System.out.println("The party is excellent!");
                }else  {
                    System.out.println("Quite cool party!");
                }

            } else {
                System.out.println("Average party!");
            }
        }

    }


}
