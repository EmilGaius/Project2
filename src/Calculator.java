public class Calculator {

    public int calculate(int a, int b, char c) {

        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Неверный знак операции");
        };
    }
}
