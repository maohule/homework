package edu.xupt.java.homework.chp6;
import java.util.Random;
import java.util.Scanner;
public class A6_30{
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
				System.out.println("try again");
				your_ans = input.nextInt();
			}
			System.out.println("your win");
			count++;
		}
	}
	
	public static void main(String args[]){
		A6_30 cu=new A6_30();
		cu.doQuestion();
	}
}
