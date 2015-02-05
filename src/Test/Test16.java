package Test;

public class Test16 {

	/**
	 * 题目: 输出9*9口诀.
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
				if (j * i < 10) {
					System.out.print(" ");// 使排列更整齐
				}
			}
			System.out.println();
		}
	}
}