import java.lang.Math;
import java.text.DecimalFormat;

public class HeatIndexCalculator {
    private int temperature;
    private double humidity;
    private double heatIndex;

    public HeatIndexCalculator(int currentTemp, double currentHumidity) {
        this.temperature = currentTemp;
        this.humidity = currentHumidity;
        this.heatIndex = calculateHeatIndex(this.temperature, this.humidity);
    }


    public double calculateHeatIndex(int currentTemp, double currentHumidity) {
        int T = currentTemp;
        double R = currentHumidity;
        double c1 = -42.379;
        double c2 = 2.04901523;
        double c3 = 10.14333127;
        double c4 = -0.22475541;
        double c5 = -6.83783 * Math.pow(10, -3);
        double c6 = -5.481717 * Math.pow(10, -2);
        double c7 = 1.22874 * Math.pow(10, -3);
        double c8 = 8.5282 * Math.pow(10, -4);
        double c9 = -1.99 * Math.pow(10, -6);

        double HI = c1 + (c2 * T) + (c3 * R) + (c4 * T * R) + (c5 * Math.pow(T, 2)) + (c6 * Math.pow(R, 2))
                + (c7 * Math.pow(T, 2) * R) + (c8 * T * Math.pow(R, 2)) + (c9 * Math.pow(T, 2) * Math.pow(R, 2));
        return HI;
    }

    public void printHeatIndex(){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("At a temperature of " + this.temperature + " and a humidity of " + this.humidity + " percent...");
        System.out.println("It actually feels like: " + df.format(this.heatIndex) + "F");
    }
}
