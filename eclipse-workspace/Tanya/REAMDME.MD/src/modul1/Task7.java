package modul1;

public class Task7 {
	public static void main(String args[]) {
		double proc = 3.65;
		int sum = 5000;
		int time = 2;
		double vklad1Y = (sum * proc) / 100;
		double vklad2Y = (vklad1Y * time) + sum;

		System.out.println(vklad2Y);

	}

}
