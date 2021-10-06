
public class Switch01 {
	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました！");
			break;
		case 2:
			System.out.println("ふつうでした！");
			break;		
		default:
			System.out.println("がんばろう！");
		}
		
		int val2 = 2;
		if (val2 == 3) {
			System.out.println("よくできました！");
		} else if (val2 == 2 ) {
			System.out.println("ふつうでした！");
		} else {
			System.out.println("がんばろう！");
		}
	}
}
