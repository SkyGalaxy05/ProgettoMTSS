////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {

    @Test
    public void testConvertNumberOneToRomanI() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertNumberTwoToRomanII() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvertNumberThreeToRomanIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvertNumberFourToRomanIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvertNumberFiveToRomanV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvertNumberSixToRomanVI() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvertNumberZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(0);
        });
    }

    @Test
    public void testConvertNumberSevenThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            IntegerToRoman.convert(7);
        });
    }
}