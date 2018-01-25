package com.iot.spring.anno5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("kkk") 
public class Kia implements Maker{
	public void printName() {
		System.out.println("기아차~");
	}
}
