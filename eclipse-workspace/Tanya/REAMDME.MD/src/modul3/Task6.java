package modul3;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ведите интересующий Вас год:");
		int year = sc.nextInt();
		int days = 366;

		int res1 = year % 4;
		int res2 = year % 100;
		int res3 = year % 400;

		if (res1 == 0) {
			if (res2 == 0 && res3 != 0)
				days = 365;
		} else
			days = 365;

		System.out.println("количество дней в году: " + days);
	}

}
