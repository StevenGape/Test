package Test;

public class Test13 {

	/**
	 * 题目: 一个整数, 它加上100后是一个完全平方数, 再加上168又是一个
	 * 完整平方数, 请问该数是多少?
	 */
	public static void main(String[] args) {
		for (int x = 1; x < 1000; x++) {
			if (Math.sqrt(x+100) % 1 == 0) {
				if (Math.sqrt(x+268) % 1 == 0) {
					System.out.println(x+"加100是一个完全平方数," +
							"再加168是一个完全平方数");
				}
			}
		}
	}
}