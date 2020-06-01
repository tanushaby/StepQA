package modul1;

public class Task11 {
	public static void main(String[] args) {
		long seconds = 368954862;
		long sec = seconds % 60;
		long minutes = seconds % 3600 / 60;
		long hours = seconds % 86400 / 3600;
		long days = seconds / 86400;

		System.out.println(days + " дней " + hours + " часов " + minutes + " минут " + sec + " секунд ");

	}

}
