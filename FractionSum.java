
public class FractionSum {
    
    // Function to find GCD (Greatest Common Divisor)
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Example fractions
        int num1 = 1, den1 = 3;  // first fraction = 1/3
        int num2 = 2, den2 = 5;  // second fraction = 2/5

        // Calculate numerator and denominator of result
        int numerator = (num1 * den2) + (num2 * den1);
        int denominator = den1 * den2;

        // Simplify fraction
        int gcdValue = gcd(numerator, denominator);
        numerator /= gcdValue;
        denominator /= gcdValue;

        // Print result
        System.out.println("Sum of fractions = " + numerator + "/" + denominator);
    }
}
