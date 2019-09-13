import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me 5 numbers spaced apart: ");
        int numb1=scanner.nextInt();
        int numb2=scanner.nextInt();
        int numb3=scanner.nextInt();
        int numb4=scanner.nextInt();
        int numb5=scanner.nextInt();
        int sum = (numb1 + numb2 + numb3 + numb4 + numb5);
        double avg = ((numb1 + (double)numb2 + numb3 + numb4 + numb5) / 5 ) ;
        System.out.println("Sum: " + sum +" , " + "Average:" + avg +"." );

    }
}
