package gaoqi;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] arge) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三角形三条边的长：");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double s=(a+b+c)/2;
		System.out.println("s="+s);
		System.out.println("面积="+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}

}
