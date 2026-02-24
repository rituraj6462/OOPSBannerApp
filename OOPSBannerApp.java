/**
 * OOPSBannerApp UC6 – Refactor Banner Logic into Functions
 *
 * This use case improves modularity by defining separate
 * methods for each character pattern (O, P, S).
 *
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method to generate pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Method to generate pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method to generate pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }

    // Main method
    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to assemble and print OOPS
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + "  " +
                    oPattern[i] + "  " +
                    pPattern[i] + "  " +
                    sPattern[i]
            );
        }
    }
}