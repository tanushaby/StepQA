package modul1;

public class Task9 {
	static float[] num = { 3.14f, 5.0f, 2.5f, 10.0f };

	public static void main(String[] args) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 1 == 0) {
				System.out.println("Число " + num[i] + " не имеет вещественной части");
				continue;
			}
			System.out.println("Число " + num[i] + " имеет вещественную часть");
		}

	}

}
