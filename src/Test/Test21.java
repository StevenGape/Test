package Test;

public class Test21 {

	/**
	 * 题目: A.求1+2!+3!+...+20!的和 B.用递归求1+...+1/n!的总和 或者求n!
	 */
	public static void main(String[] args) {
		long sum = 0;
		long fac = 1;
		for (int i = 1; i <= 20; i++) {
			fac = fac * i;
			sum += fac;
		}
		System.out.println(sum);
	}
}