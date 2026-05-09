////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    private static final int[] ARABIC_NUMBERS = {10, 9, 5, 4, 1};
    private static final String[] ROMAN_NUMBERS = {"X", "IX", "V", "IV", "I"};

    public static String convert(int number) {
        if (number < 1 || number > 20) {
            throw new IllegalArgumentException(
                "Numero fuori dal range consentito (1-20)");
        }

        StringBuilder romanNumber = new StringBuilder();

        for (int i = 0; i < ARABIC_NUMBERS.length; i++) {
            while (number >= ARABIC_NUMBERS[i]) {
                romanNumber.append(ROMAN_NUMBERS[i]);
                number -= ARABIC_NUMBERS[i];
            }
        }

        return romanNumber.toString();
    }
}
