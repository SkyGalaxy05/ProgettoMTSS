////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {

    @Test
    public void testPrintNumberTwentyAsAsciiArtXX() {
        int number = 20;
        String expectedAsciiArt = "__   __  __   __\n"
            + "\\ \\ / /  \\ \\ / /\n"
            + " \\ V /    \\ V / \n"
            + "  > <      > <  \n"
            + " /_/ \\_\\   /_/ \\_\\\n";

        String asciiArt = RomanPrinter.print(number);

        assertEquals(expectedAsciiArt, asciiArt);
    }

    @Test
    public void testPrintNumberFiftyOneThrowsException() {
        int number = 51;

        Executable printing = () -> RomanPrinter.print(number);

        assertThrows(IllegalArgumentException.class, printing);
    }
}
