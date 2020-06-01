package modul3;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		
		int number;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Введите шестизначный номер билета: ");
        		number = scanner.nextInt();
        	}
		
		if (number / 100000 + (number/ 10000) % 10 + (number / 1000) % 10 == 
				(number / 100) % 10 + (number / 10) % 10 + number % 10) {
			System.out.print("Да");
		} else
			System.out.print("Нет");
	}
 
}

	/*public static void main(String[] args) {

		int n1, n2, n3, n4, n5, n6;
		int sum1, sum2 = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Введите число: ");
			n1 = scanner.nextInt();
			n2 = scanner.nextInt();
			n3 = scanner.nextInt();
			n4 = scanner.nextInt();
			n5 = scanner.nextInt();
			n6 = scanner.nextInt();
			}
		sum1 = n1 + n2 + n3;
		sum2 = n4 + n5 + n6;
		if(sum1 == sum2) {
			System.out.println(" Счастливое число");
		} else {
			System.out.println(" Несчастливое число");
		}
	}
}*/