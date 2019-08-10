package com.sidd.ioc;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is ur lucky day";
		
	}

}
