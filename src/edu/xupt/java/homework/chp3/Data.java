package edu.xupt.java.homework.chp3;

public class Data {
	int month,day,year;
	Data(int month,int day,int year)
	{
		this.month=month;
		this.day=day;
		this.year=year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate()
	{
		System.out.println(month+"月/"+day+"日/"+year+"年");
	}
}
