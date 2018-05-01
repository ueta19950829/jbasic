package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;

/*
 * ArrayListクラスをインスタンス化し、任意のデータ型で任意の値を格納してください。
 * また、ArrayListクラス内に用意されているメソッドを適当に使用したプログラムを作成してください。
 * ※ArrayListクラスのメソッドは以下URLから検索して使用すること
 * https://docs.oracle.com/javase/jp/8/docs/api/index.html
 */
public class No004 {
	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<String>();

		animal.add("オオカミ");
		animal.add("ウサギ");
		animal.add("ライオン");
		animal.add("シロクマ");
		animal.add("イヌ");
		animal.add("リス");

		animal.set(2,"アルパカ");


		for(String a : animal)
			System.out.println(a);
	}
}
