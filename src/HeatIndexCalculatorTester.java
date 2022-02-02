import java.util.Scanner;
public class HeatIndexCalculatorTester {
    public static void main(String[] args) throws Exception {
        int currentTemp;
        double currentHumidity;
        System.out.println("Please Input the current temperature");
        Scanner scanner = new Scanner(System.in);

        currentTemp = scanner.nextInt();
        System.out.println("Please Input the current humidity as a percentage:");
        currentHumidity = scanner.nextDouble();
        scanner.close();
        HeatIndexCalculator calculator = new HeatIndexCalculator(currentTemp, currentHumidity);

        calculator.printHeatIndex();
    }
}
