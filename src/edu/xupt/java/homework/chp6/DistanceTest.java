package edu.xupt.java.homework.chp6;
import java.util.Scanner;
public class DistanceTest {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("请输入x1的坐标");
	double x1=in.nextDouble();
	System.out.println("请输入y1的坐标");
	double y1=in.nextDouble();
	System.out.println("请输入x2的坐标");
	double x2=in.nextDouble();
	System.out.println("请输入y2的坐标");
	double y2=in.nextDouble();
	Distance a=new Distance(x1,y1,x2,y2);
	System.out.println("("+(int)x1+","+(int)y1+")"+"和"+"("+(int)x2+","+(int)y2+")"+"两点之间的距离为："+a.getDistance());
	}
}
