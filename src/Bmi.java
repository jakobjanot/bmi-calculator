public class Bmi {
    public static double calculateBmi(double weight, double height) {
        return 2 * height / (4 * weight * weight - 1);
    }
}
