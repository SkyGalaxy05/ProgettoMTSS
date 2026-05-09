////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    private static final String[] LETTER_I = {
        " ___ ",
        "|_ _|",
        " | | ",
        " | | ",
        "|___|"
    };

    private static final String[] LETTER_V = {
        "__     __",
        "\\ \\   / /",
        " \\ \\ / / ",
        "  \\ V /  ",
        "   \\_/   "
    };

    private static final String[] LETTER_X = {
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " /_/ \\_\\"
    };

    private static final String[] LETTER_L = {
        " _     ",
        "| |    ",
        "| |    ",
        "| |___ ",
        "|_____|"
    };

    private static final String[] LETTER_C = {
        "  ____ ",
        " / ___|",
        "| |    ",
        "| |___ ",
        " \\____|"
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                asciiArt.append(getLetterRows(romanNumber.charAt(i))[row]);

                if (i < romanNumber.length() - 1) {
                    asciiArt.append("  ");
                }
            }

            asciiArt.append("\n");
        }

        return asciiArt.toString();
    }

    private static String[] getLetterRows(char romanLetter) {
        switch (romanLetter) {
            case 'I':
                return LETTER_I;
            case 'V':
                return LETTER_V;
            case 'X':
                return LETTER_X;
            case 'L':
                return LETTER_L;
            case 'C':
                return LETTER_C;
            default:
                throw new IllegalArgumentException("Lettera romana non supportata");
        }
    }
}
