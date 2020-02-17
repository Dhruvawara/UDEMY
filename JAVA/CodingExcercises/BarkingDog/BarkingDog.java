package CodingExcercises.BarkingDog;

/**
 * BarkingDog
 */
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 24) {
            return false;
        } else if (barking == true && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}