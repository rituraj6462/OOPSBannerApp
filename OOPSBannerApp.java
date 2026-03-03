/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap
 * inner static class to encapsulate character-to-pattern mappings.
 * The application retrieves and displays the "OOPS" banner
 * using these stored mappings.
 *
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner static class to store character and its ASCII pattern.
     * Demonstrates encapsulation and modular design.
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern.
         *
         * @param character character to be mapped
         * @param pattern   7-line ASCII pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the mapped character.
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns ASCII pattern.
         *
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array.
     *
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

                new CharacterPatternMap('O', new String[]{
                        "  *****  ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        "  *****  "
                }),

                new CharacterPatternMap('P', new String[]{
                        " ******  ",
                        " *     * ",
                        " *     * ",
                        " ******  ",
                        " *       ",
                        " *       ",
                        " *       "
                }),

                new CharacterPatternMap('S', new String[]{
                        "  *****  ",
                        " *       ",
                        " *       ",
                        "  *****  ",
                        "       * ",
                        "       * ",
                        "  *****  "
                }),

                new CharacterPatternMap(' ', new String[]{
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          ",
                        "          "
                })
        };
    }

    /**
     * Retrieves pattern for a given character.
     *
     * @param ch      character to search
     * @param charMaps array of pattern maps
     * @return corresponding pattern or space pattern
     */
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // fallback to space
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints message as ASCII banner.
     *
     * @param message text to display
     * @param charMaps pattern maps
     */
    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }

    /**
     * Main Method – Entry point
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}