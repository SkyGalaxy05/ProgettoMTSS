////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
        "9, IX",
        "10, X",
        "11, XI",
        "12, XII",
        "13, XIII",
        "14, XIV",
        "15, XV",
        "16, XVI",
        "17, XVII",
        "18, XVIII",
        "19, XIX",
        "20, XX",
        "21, XXI",
        "22, XXII",
        "23, XXIII",
        "24, XXIV",
        "25, XXV",
        "26, XXVI",
        "27, XXVII",
        "28, XXVIII",
        "29, XXIX",
        "30, XXX",
        "31, XXXI",
        "32, XXXII",
        "33, XXXIII",
        "34, XXXIV",
        "35, XXXV",
        "36, XXXVI",
        "37, XXXVII",
        "38, XXXVIII",
        "39, XXXIX",
        "40, XL",
        "41, XLI",
        "42, XLII",
        "43, XLIII",
        "44, XLIV",
        "45, XLV",
        "46, XLVI",
        "47, XLVII",
        "48, XLVIII",
        "49, XLIX",
        "50, L"
    })
    public void testConvertNumberToRoman(int number, String expectedRomanNumber) {
        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberZeroThrowsException() {
        int number = 0;

        Executable conversion = () -> IntegerToRoman.convert(number);

        assertThrows(IllegalArgumentException.class, conversion);
    }

    @Test
    public void testConvertNumberFiftyOneThrowsException() {
        int number = 51;

        Executable conversion = () -> IntegerToRoman.convert(number);

        assertThrows(IllegalArgumentException.class, conversion);
    }
}
