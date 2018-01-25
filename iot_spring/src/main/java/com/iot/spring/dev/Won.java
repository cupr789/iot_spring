package com.iot.spring.dev;

import org.springframework.stereotype.Component;

@Component("won")  //어노테이션 옆에 괄호를 넣으면 id 부여도 가능, 안넣었다면 그냥 클래스 이름이 소문자로 바뀐 문자로 아이디가 됨
public class Won {
	private int money;

	public Won() {
		System.out.println("원이 생성된단말이지!?!?!?!?!?!?!?!?!??");
	}
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
