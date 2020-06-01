package modul3;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {

		int x;
		int y;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Введите два числа через пробел: ");
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
		if (x % 2 == 0 && y % 2 == 0) {
			System.out.print("YES");
		} else if (x % 2 != 0 && y % 2 != 0) {
			System.out.print("YES");
		} else
			System.out.print("");

	}
}
