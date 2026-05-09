////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @Test
    public void testConvertNumberOneToRomanI() {
        int number = 1;
        String expectedRomanNumber = "I";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberTwoToRomanII() {
        int number = 2;
        String expectedRomanNumber = "II";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberThreeToRomanIII() {
        int number = 3;
        String expectedRomanNumber = "III";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberFourToRomanIV() {
        int number = 4;
        String expectedRomanNumber = "IV";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberFiveToRomanV() {
        int number = 5;
        String expectedRomanNumber = "V";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberSixToRomanVI() {
        int number = 6;
        String expectedRomanNumber = "VI";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberSevenToRomanVII() {
        int number = 7;
        String expectedRomanNumber = "VII";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberEightToRomanVIII() {
        int number = 8;
        String expectedRomanNumber = "VIII";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberNineToRomanIX() {
        int number = 9;
        String expectedRomanNumber = "IX";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberTenToRomanX() {
        int number = 10;
        String expectedRomanNumber = "X";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberElevenToRomanXI() {
        int number = 11;
        String expectedRomanNumber = "XI";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberTwelveToRomanXII() {
        int number = 12;
        String expectedRomanNumber = "XII";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberThirteenToRomanXIII() {
        int number = 13;
        String expectedRomanNumber = "XIII";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberFourteenToRomanXIV() {
        int number = 14;
        String expectedRomanNumber = "XIV";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberFifteenToRomanXV() {
        int number = 15;
        String expectedRomanNumber = "XV";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberSixteenToRomanXVI() {
        int number = 16;
        String expectedRomanNumber = "XVI";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberSeventeenToRomanXVII() {
        int number = 17;
        String expectedRomanNumber = "XVII";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberEighteenToRomanXVIII() {
        int number = 18;
        String expectedRomanNumber = "XVIII";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberNineteenToRomanXIX() {
        int number = 19;
        String expectedRomanNumber = "XIX";

        String romanNumber = IntegerToRoman.convert(number);

        assertEquals(expectedRomanNumber, romanNumber);
    }

    @Test
    public void testConvertNumberTwentyToRomanXX() {
        int number = 20;
        String expectedRomanNumber = "XX";

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
    public void testConvertNumberTwentyOneThrowsException() {
        int number = 21;

        Executable conversion = () -> IntegerToRoman.convert(number);

        assertThrows(IllegalArgumentException.class, conversion);
    }
}
