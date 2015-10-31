package edu.xupt.java.homework.chp6;
import java.util.*;
class A
{
	
	public void question1(int a,int b)
	{
		System.out.println("How much is "+a+" times "+b+"?");
	}
	public void question2()
	{
		System.out.println("10乘10的结果共有几位数字?");
	}
	public void correctResponse(int c)
	{
		switch(c)
		{
		case 1:
			System.out.println("Very good!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Keep up the good work!");
			
		}
	}
	public void wrongResponse(int c)
	{
		switch(c)
		{
		case 1:
			System.out.println("No.Please try again.");
			break;
		case 2:
			System.out.println("Wrong.Try once more.");
			break;
		case 3:
			System.out.println("Don't give up!");
			break;
		case 4:
			System.out.println("No.Keep trying.");
		}
	}
}
public class A6_31 {
	public static void main(String args[])
	{
		Random xx=new Random();
		int number1=xx.nextInt(10)+1;
		int number2=xx.nextInt(10)+1;
		A suan=new A();
		suan.question1(number1, number2);
		Scanner in=new Scanner(System.in);
		int answer=in.nextInt();
		Boolean boo=true;
		while(boo)
		{	
			
			if(answer==number1*number2)
			{
				suan.correctResponse(xx.nextInt(4)+1);
				boo=false;
			}
			else
			{
				suan.wrongResponse(xx.nextInt(4)+1);
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
				suan.correctResponse(xx.nextInt(4)+1);
				boo=false;
			}
			else
			{
				suan.wrongResponse(xx.nextInt(4)+1);
			}
		}
	}
}
