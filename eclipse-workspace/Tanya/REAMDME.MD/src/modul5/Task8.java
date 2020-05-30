package modul5;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите  случайные строчные латинские буквы: ");
		String s = sc.next();
        int[] arr = new int[255];
        for (int i = 0; i < s.length(); i++) {arr[s.charAt(i)]++;}
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i + " встречается " + arr[i] + " раз");
        }
	}
}
//а как вывести те буква, которые встречаются трижды и не знаю


