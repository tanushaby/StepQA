package modul3;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {

		int number;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Введите шестизначный номер билета: ");
			number = scanner.nextInt();
		}

		if (number / 100000 + (number / 10000) % 10 + (number / 1000) % 10 == (number / 100) % 10 + (number / 10) % 10
				+ number % 10) {
			System.out.print("Вывод: Да");
		} else
			System.out.print("Вывод: Нет");
	}

}
