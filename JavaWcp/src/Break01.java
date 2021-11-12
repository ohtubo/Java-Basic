
// 繰り返し処理の練習
public class Break01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 4) {
				break;
			}
			System.out.println("Break01 = " + count);
		}
	}
}
