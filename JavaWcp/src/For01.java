
public class For01 {
	public static void main(String[] args) {
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
		
		System.out.println("");
		
		int[] array = {1, 2, 3, 4, 5};
		for (int number2 : array) {
			System.out.println("For02 = " + number2);
		}
	}
}
