package edu.xupt.java.homework.chp3;

public class EmployeeText {

	public static void main(String[] args) {
		
		Employee a=new Employee("张","三",2000);
		Employee b=new Employee("李","四",3000);
		double aYearPay=12*a.getMonthPay(),
			   bYearPay=12*b.getMonthPay();
		System.out.println(a.getXingName()+a.getMingName()+"的年工资为："+aYearPay+"元");
		System.out.println(b.getXingName()+b.getMingName()+"的年工资为："+bYearPay+"元");
		a.setMonthPay(a.getMonthPay()+a.getMonthPay()*0.1);
		aYearPay=a.getMonthPay()*12;
		b.setMonthPay(b.getMonthPay()+b.getMonthPay()*0.1);
		bYearPay=b.getMonthPay()*12;
		System.out.println("工资涨了10%之后"+a.getXingName()+a.getMingName()+"的年工资为："+aYearPay+"元");
		System.out.println("工资涨了10%之后"+b.getXingName()+b.getMingName()+"的年工资为："+bYearPay+"元");
		
	}

}
