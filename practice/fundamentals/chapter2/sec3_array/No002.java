package fundamentals.chapter2.sec3_array;

/*
 * 次の配列を定義して、配列の要素数を取得して表示するプログラムを作成してください。
 * int[] i = {1,2,3,4,5}
 */
public class No002 {
	public static void main(String[] args) {
		int[] i = {1,2,3,4,5};

		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;
		i[4] = 5;

		int len = i.length;

		System.out.println("配列iの要素の数は" + len + "です。");
	}
}
