package Test;
import java.util.*;
public class Test25_1 {

	/**
	 * 不限位数
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean is = true;
		System.out.print("请输入一个正整数: ");
		long a = s.nextLong();
		String ss = Long.toString(a);
		char[] ch = ss.toCharArray();
		int j = ch.length;
		for (int i = 0; i < j / 2; i++) {
			if (ch[i] != ch[j - i - 1]) {
				is = false;
			}
		}
		if (is == true) {
			System.out.println("这是一个回文数");
		} else {
			System.out.println("这不是一个回文数");
		}
	}
}
