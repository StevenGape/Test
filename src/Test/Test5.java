package Test;

import java.util.*;

public class Test5 {

	/**
	 * 利用条件运算符的潜逃来完成此题: 学习成绩>=90分的同学用A表示, 60-89分
	 * 之间的用B表示, 60分一下的用C表示.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		char grade;
		Scanner s = new Scanner(System.in);
		System.out.print("请输入一个成绩: ");
		x = s.nextInt();
		grade = x >= 90 ? 'A' : x >= 60 ? 'B' : 'C';
		System.out.println("等级为: " + grade);
	}
}
