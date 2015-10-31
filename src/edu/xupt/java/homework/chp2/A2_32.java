package edu.xupt.java.homework.chp2;
import java.util.Scanner;
public class A2_32 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int zCount=0,fCount=0,zero=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("请输入第"+(i+1)+"个数字");
			a[i]=in.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i]+"是正数");
				zCount++;
			}
			else if(a[i]<0)
			{
				System.out.println(a[i]+"是负数");
				fCount++;
			}
			else
			{
				System.out.println(a[i]+"是0");
				zero++;
			}		
		}
		System.out.println("正数有"+zCount+"个\n"+"负数有"+fCount+"个\n"+"0有"+zero+"个");
	}

}
