
public class Null01 {
	public static void main (String[] args) {
		// コンパイルエラーになる
		// long long1 = 9223372036854775807;
		//正常系
		long long2 = 9223372036854775807L;
		
		//「short」型、「byte」型は明示的な記述をする必要はありません。
		short short1 = 32767;
		byte byte1 = 127;
		
		//浮動小数型---------------------------------
		
		double double1 = 1234567.89;
		// 明示的にすることも可能
		double double2 = 1234567.89d;
		 // コンパイルエラー
		//float float1 = 0.123;
		float float2 = 0.123f;
		
		//論理型-------------------------------------
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		//文字型----------------------------------------
		//１つの変数に格納できるのは、１文字だけになります。
		char char1 = 'あ';
		 // コンパイルエラー
		//char char2 = 'AB';
		char char3 = 'A';
		// 文字コードでひらがなの「あ」を表現
		char char4 = 0x3042;
		
		String string1;
		// ”あいう”の文字数を出力
		string1 = "あいう";
		System.out.println(string1 + "の文字数" + string1.length());
		// ””（空文字）の文字数を出力
		string1 = "";
		System.out.println(string1 + "の文字数：" + string1.length());
		// nullの変数を参照するとNullPointerExceptionのエラー
		//string1 = null;
		//System.out.println(string1 + "の文字数：" + string1.length());
		
		//ボクシング----------------------------------
		Integer integer1 = 5;
		Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
		int int1 = integer1;             // アンボクシング
		int int2 = integer2.intValue();  // 明示的なアンボクシング
		
		//配列-------------------------------
		int[] array1 = new int[3];
		array1[0] = 60; // インデックス番号「0」を指定して１番目の要素にデータを代入
		array1[2] = 20; // ２番目の要素より先に３番目の要素にデータを代入
		array1[1] = 20; // ３番目と同じ値を２番目の要素に代入
		int int3 = array1[2];// インデックス番号「2」を指定して３番目の要素を取得
		
		int array2[] = null; //[]は変数名の後ろでも可
		
		int[] array3 = new int[] { 10,20,50 };
		int[] array4 = { 10, 20, 50 };
	}
}
