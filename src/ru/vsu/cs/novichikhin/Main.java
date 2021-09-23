package ru.vsu.cs.novichikhin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readValue("количество мячей забитых первой командой: N = ");
        chekNumberPositive(n);
        int m = readValue("количество мячей забитых второй командой: M = ");
        chekNumberPositive(m);

        resultFirstTeam result = compareValue(n, m);

        printDistributionOfPoints(result);

    }

    static int readValue(String value) {
        System.out.print("Введите " + value);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    static void chekNumberPositive(int val) {
        if (val < 0) {
            System.out.print("Данные введены неверно.");
            System.exit(0);
        }
    }

    static resultFirstTeam compareValue(int a, int b) {
        if (a == b) {
            return resultFirstTeam.DRAW;
        } else {
            if (a > b) {
                return resultFirstTeam.WIN;
            } else {
                return resultFirstTeam.LOOSE;
            }
        }
    }

    static void printDistributionOfPoints(resultFirstTeam result) {
        switch (result) {
            case WIN -> System.out.print("Первая команда заработала 3 очка, а вторая команда заработала 0 очков");
            case LOOSE -> System.out.print("Первая команда заработала 0 очков, а вторая команда заработала 3 очка");
            case DRAW -> System.out.print("Обе команды заработали по 1 очку");
        }
    }
}

