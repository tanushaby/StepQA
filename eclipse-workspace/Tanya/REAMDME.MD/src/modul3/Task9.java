

/*Задание 9
Даны координаты начала и координаты конца отрезка.
Если считать отрезок обозначением горки, то в одном случае он обозначает спуск, в другом – подъем. Определить и
вывести на экран – спуск это или подъем, ровная дорога или
вообще отвесная*/
package modul3;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		int x;
		int y;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Введите два числа: ");
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
		if (x >= 6 && y <= x) {
			System.out.print("Спуск");
		} else if (x <= 4 && y >= x) {
			System.out.print("Подъем");
		} else if (x == 10 && y == 10) {
			System.out.print("Отвесная дорога");
		} else if (x == 5 && y == 5) {
			System.out.print("Ровная дорога");
		}

	}
}
