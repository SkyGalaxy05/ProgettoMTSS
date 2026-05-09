////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber.equals("I")) {
            return " ___ \n" +
                   "|_ _|\n" +
                   " | | \n" +
                   " | | \n" +
                   "|___|\n";
        } else if (romanNumber.equals("II")) {
            return " ___   ___ \n" +
                   "|_ _| |_ _|\n" +
                   " | |   | | \n" +
                   " | |   | | \n" +
                   "|___| |___|\n";
        } else if (romanNumber.equals("III")) {
            return " ___   ___   ___ \n" +
                   "|_ _| |_ _| |_ _|\n" +
                   " | |   | |   | | \n" +
                   " | |   | |   | | \n" +
                   "|___| |___| |___|\n";
        }
        
        return "";
    }
}