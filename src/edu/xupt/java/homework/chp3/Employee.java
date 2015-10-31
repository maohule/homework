package edu.xupt.java.homework.chp3;

public class Employee {
	String xingName,mingName;
	double monthPay;
	public Employee(String xingName,String mingName,double monthPay)
	{
		this.xingName=xingName;
		this.mingName=mingName;
		if(monthPay>0)
			this.monthPay=monthPay;
		else 
			this.monthPay=0.0;
	}
	public String getXingName() {
		return xingName;
	}
	public void setXingName(String xingName) {
		this.xingName = xingName;
	}
	public String getMingName() {
		return mingName;
	}
	public void setMingName(String mingName) {
		this.mingName = mingName;
	}
	public double getMonthPay() {
		return monthPay;
	}	
	public void setMonthPay(double monthPay) {
		if(monthPay>0)
			this.monthPay = monthPay;
		else 
			this.monthPay=0.0;
	}
}
