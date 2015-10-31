package edu.xupt.java.homework.chp6;
import java.util.*;
class B
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
public class A6_32 {
	public static void main(String args[])
	{
		Random xx=new Random();
		Scanner in=new Scanner(System.in);
		B suan=new B();
		boolean boo=true;
		int number1=0,number2=0,correct=0,wrong=0,sum=0;
		while(sum<=10)
		{	
			number1=xx.nextInt(10)+1;
			number2=xx.nextInt(10)+1;
			suan.question1(number1, number2);
			int answer=in.nextInt();
			if(answer==number1*number2)
			{
				suan.correctResponse(xx.nextInt(4)+1);
				correct++;
			}
			else
			{
				suan.wrongResponse(xx.nextInt(4)+1);
				wrong++;
			}
			sum=correct+wrong;
			if(sum==10)
			{
				double avg=correct/10.0;
				if(avg<0.75)
				{
					System.out.println("Please ask your instructor for extra help");
					correct=0;
					wrong=0;
					sum=0;
				}
			}
		}
		while(boo)
		{
			suan.question2();
			int answer=in.nextInt();
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

