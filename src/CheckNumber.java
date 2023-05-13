public class CheckNumber {

    public boolean check(String[] strings) {

        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
        boolean isRoman = false;

        for (String str : roman) {
            if (str.equals(strings[0]) || str.equals(strings[2])) {
                isRoman = true;
            }
        } return isRoman;
    }
}
