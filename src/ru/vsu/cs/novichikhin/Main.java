package ru.vsu.cs.novichikhin;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        int n = readValue("количество мячей забитых первой командой: N = ");
        chekValue(n);
        int m = readValue("количество мячей забитых второй командой: M = ");
        chekValue(m);
        compareValue(n, m);


       static int readValue(String value) {
            System.out.print("Введите ", value);
            Scanner in = new Scanner(System.in);
            return in.nextInt();
        }

        static void chekValue( int val) {
            if (val < 0) {
                System.out.print("Данные введены неверно.");
                System.exit(0);
            }
        }

        static void compareValue(int a, int b) {
            if (a == b) {System.out.print("Обе команды заработали по 1 очку");}
            else {if (a > b) {System.out.print("Первая команда заработала 3 очка, а вторая команда заработала 0 очков");}
                else {System.out.print("Первая команда заработала 0 очков, а вторая команда заработала 3 очка");}
                else {System.out.print("Обе команды заработали по 1 очку");}
            }

        }
    }