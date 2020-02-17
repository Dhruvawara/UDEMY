package CodingExcercises.DecimalComparator;

/**
 * DecimalComparator
 */
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a*=1000;
        b*=1000;
        if ((int)a==(int)b) {
            return true;
        } else {
            return false;
        }
    }
}