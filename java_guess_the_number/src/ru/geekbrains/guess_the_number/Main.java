package ru.geekbrains.guess_the_number;

import sun.font.TrueTypeFont;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Угадай число?");
        for (int i = 10; i <= 30; i += 10) {
            playLevel(i);
        }
        scanner.close();
    }
    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Введите число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number > number){
                System.out.println("Попробуйте меньше");
            } else if (input_number < number) {
                System.out.println("Попробуйте больше");
            } else {
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
