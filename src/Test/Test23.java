package Test;

public class Test23 {

	/**
	 * 题目: 有5个人坐在一起, 问第五个人多少岁? 他说比第四个人大2岁. 问第四个
	 * 人岁数, 他说比第三个人大2岁. 问第三个人, 又说比第二个人大2岁. 问第二个
	 * 人, 说比第一个人大两岁. 最后问第一个人, 他说是10岁. 请问第五个人多大?
	 */
	public static void main(String[] args) {
		int age = 10;
		for (int i = 2; i <= 5; i++) {
			age = age + 2;
		}
		System.out.println(age);
	}
}
