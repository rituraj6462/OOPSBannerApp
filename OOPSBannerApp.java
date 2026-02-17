/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This program stores each line of the OOPS banner in a String array
 * using String.join() and prints them using a for-each loop.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create String array with 7 lines
        String[] lines = new String[7];

        // Populate each line using String.join()
        lines[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " ******  ",
                " ******  ");

        lines[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *       ");

        lines[2] = String.join(" ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *****   ");

        lines[3] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "      *  ");

        lines[4] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                "      *  ");

        lines[5] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *    *  ");

        lines[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                " *****   ");

        // Use for-each loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
