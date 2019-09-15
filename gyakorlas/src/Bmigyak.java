public class Bmigyak {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        // BMI metric formula: weight (kg) / (height (m))^2
        System.out.println("the Body mass index (BMI) based on these values is: " + Math.round((massInKg)) /(heightInM*heightInM));
    }
}
