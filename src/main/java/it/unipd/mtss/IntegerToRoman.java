////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("Numero fuori dal range consentito (1-3)");
        }
        
        StringBuilder roman = new StringBuilder();
        int remaining = number;
        
        while (remaining >= 1) {
            roman.append("I");
            remaining -= 1;
        }
        
        return roman.toString();
    }
}