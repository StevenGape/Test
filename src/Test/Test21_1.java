package Test;

public class Test21_1 {
	public static void main(String[] args) {
		System.out.println("Result:" + jiecheng1(10));
		System.out.println("Result:" + jiecheng(5));
	}
	/**1+...+1/n!的总和 */
	public static double jiecheng1(double sum) {
		if (sum == 1) {
			return 1;
		} else {
			return jiecheng1(sum - 1) + 1 / sum;
		}
	}
	/**
	 * 一个静态的方法
	 * n!的阶乘
	 */
	public static int jiecheng(int x) {
		if (x == 0) {
			return 1;
		} else {
			return x * jiecheng(x - 1);
		}
	}
}
