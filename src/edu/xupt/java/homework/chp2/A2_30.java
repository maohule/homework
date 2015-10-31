package edu.xupt.java.homework.chp2;

import java.util.Scanner;

public class A2_30 {
	public static void main(String[] args) {
		int number=0,d5,d4,d3,d2,d1;
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个5位数字：");
		number=in.nextInt();
		d5=number/10000;
		d4=number%10000/1000;
		d3=number%1000/100;
		d2=number%100/10;
		d1=number%10;
		System.out.println(d5+"   "+d4+"   "+d3+"   "+d2+"   "+d1);
		}
		
}
