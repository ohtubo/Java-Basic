
public class Chapter05 {
	public static void main(String[] arges) {
	//・プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
	long long1 = 123456789L;
	double double1 = 123.456d;
	boolean boorean1 = true;
	
	System.out.println(long1);
	System.out.println(double1);
	System.out.println(boorean1);
	//・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
	Float Float1 = 123.456f;
	Integer Integer1 = 5;
	Character Char1 = 'A';
	
	System.out.println(Float1);
	System.out.println(Integer1);
	System.out.println(Char1);
	
	//・要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
	int[] array1 = new int[] { 1, 2, 3, 4, 5 };
	System.out.println(array1[2]);
	}
}
