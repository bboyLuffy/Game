//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;;
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
        int count = 1;
        int b = 0;
        int total = country.world.size();
            while (country.world.size() > b) {
                ++b;
                int a = (int) (Math.random() * (double) country.list.size());
                String Key =  country.list.get(a);
                System.out.println(Key);
                System.out.println(country.description.get(Key));
                System.out.println("Введите название столицы:");
                String Value1 = this.in.next();
                String Value2 = country.world.get(Key);
                if (Value1.equalsIgnoreCase(Value2)) {
                    System.out.println("Вы угадали!");
                    ++count;
                    country.remove(Key);
                } else {
                    System.out.println("Ты ошибся Мэн!");
                    country.remove(Key);
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
