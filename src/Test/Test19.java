package Test;

public class Test19 {

	/**
	 * 题目:打印菱形图案
	 */
	public static void main(String[] args) {
		int H = 7, W = 7;// 高和宽必须是相等的奇数
		for (int i = 0; i < (H + 1) / 2; i++) {
			for (int j = 0; j < W / 2 - i; j++){
				System.out.print(" ");
			}
		}

	}

}
