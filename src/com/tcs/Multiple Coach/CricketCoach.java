package com.tcs.springdemo;

public class CricketCoach implements Coach {
	//define a private field for the dependency
	private FortuneService fortuneService;
		
	//define constructor for dependency injection 
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "B O W L for 1 hr and B A T for 1hr";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
