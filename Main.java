package com.company;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        boolean e = false;

        do {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();

            Scanner in2 = new Scanner(System.in);
            System.out.print("Выберите операцию(+,-,/,*): ");
            String num3 = in2.nextLine();
            switch (num3) {
                case "+":
                    System.out.println("Результат: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Результат: " + (num1 + num2));
                    break;
                case "*":
                    System.out.println("Результат: " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Результат: " + (num1 / num2));
                    break;
            }
            Scanner in0 = new Scanner(System.in);
            System.out.print("Желаете еще посчитать(да или нет): ");
            String c = in0.nextLine();
            e = c.equals("нет");

        }
        while (!e);
        System.out.println("Ну и УХОДИ");

    }
}



