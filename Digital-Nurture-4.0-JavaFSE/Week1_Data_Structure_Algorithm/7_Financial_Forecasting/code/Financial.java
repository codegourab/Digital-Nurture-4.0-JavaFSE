public class Financial {

    public static double forecastValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }

        return forecastValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 10000;      
        double annualGrowthRate = 0.10;   
        int years = 5;

        double futureValue = forecastValue(presentValue, annualGrowthRate, years);

        System.out.println("Future value after " + years + " years: ₹" + futureValue);
    }
}
