package edu.xupt.java.homework.chp6;
import java.util.*;

public class A6_31 
{
	
	Random rand = new Random();
	Scanner input = new Scanner(System.in);
	
	public int Question(){
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		System.out.println("How much is "+num1+" times "+num2);
		return num1*num2;
	}
	
	public void doQuestion(){
		int answer = 0;
		int your_ans = 0;
		int count = 0;
		while(count<2){
			answer = Question();
			your_ans = input.nextInt();
			while(answer!=your_ans){
				wrongResponse(rand.nextInt(4)+1);
				your_ans = input.nextInt();
			}
			correctResponse(rand.nextInt(4)+1);
			count++;
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
		A6_31 cu=new A6_31();
		cu.doQuestion();
	}
}
