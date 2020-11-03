//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

;
import java.util.Scanner;

class CountryGame {
    Scanner in = new Scanner(System.in);
    Countries country = new Countries();


    public static void main(String[] args) {
        CountryGame game = new CountryGame();
        game.Menu();
    }

    public int Menu() {
        System.out.println("Угадай столицу");
        System.out.println("выбери действие: ");
        System.out.println("1. Начать игру: ");
        System.out.println("2. Выход.");
        int num = in.nextInt();
        if (num == 1) {
            Game();
        }

        if (num == 2) {
            System.exit(0);
        }

        return num;
    }

    public int Game() {
        Countries list = new Countries();
        int count = 1;
        int b = 0;
        int total = list.list.size();
        while (list.list.size() > b) {


            for (Countriesv2 Countriesv2 : list.list) {
                ++b;
                System.out.println(Countriesv2);
                System.out.println("Введите название столицы:");
                String Value1 = this.in.next();
                String Value2 = Countriesv2.getCity();
                if (Value1.equalsIgnoreCase(Value2)) {
                    System.out.println("Вы угадали!");
                    ++count;

                } else {
                    System.out.println("Ты ошибся Мэн!");
                }

            }
        }
        if (count * 100 / total > 70) {
            System.out.println("Поздравляем вы знаток! ");
        } else {
            System.out.println("Урюк иди учи географию!!! ");
        }

        return this.Menu();
    }
}