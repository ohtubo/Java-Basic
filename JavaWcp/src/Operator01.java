
public class Operator01 {
	public static void main(String[] arge) {
	//インクリメント・デクリメント演算子--------
		int a1;
		a1 = 10;
		a1++; // a = 11
		System.out.println(a1);
		a1 = 10;
		a1--; // a = 9
		System.out.println(a1);
	//前置と後置--------------------------------
		int a2;

		a2 = 10;  // a2 = 10：a2に10を代入
		a2 += 5;  // a2 = 15：a2にa+5の結果を代入
		a2 -= 3;  // a2 = 12：a2にa-3の結果を代入
		a2 *= 4;  // a2 = 48：a2にa*4の結果を代入
		a2 /= 2;  // a2 = 24：a2にa/2の結果を代入
		a2 %= 7;  // a2 = 3 ：a2にa%7の結果を代入
		
		System.out.println(a2);
	//関係（比較）演算子-------------------------
		int a3 = 5;
		boolean c1;
		
		c1 = a3 <  5;
		c1 = a3 <= 5;
		c1 = a3 >  4;
		c1 = a3 >= 6;
		c1 = a3 == 5;
		c1 = a3 != 5;
		
		System.out.println(c1);	
		
	//論理演算子------------------------------------
		boolean a4 = true;
		boolean b1 = false;
		boolean c2;
		
		c2 = a4 && true;
		c2 = a4 && false;
		c2 = b1 || true;
		c2 = b1 || false;
		c2 = !a4;
		c2 = !b1;
		
		System.out.println(c2);	
		
	//文字列の連結----------------------------------
		String a5 = "100";
		String b2 = "200";
		String c3;
		
		c3 = a5 + b2;
		System.out.println(c3);	
		
		c3 = "あ" + "い";
		System.out.println(c3);	
	
	//文字列の等価比較--------------------------------	
		//演算子は文字列の比較に用いることもできます。
		String a6 = "applePie";
		String d = "apple";
		String e = d + "Pie";
		
		c2 = a6 == e;
		System.out.println(c2);	
		
		String f = new String("applePie");
		c2 = a6 == f;  // c = false
		System.out.println(c2);	
		
		// 変数の中身はすぐ上の例と同じ
		c2 = a6.equals(d);  // c = true
		c2 = a6.equals(e);  // c = true
		c2 = a6.equals(f);  // c = true
	}
}
