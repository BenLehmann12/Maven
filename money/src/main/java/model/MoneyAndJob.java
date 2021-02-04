package model;
import java.util.Scanner;

public class MoneyAndJob {
	public double WeeklyPay(MoneyMade money) {
		System.out.println("How many hours a week do you work");
		Scanner scan = new Scanner(System.in);
		int hours = scan.nextInt();
		double weeklyIncome = 0;
		weeklyIncome = money.getHourlyPay()*hours;
		return weeklyIncome;
	}

}
