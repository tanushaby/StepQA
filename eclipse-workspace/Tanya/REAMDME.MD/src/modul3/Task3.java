package modul3;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите животное: " + "1 - собака, \n" + "2 - кошка, \n" + "3 - лев, \n"
				+ "4 - лягушка, \n" + "5 - утка, \n" + "6 - петух, \n" + "7 - корова, \n" + "8 - овца, \n"
				+ "9 - коза, \n" + "10 - лиса.");
		int animal = sc.nextInt();
		switch (animal) {
		case 1:
			s = "гав-гав";
			break;
		case 2:
			s = "мяу-мяу";
			break;
		case 3:
			s = "ррррррр";
			break;
		case 4:
			s = "ква-ква";
			break;
		case 5:
			s = "кря-кря";
			break;
		case 6:
			s = "ку-ка-ре-ку";
			break;
		case 7:
			s = "мууууу";
			break;
		case 8:
			s = "бееее";
			break;
		case 9:
			s = "меееее";
			break;
		case 10:
			s = "??????";
			break;
		default:
			s = "Выберите пожалуйста что-то из предложенного списка!";
		}
		System.out.println(s);
	}

}
