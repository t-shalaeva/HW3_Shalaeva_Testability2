public class BmiService {
    public static int calculate(double weightKg, double heightM) {
        double index = weightKg / (heightM * heightM);
        return (int) index;
    }
}
