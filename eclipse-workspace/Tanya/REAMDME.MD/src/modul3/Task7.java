package modul3;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {

		char nChar;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите символ: ");
			nChar = scanner.next().trim().charAt(0);
		}

		if ((nChar >= 'a' && nChar <= 'z') || (nChar >= 'A' && nChar <= 'Z')) {
			System.out.println("Это буква латинского алфавита");
		} else if ((nChar >= 'а' && nChar <= 'я') || (nChar >= 'А' && nChar <= 'Я')) {
			System.out.println("Это буква кирилического алфавита");
		} else if (nChar >= '0' && nChar <= '9') {
			System.out.println("Это цифра");
		} else
			System.out.println("Неизвестно");

	}
}
