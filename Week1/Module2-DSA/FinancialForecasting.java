public class FinancialForecasting {

    // Recursive method to calculate future value
    // Formula: FV = PV * (1 + rate)^years
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case - stop condition
        if (years == 0) {
            return presentValue;
        }
        // Recursive case - calls itself with years-1
        return calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000; // starting amount
        double growthRate = 0.08;     // 8% growth per year
        int years = 5;

        double futureValue = calculateFutureValue(initialAmount, growthRate, years);

        System.out.println("Initial Amount: " + initialAmount);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);
        System.out.println("Predicted Future Value: " + futureValue);
    }
}