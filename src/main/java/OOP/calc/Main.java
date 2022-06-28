package OOP.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражения для вычисления в формате 'a + b':");
        String expression = in.nextLine();
        ReadExp readExp = new ReadExp(expression);
        Calculator calculator = new Calculator(readExp.getA(), readExp.getOperation(), readExp.getB());
        System.out.println(calculator.calculate().getResult());
    }
}