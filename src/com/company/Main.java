package com.company;

public class Main {

	public static void main(String[] args) {
		int s = 3700;
		int sec = s % 60;
		int m = (s - sec) / 60;
		int min = m % 60;
		int h = (m - min) / 60;
		System.out.println(s + " секунд это - " + h + " час " + min + " минут " + sec + "секунд");

		int s1 = 3700;
		int sec1;
		int m1;
		int min1;
		int h1;
		sec1 = s1 % 60;
		m1 = (s1 - sec1) / 60;
		min1 = m1 % 60;
		h1 = (m1 - min1) / 60;
		System.out.println("2 вариант: " + h1 + " час " + min1 + " мин " + sec1 + "сек");

		double k = Math.sin(5);
		System.out.println("синус угла 5 = " + k);

		double p = Cube(5);
		System.out.println("5 в кубе = " + p);

		int xx=2;
		double kk = Cube(20) / (Cube(5) + Cube(xx + 3));
		System.out.println("ответ уравнения с кубами = " + kk);

	}
	public static double Cube(double x) {                               //метод возведения в 3 степень
		double y;
		y = x * x * x;
		return y;
	}

}
