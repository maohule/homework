package edu.xupt.java.homework.chp6;

public class Distance {
	double x1,x2,y1,y2,a,b,c,juLi;
	Distance(double x1,double y1,double x2,double y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public double getDistance()
	{
		a=x2-x1;
		b=y2-y1;
		c=a*a+b*b;
		juLi=Math.sqrt(c);
		return juLi;
	}
}
