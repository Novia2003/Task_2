package ru.vsu.cs.novichikhin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

     System.out.print("Введите количество мячей забитых первой командой: N = ");
     int n = in.nextInt();

     System.out.print("Введите количество мячей забитых второй командой: M = ");
     int m = in.nextInt();

     if (n>m) {System.out.print("Первая команда заработала 3 очка, а вторая команда заработала 0 очков");}
     else if (n<m) {System.out.print("Первая команда заработала 0 очков, а вторая команда заработала 3 очка");}
     else {System.out.print("Обе команды заработали по 1 очку");}

    }
}
