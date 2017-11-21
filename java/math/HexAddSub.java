 */
public class NumeralSystems {

    /**
     * This method convert the value from String type to long type .
     * @param number is the number that we want to convert it from string to long .
     * @return finalNumber which is the number but on the long type .
     */
    private long String2long(String number) {
        long finalNumber = 0;
        int length = number.length();
        while (length > 0) {
            finalNumber = finalNumber + (number.charAt(length - 1) - 48) * (int) Math.pow(10, number.length() - length);
            length--;
        }
        return finalNumber;
    }      
    
    /**
     * This method convert the number from the Hexadecimal to the Binary.
     * @param hexNumber the number in String type in the Hexadecimal system .
     * @return the number in the Binary system .
     */
    public long HexToBin(String hexNumber) //H2B
    {
        return DecToBin(HexToDec(hexNumber));
    }

    
    /**
     * This method convert the number from the Binary to the Hexadecimal.
     * @param binNumber the number in String type in the Binary system .
     * @return the number in the Hexadecimal system .
     */
    public String BinToHex(String binNumber) //B2H
    {
        return DecToHex(BinToDec(binNumber));
    }

    /**
     * This method convert the number from the Binary to the Hexadecimal.
     * @param binNumber the number in long type in the Binary system .
     * @return the number in the Hexadecimal system .
     */
    public String BinToHex(long binNumber) //B2H
    {
        return DecToHex(BinToDec(binNumber));
    }

    

       /**
     * This method gather the two Binary numbers .
     * @param binNumber1 The first Binary number .
     * @param binNumber2 The second Binary number .
     * @return The summation of them .
     */
    public long Bin_Add(long binNumber1, long binNumber2) {
        long finalBin = DecToBin(BinToDec(binNumber1) + BinToDec(binNumber2));
        return finalBin;
    }

    
    /**
     * This method gather the two Hexadecimal numbers .
     * @param hexNumber1 The first Hexadecimal number .
     * @param hexNumber2 The second Hexadecimal number .
     * @return The summation of them .
     */
    public String Hex_Add(String hexNumber1, String hexNumber2) {
        String finalHex = DecToHex(HexToDec(hexNumber1) + HexToDec(hexNumber2));
        return finalHex;
    }

    
    /**
     * This method Holds subtraction of two Binary numbers .
     * @param binNumber1 The first Binary number .
     * @param binNumber2 The second Binary number .
     * @return The subtraction of them .
     */
    public long Bin_Sub(long binNumber1, long binNumber2) {
        long finalBin = DecToBin(BinToDec(binNumber1) - BinToDec(binNumber2));
        return finalBin;
    }

   
    /**
     * This method Holds subtraction of two Hexadecimal numbers
     * @param hexNumber1 The first Hexadecimal number .
     * @param hexNumber2 The second Hexadecimal number .
     * @return The subtraction of them .
     */
    public String Hex_Sub(String hexNumber1, String hexNumber2) {
        String finalHex = DecToHex(HexToDec(hexNumber1) - HexToDec(hexNumber2));
        return finalHex;
    }
    
    
    