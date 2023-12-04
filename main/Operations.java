package main;

public class Operations {
     public static String detectOperation(String exp) throws Exception {
        return switch (exp) {
            case "+" -> "+";
            case "-" -> "-";
            case "*" -> "*";
            case "/" -> "/";
            default -> throw new Exception("неподдерживаемая математическая операция");
        };
    }

     public static int operation(int a, int b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> a / b ;
        };
    }
}
