package Test;

public class Test27_1 {

	/**
	 * 该程序使用除1位素数得2位方法, 运行效率高通用性差
	 */
	public static void main(String[] args) {
		int[] a = new int[] {2, 3, 5, 7};
		for (int j = 0; j < 4; j++) 
			System.out.print(a[j] + " ");
		boolean b = false;
		for (int i = 11; i < 100; i += 2) {
			for (int j = 0; j < 4; j++) {
				if (i % a[j] == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				System.out.print(i + " ");
			}
		}
	}
}
