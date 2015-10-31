package edu.xupt.java.homework.chp6;
import java.util.*;
class JiSuan
{
	
	public void question1(int a,int b)
	{
		System.out.println("How much is "+a+" times "+b+"?");
	}
	public void question2()
	{
		System.out.println("10乘10的结果共有几位数字?");
	}
}
public class A6_30 {
	public static void main(String args[])
	{
		Random xx=new Random();
		int number1=xx.nextInt(10)+1;
		int number2=xx.nextInt(10)+1;
		JiSuan suan=new JiSuan();
		suan.question1(number1, number2);
		Scanner in=new Scanner(System.in);
		int answer=in.nextInt();
		Boolean boo=true;
		while(boo)
		{	
			if(answer==number1*number2)
			{
				System.out.println("Very good!");
				boo=false;
			}
			else
			{
				System.out.println("No.Please try again.");
				answer=in.nextInt();
			}
		}
		boo=true;
		while(boo)
		{
			suan.question2();
			answer=in.nextInt();
			if(answer==3)
			{
				System.out.println("Very good!");
				boo=false;
			}
			else
			{
				System.out.println("No.Please try again.");
			}
		}
	}
}
