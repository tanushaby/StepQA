package modul3;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;

		System.out.print("x=");
		x = sc.nextInt();

		System.out.print("y=");
		y = sc.nextInt();

		if (x > 0 & y > 0) {
			System.out.println("I четверть");
		} else if (x < 0 & y > 0) {
			System.out.println("II четверть");
		} else if (x < 0 & y < 0) {
			System.out.println("III четверть");

		} else
			System.out.println("IV четверть");
	}

}
