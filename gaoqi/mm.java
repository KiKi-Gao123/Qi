package gaoqi;

import java.util.Random;

public class mm {

	public static void main(String[] args) {
		int[] arry=new int[100];
		for(int i=0;i<100;i++)
		arry[i]=new Random().nextInt(1000);
		for(int j=0;j<arry.length-1;j++)
			for(int i=0;i<arry.length-j-1;i++)
			if(arry[i]>arry[i+1]) {
				int temp=arry[i];
				arry[i]=arry[i+1];
				arry[i+1]=temp;
			}
		
		for(int i=0;i<arry.length;i++)
			System.out.println(i+1+":"+arry[i]);

	}

}
