public class Bmi {
    public static void main(String[] args) {
        double massInkg = 81.2;
        double heightInM = 1.78;

        System.out.println(Math.round(massInkg / (heightInM * heightInM)));

    }
}
