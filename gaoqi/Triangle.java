package gaoqi;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] arge) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�����������������ߵĳ���");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double s=(a+b+c)/2;
		System.out.println("s="+s);
		System.out.println("���="+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}

}
