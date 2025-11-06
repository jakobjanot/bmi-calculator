public class Main {
    public static void main(String[] args) {
        double height = 1.75;
        double weight = 80;
        double bmi = calculateBmi(weight, height);
        System.out.println("Mit bmi er: " + bmi);
    }

    private static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }
}
