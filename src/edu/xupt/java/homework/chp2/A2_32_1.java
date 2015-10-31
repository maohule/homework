package edu.xupt.java.homework.chp2;
import java.util.Scanner;
public class A2_32_1 {

	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];
		int d[]=new int[5];
		int zCount=0,fCount=0,zero=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("请输入第"+(i+1)+"个数字：");
			a[i]=in.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			if(a[i]>0)
			{
				b[zCount]=a[i];
				zCount++;
			}
			else if(a[i]<0)
			{
				c[fCount]=a[i];
				fCount++;
			}
			else
			{
				d[zero]=a[i];
				zero++;
			}		
		}
		if(zCount>0)
		{
			System.out.println("正数有：");
			for(int i=0;i<zCount;i++)
			{
				System.out.print(" "+b[i]);	
			}
		}
		if(fCount>0)
		{
			System.out.println("\n负数有：");
			for(int i=0;i<fCount;i++)
			{
				System.out.print(" "+c[i]);
			}
		}
		if(zero>0)
		{
			System.out.println("\n0有:");
			for(int i=0;i<zero;i++)
			{
				System.out.print(" "+d[i]);
			}
		}
		System.out.println("\n正数有"+zCount+"个\n"+"负数有"+fCount+"个\n"+"0有"+zero+"个");
	}

}

