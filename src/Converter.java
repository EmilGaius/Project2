public class Converter {

    public int strToArab(String string) {
        return Integer.parseInt(string);
    }

    public char strToChar(String string) {
        return string.charAt(0);
    }

    public int romanToArab(String roman) {
        return switch (roman) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> -1;
        };
    }

    public String numToRoman(int numArab) {
        int[] arabList = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanList = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arabList.length; i++) {
            while (numArab >= arabList[i]) {
                numArab -= arabList[i];
                res.append(romanList[i]);
            }
        }
        return res.toString();
    }
}





