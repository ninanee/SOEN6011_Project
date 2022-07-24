/**
 * Author: Yun Ni
 * Student ID: 40179775
 */

public class ExponentFunction {
    /** The Constant E. */
    public static final double E = 2.7182818284590451;

    /** The Constant EXPANSION. */
    public static final int EXPANSION = 60; // The default Taylor expansion times

    /** The Constant LN2. */
    public static final double LN2 = 0.6931471805599453; // Math.LN2 is approximately 0.6931471805599453;

    /**
     * Calculate the value of a*(b^x).
     *
     * @param a double
     * @param b base number,double
     * @param x exponent number,double
     * @return ab^x double
     * @throws Exception the exception
     */
    public static double calculate(double a, double b, double x) throws Exception {
        if (a == 0) return 0;
        return a * power(b, x);
    }

    /**
     * Ex.
     *
     * @param x the x
     * @param n the n
     * @return the double
     */

    /**
     * Calculate the value of e^x.
     *
     * @param x exponent number,double
     * @param n the number of Taylor expansions,integer
     * @return e^x double
     */
    public static double ex(double x, int n) {
        double result = 1.0, tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
            result += power(x, i) / tmp;
        }
        return result;
    }

    /**
     * Ln base.
     *
     * @param x domain is (0,2],double
     * @param n the number of Taylor expansions, integer
     * @return ln(x) double
     */
    public static double lnBase(double x, int n) {
        x -= 1;
        int factor = 1;
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += factor * power(x, i) / i;
            factor = -factor;
        }
        return result;
    }

    /**
     * Calculate the value of ln(x).
     *
     * @param x double
     * @return ln(x) double
     * @throws Exception the exception
     */
    public static double ln(double x) throws Exception {
        if (x <= 0) throw new Exception("math range error");
        double result = 0.0;
        while (x > 2) {
            result += LN2;
            x /= 2;
        }
        result += lnBase(x, EXPANSION);
        return result;
    }

    /**
     * Calculate the value of a^x.
     *
     * @param a the base number,double
     * @param x the exponent number,integer
     * @return a^x double
     */
    public static double power(double a, int x) {
        if (x == 0) return 1.0;
        if (a == 0) return 0.0;

        int b = x;
        if (b < 0) b = -b;

        double r = a, y = 1;
        while (b > 0) {
            if (b % 2 == 0) {
                b = b / 2;
                r = r * r;
            } else {
                b = b - 1;
                y = y * r;
            }
        }
        if (x < 0)
            return 1/y;
        else
            return y;
    }

    /**
     * Calculate the value of a^x.According to a^x=e^(x*ln(a))
     *
     * @param a base number,double
     * @param x exponent number,double
     * @return a^x double
     * @throws Exception the exception
     */
    public static double power(double a, double x) throws Exception {
        if (x == 0) return 1.0;
        if (a == 0) return 0.0;

        double exponential = x * ln(a);
        // If the value of exponential is too large, substituting exp into the function
        // The e^x may cause overflow.
        int integer = (int) exponential;
        double decimal = exponential - integer;
        return power(E, integer) * ex(decimal, EXPANSION);
    }

    /**
     * Calculate absolute value of the input number.
     *
     * @param x double type
     * @return absolute value of x, double type
     */
    public static double abs(double x) {
        if (x < 0) x = -x;
        return x;
    }
}
