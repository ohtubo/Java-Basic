
public class Chapter07 {
	
	public static void main(String[] args) {
		//距離を表すint型の変数を定義し、任意の値で初期化する
		int distance = 12;
		
		//距離が5km以下の場合は "とても近いです" を出力する
		if (distance <= 5){
			System.out.println("とても近いです");
		//距離が5kmより長く10km以下の場合は "近いです" を出力する
		} else if (distance <= 10) {
			System.out.println("近いです");
		//距離が10kmより長く15km以下の場合は "遠いです" を出力する
		} else if (distance <= 15) {
			System.out.println("遠いです");
		//距離が15kmより長い場合は "とても遠いです" を出力する
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "red";
		
		switch (color){
			case "red":
	            System.out.println("赤信号です");
	            break;
			case "yellow":
				System.out.println("黄信号です");
				break;
			case "blue":
	            System.out.println("青信号です");
	            break;
	        default:
	            System.out.println("信号の色ではありません");
		}
		
	}
}
