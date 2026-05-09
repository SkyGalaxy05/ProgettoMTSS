////////////////////////////////////////////////////////////////////
// LORENZO CISCO 2147978
// EMILIO MARELLA 2147954
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number) {
        switch (number) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            default:
                throw new IllegalArgumentException(
                    "Numero fuori dal range consentito (1-6)");
        }
    }
}