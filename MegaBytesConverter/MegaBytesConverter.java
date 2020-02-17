package MegaBytesConverter;

/**
 * MegaBytesConverter
 */
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.print("Invalid Value");
        } else {
            System.out.print(kiloBytes + " KB = " + (int) (kiloBytes / 1024) + " MB and " + kiloBytes % 1024 + " KB");
        }
    }
}