package edu.xupt.java.homework.chp3;

public class DataTest {

	public static void main(String[] args) {
		Data a=new Data(9,25,1992);
		a.displayDate();
		a.setMonth(10);
		a.setYear(2015);
		a.setDay(1);
		a.displayDate();
		System.out.println(a.getYear()+"年"+a.getMonth()+"月"+a.getDay()+"日是个好日子");
	}

}
