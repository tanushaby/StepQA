package modul3;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		double a, b, c;
		double D;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Программа решает квадратное уравнение \n"
					+ "ax^2 + bx +c = 0 \n"
					+ "Введите a, b, c:");
			a = scanner.nextDouble();
			b = scanner.nextDouble();
			c = scanner.nextDouble();		
	}
		D = b *b - 4 * a * c;
		if(D > 0) {
			double x1, x2;
			x1 = (-b - Math.sqrt(D)) / (2 *a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println( "Корни уравнения х1 = " + x1 + ", х2 = " + x2);
		} else if (D == 0) {
			double x;
			x = -b / (2 * a);
			System.out.println("Уравнение имеет единственный корень: x = " +x);
		} else {
			System.out.println("Уравнение не имеет действительных корней!");
		}
	}
}
