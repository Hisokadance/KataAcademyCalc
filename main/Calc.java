package main;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение :");
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        String result;
        String[] line = scanner.nextLine().split(" ");
        if (line.length != 3) throw new Exception("Должно быть 2 числа");
        String op = Operations.detectOperation(line[1]);
        boolean flag = Roman.isRoman(line[0], line[2]);

        num1 = flag ? Roman.convertToArabian(line[0]) : Integer.parseInt(line[0]);
        num2 = flag ? Roman.convertToArabian(line[2]) : Integer.parseInt(line[2]);

        int arabian = Operations.operation(num1, num2, op);

        if (flag) {
            if (arabian <= 0) throw new Exception("Риское число не может быть 0");
            result = Roman.convertToRoman(arabian);
        } else {
            result = String.valueOf(arabian);
        }
        System.out.println("Ответ : " + result);
    }
}
