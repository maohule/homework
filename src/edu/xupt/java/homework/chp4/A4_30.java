package edu.xupt.java.homework.chp4;
import java.util.Scanner;
public class A4_30 {

	public static void main(String[] args) {
		int number=0,d5,d4,d3,d2,d1;
		Scanner in=new Scanner(System.in);
		Boolean boo=true;
		while(boo)
		{
			System.out.println("请输入一个5位数字：");
			number=in.nextInt();
			if(number>=10000&&number<=99999)
			{
				d5=number/10000;
				d4=number%10000/1000;
				d3=number%1000/100;
				d2=number%100/10;
				d1=number%10;
				if(d5==d1&&d4==d2)
				{
					System.out.println(number+"是回文数");
				}
				else
				{
					System.out.println(number+"不是回文数");
				}
				boo=false;
			}
			else
			{
				System.out.println("您的输入有误！");
			}
		}
	}
}
