package edu.xupt.java.homework.chp6;
import java.util.*;

public class A6_32
{
	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	int correct=0,wrong=0,sum=0;
	public int Question(){
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		System.out.println("How much is "+num1+" times "+num2);
		return num1*num2;
	}
	
	public void doQuestion(){
		int answer = 0;
		int your_ans = 0;
		while(sum<10)
		{	
			answer = Question();
			your_ans = input.nextInt();
			if(answer==your_ans)
			{
				correctResponse(rand.nextInt(4)+1);
				correct++;
			}
			else
			{
				wrongResponse(rand.nextInt(4)+1);
				wrong++;
			}
			sum+=1;
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
	public static void main(String args[])
	{
		
		A6_32 cu=new A6_32();
		cu.doQuestion();
		
	}
}

