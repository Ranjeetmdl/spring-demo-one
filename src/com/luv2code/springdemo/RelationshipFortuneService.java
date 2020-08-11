package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RelationshipFortuneService implements FortuneService {
	static List<String> fortunes=new ArrayList<String>();
	static{
		fortunes.add("You gonna soon find an awesome partner!!");
		fortunes.add("Your partner is going to support your in your career and goal!!");
		fortunes.add("She/He loves you unconditionally!!");
	}

	@Override
	public String getFortune() {
		Random random=new Random();
		return fortunes.get(random.nextInt(3));
	}

}
