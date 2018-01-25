package com.iot.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iot.spring.anno5.Maker;
import com.iot.spring.anno5.Order;

public class Excute1 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("anno5/ioc.xml");
		Order m = (Order)ac.getBean("order");
		m.printMaker();
		m.printMList();
	}
}
