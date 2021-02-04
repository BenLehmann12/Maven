package model;

public class MoneyMade {
	private String UserJob;
	private double HourlyPay;
	private int UserAge;
	
	public MoneyMade() {
		
	}
	public MoneyMade(String UserJob) {
		UserJob = UserJob;
	}
	
	public String getUserJob() {
		return UserJob;
	}
	public void setUserJob(String userJob) {
		UserJob = userJob;
	}
	public double getHourlyPay() {
		return HourlyPay;
	}
	public void setWeeklyPay(double HourlyPay) {
		this.HourlyPay = HourlyPay;
	}
	public int getUserAge() {
		return UserAge;
	}
	public void setUserAge(int userAge) {
		UserAge = userAge;
	}
	
	

}
