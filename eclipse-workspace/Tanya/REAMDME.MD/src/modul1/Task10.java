package modul1;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		double height; // рост
		double weight; // вес
		double ideal; // идеальный вес
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите свой вес:");
		weight = scanner.nextDouble();
		System.out.println("Введите свой рост:");
		height = scanner.nextDouble();
		ideal = height - 110;
		System.out.println("Ваш идеальный вес: " + ideal + " кг");
	}
}
