package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
	FortuneService fortuneService;

	public TrackCoach() {
		System.out.println("TrackCoach-inside no-arg constructor!");
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		System.out.println("TrackCoach-inside arg constructor!");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It :" + fortuneService.getFortune();
	}

	public void doMyStartUpStuff() {
		System.out.println("TrackCoach-inside doMyStartUpStuff ");
	}

	@Override
	public void destroy() {
		System.out.println("TrackCoach-inside doMyCleanUpStuffYoYo ");
	}

}
