
public class If01 {
	public static void main(String[] args) {
		//if文------------------------------------------------
		int number = 7;
		if (number < 5) {
			System.out.println( number + "は5未満です");
		}
		if (number < 10) {
			System.out.println( number + "は10未満です");
		}
		if (number < 15) {
			System.out.println( number + "は15未満です");
		}
		
		//else-if文、else文----------------------------------
		int number2 = 7;
		if (number2 < 5) {
			System.out.println(number2 + "は5未満です");
		} else if (number2 < 10) {
			System.out.println(number2 + "は5以上、10未満です");
		} else if (number2 < 15) {
			System.out.println(number2 + "は10以上、15未満です");
		} else {
			System.out.println(number2 + " は15未満でないです");
		}
				
	}
}
