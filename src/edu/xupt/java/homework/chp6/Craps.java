package edu.xupt.java.homework.chp6;
import java.util.*;
public class Craps {
	private Random randomNumbers=new Random();
	private enum Status{CONTINUE,WON,LOST};
	private final static int SNAKE_EYES=2;
	private final static int TREY=3;
	private final static int SEVEN=7;
	private final static int YO_LEVEN=11;
	private final static int BOX_CARS=12;
	Boolean boo=true;
	int bankBalance=1000;
	int wager=0;
	Scanner in=new Scanner(System.in);
	Craps()
	{
		panDuan();
	}
	public void play()
	{
		int myPoint=0;
		Status gameStatus;
		int sumOfDice=rollDice();
		switch(sumOfDice)
		{
		case SEVEN:
		case YO_LEVEN:
			gameStatus=Status.WON;
			break;
		case SNAKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus=Status.CONTINUE;
			myPoint=sumOfDice;
			System.out.printf("Point is %d\n",myPoint);
			break;
		default:
			gameStatus=Status.CONTINUE;
			myPoint=sumOfDice;
			System.out.printf("Point is %d\n",myPoint);
			break;
		}
		while(gameStatus==Status.CONTINUE)
		{
			notice(1+randomNumbers.nextInt(3));
			panDuan();
			sumOfDice=rollDice();
			if(sumOfDice==myPoint)
				gameStatus=Status.WON;
			else
				if(sumOfDice==SEVEN)
					gameStatus=Status.LOST;
		}
		if(gameStatus==Status.WON)
		{
			System.out.println("Player wins");
			bankBalance=bankBalance+wager;
			System.out.println("你的钱还有："+bankBalance);
		}
		else
		{
			System.out.println("Player loses");
			bankBalance=bankBalance-wager;
			System.out.println("你的钱还有："+bankBalance);
			if(bankBalance==0)
			{
				System.out.println("Sorry.You busted!");
			}
		}
	}
	public int rollDice()
	{
		int die1=1+randomNumbers.nextInt(6);
		int die2=1+randomNumbers.nextInt(6);
		int sum=die1+die2;
		System.out.printf("Player rolled %d + %d= %d\n",die1,die2,sum);
		return sum;
	}
	public void notice(int c)
	{
		switch(c)
		{
		case 1:
			System.out.println("oh,you are going for broke?");
			break;
		case 2:
			System.out.println("Aw c'mom,take a chance!");
			break;
		case 3:
			System.out.println("You are up big.Now's the time to cash in your chips!");
			
		}
	}
	public void panDuan()
	{
		while(boo)
		{
			System.out.println("请输入你的赌注：");
			int a=in.nextInt();
			wager=a+wager;
			if(wager<=bankBalance)
			{
				boo=false;
			}
			else
			{
				wager=wager-a;
			}
		}
		boo=true;
	}
}
