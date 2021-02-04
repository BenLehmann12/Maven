package model;

public class Money {
	private String UserJob;
	private double moneyPerHour;
	
	public Money() {
		
	}
	public Money(String UserJob) {
		UserJob = UserJob;
	}
	
	public String getUserJob() {
		return UserJob;
	}
	public void setUserJob(String userJob) {
		UserJob = userJob;
	}
	public double getMoneyPerHour() {
		return moneyPerHour;
	}
	public void setMoneyPerHour(double moneyPerHour) {
		this.moneyPerHour = moneyPerHour;
	}
	

}
