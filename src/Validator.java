public class Validator {

    public void validate(int firstNum, int secondNum, boolean numIsRoman, char oper, String[] strings) {

        if (strings.length != 3) {
            throw new IllegalArgumentException();
        }
        if ((firstNum > 10 || firstNum < 1) || (secondNum > 10 || secondNum < 1)) {
            throw new IllegalArgumentException();
        }
        if (numIsRoman && firstNum <= secondNum && (oper == '-') || firstNum < secondNum && (oper == '/')) {
            throw new IllegalArgumentException();
        }
    }

}
