import java.io.IOException;

public class TestK {


    public static void main(String[] args) throws IOException {
        ReadIn readIn = new ReadIn();
        Converter conv = new Converter();
        CheckNumber checkNumber = new CheckNumber();
        Validator validator = new Validator();
        Calculator calc = new Calculator();


        for (; ;) {
            String[] strings = readIn.read();
            boolean isRoman = checkNumber.check(strings);
            int firstNum = isRoman ? conv.romanToArab(strings[0]) : conv.strToArab(strings[0]);
            int secondNum = isRoman ? conv.romanToArab(strings[2]) : conv.strToArab(strings[2]);
            char operation = conv.strToChar(strings[1]);
            validator.validate(firstNum, secondNum, isRoman, operation, strings);
            int result = calc.calculate(firstNum, secondNum, operation);

            System.out.println(isRoman ? conv.numToRoman(result) : result);
        }
    }
}




