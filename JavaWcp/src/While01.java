
public class While01 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 50) {
			number *= 2;
			System.out.println("While01 = " + number);
		}
		
		int number2 = 1;
		do {
			number2 *= 2;
			System.out.println("Dowhile01 = " + number2);
		} while (number2 < 50);
	}
}
