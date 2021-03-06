
public class Chapter08 {
	public static void main(String[] args) {
		//1.「while」文
		//・1以上5未満の数の2乗を出力
		int count = 1;
		while (count < 5) {
			System.out.println("While01 = " + count * count);
			count++;
		}
		
		System.out.println("-------------");
		//2. 通常「for」文
		//・要素数が4の「int」配列を初期化
		//・配列のサイズ分ループして、要素を出力
		//※ 配列のサイズは「変数名.length」で取得が可能
		int[] array = {1, 4, 14, 25};
		for (int count2 = 0; count2 < array.length; count2++) {
			System.out.println("for01 = " + array[count2]);
		}
		System.out.println("-------------");
		
		//3. 拡張「for」文
		//・「2.」の配列をループ
		//・要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
		for (int count3 : array) {
			if (count3 % 2 == 0) {
				continue;
			}
			System.out.println("for03 = " + count3);
		}
	}
	
}
