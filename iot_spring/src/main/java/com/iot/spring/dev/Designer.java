package com.iot.spring.dev;

public class Designer implements Worker{

	@Override
	public void goToWork() {
		System.out.println("디자이너가 출근");
		
	}

	@Override
	public void work() {
		System.out.println("디자이너가 일중");
		
	}

	@Override
	public void getOffWork() {
		System.out.println("디자이너가 퇴근");
		
	}

}
