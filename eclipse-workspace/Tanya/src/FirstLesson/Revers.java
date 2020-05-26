package FirstLesson;

import java.util.Scanner;

public class Revers {
	   public static void main(String args[]) {
		   String slovo;
		   try (Scanner scanner = new Scanner(System.in)) {
			   System.out.println("Введите слово:");
			   slovo = scanner.nextLine();
		   }
	       StringBuffer buffer = new StringBuffer(slovo);
	       buffer.reverse();
	       System.out.println(buffer);
	   }  
	}