public class Main {
    public static void main(String[] args) {
        double height = 1.79;
        double weight = 80;
        double bmi = Bmi.calculateBmi(weight, height);
        System.out.println("Mit bmi er: " + bmi);
    }
}
