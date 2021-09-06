package com.tcs.springdemo;

public class TrackCoach implements Coach {
	//define a private field for the dependency
		private FortuneService fortuneService;
			
		//define constructor for dependency injection 
		public TrackCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
		}
		
		public TrackCoach() {
			
		}
	@Override
	public String getDailyWorkout() {
		return "R U N";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just believe you will " + fortuneService.getFortune();
	}

}
