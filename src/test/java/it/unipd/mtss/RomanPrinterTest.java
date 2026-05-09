////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {

    @Test
    public void testCreateRomanPrinter() {
        RomanPrinter romanPrinter = new RomanPrinter();

        assertNotNull(romanPrinter);
    }

    @Test
    public void testPrintNumberOneAsAsciiArtI() {
        int number = 1;
        String expectedAsciiArt = " ___ \n"
            + "|_ _|\n"
            + " | | \n"
            + " | | \n"
            + "|___|\n";

        String asciiArt = RomanPrinter.print(number);

        assertEquals(expectedAsciiArt, asciiArt);
    }

    @Test
    public void testPrintNumberFiveAsAsciiArtV() {
        int number = 5;
        String expectedAsciiArt = "__     __\n"
            + "\\ \\   / /\n"
            + " \\ \\ / / \n"
            + "  \\ V /  \n"
            + "   \\_/   \n";

        String asciiArt = RomanPrinter.print(number);

        assertEquals(expectedAsciiArt, asciiArt);
    }

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
    public void testPrintNumberFiftyAsAsciiArtL() {
        int number = 50;
        String expectedAsciiArt = " _     \n"
            + "| |    \n"
            + "| |    \n"
            + "| |___ \n"
            + "|_____|\n";

        String asciiArt = RomanPrinter.print(number);

        assertEquals(expectedAsciiArt, asciiArt);
    }

    @Test
    public void testPrintNumberOneHundredAsAsciiArtC() {
        int number = 100;
        String expectedAsciiArt = "  ____ \n"
            + " / ___|\n"
            + "| |    \n"
            + "| |___ \n"
            + " \\____|\n";

        String asciiArt = RomanPrinter.print(number);

        assertEquals(expectedAsciiArt, asciiArt);
    }

    @Test
    public void testPrintNumberFiveHundredAsAsciiArtD() {
        int number = 500;
        String expectedAsciiArt = " ____  \n"
            + "|  _ \\ \n"
            + "| | | |\n"
            + "| |_| |\n"
            + "|____/ \n";

        String asciiArt = RomanPrinter.print(number);

        assertEquals(expectedAsciiArt, asciiArt);
    }

    @Test
    public void testPrintNumberOneThousandAsAsciiArtM() {
        int number = 1000;
        String expectedAsciiArt = " __  __ \n"
            + "|  \\/  |\n"
            + "| |\\/| |\n"
            + "| |  | |\n"
            + "|_|  |_|\n";

        String asciiArt = RomanPrinter.print(number);

        assertEquals(expectedAsciiArt, asciiArt);
    }

    @Test
    public void testPrintNumberOneThousandOneThrowsException() {
        int number = 1001;

        Executable printing = () -> RomanPrinter.print(number);

        assertThrows(IllegalArgumentException.class, printing);
    }
}
