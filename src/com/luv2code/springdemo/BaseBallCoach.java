package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {
	private FortuneService fortuneService;

	public BaseBallCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spent 30 minutes on batting practice!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
