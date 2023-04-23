public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55;
        double height = 1.70;
        double Bmi = service.calculate(weight, height);
        System.out.println(Bmi);

    }
}
