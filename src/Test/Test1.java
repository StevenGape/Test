package Test;

public class Test1 {

	/**
	 * 题目: 古典问题: 有一对兔子, 从出生后第3个月起每个月都生一对兔子,
	 * 小兔子长到第三个月后每个月又生一对兔子, 加入兔子都不死, 问每个月的
	 * 兔子总数为多少?
	 * 这事一个斐波拉契数列问题.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第1个月的兔子对数:	1");
		System.out.println("第2个月的兔子对数:	1");
		int f1 = 1, f2 = 1, f, M = 24;
		for (int i = 3; i <= M; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("第" + i + "个月的兔子对数:	" + f2);
		}
	}
}
