package modul3;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			s = "1 - это понедельник.";
			break;
		case 2:
			s = "2 - это вторник.";
			break;
		case 3:
			s = "3 - это среда.";
			break;
		case 4:
			s = "4 - это четверг.";
			break;
		case 5:
			s = "5 - это пятница.";
			break;
		case 6:
			s = "6 - это суббота.";
			break;
		case 7:
			s = "7 - это воскресенье.";
			break;
		default:
			s = "Такого дня не существует.";
		}
		System.out.println(s);
	}

}
