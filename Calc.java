package main;

import java.util.Scanner;

public class Calc {

    private static String op;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение в арабских цифрах или в римских ");
        String expression = scanner.nextLine();
        System.out.println("Ответ : " + calc(expression));
    }

    public static String calc(String expression) throws Exception {
        int num1;
        int num2;
        String result;
        String[] line = expression.split(" ");

        boolean isRoman = Roman.isRoman(line[0], line[2]);

        line[1] = detectOperation(expression);
        if (line[1] == null) throw new Exception("Неподдерживаемая математическая операция");
        if (line.length != 3) throw new Exception("Некорректное выражение, должно быть два операнда");

        //если оба числа римские или оба числа арабские
        //конвертируем оба числа в арабские для вычесления действия
        num1 = isRoman ? Roman.convertToArabian(line[0]) : Integer.parseInt(line[0]);
        num2 = isRoman ? Roman.convertToArabian(line[2]) : Integer.parseInt(line[2]);

        if (num1 > 10 || num2 > 10) {
            throw new Exception("Числа должны быть от 1 до 10 или от I до X");
        }
        int arabian = calc(num1, num2, line[1]);
        if (isRoman) {
            //если римское число получилось меньше либо равно нулю, генерируем ошибку
            if (arabian <= 0) {
                throw new Exception("Римское число должно быть больше нуля");
            }
            //конвертируем результат операции из арабского в римское
            result = Roman.convertToRoman(arabian);
        } else {
            //Конвертируем арабское число в тип String
            result = String.valueOf(arabian);
        }
        //возвращаем результат
        return result;
    }

    static String detectOperation(String expression) {
        if (expression.contains("+")) {
            return "+";
        } else if (expression.contains("-")) {
            return "-";
        } else if (expression.contains("*")) {
            return "*";
        } else if (expression.contains("/")) {
            return "/";
        } else return null;
    }

    static int calc(int a, int b, String op) {

        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else return a / b;
    }

}




