package com.iot.spring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;


public class Excute {
	public static void main(String[] args) {
		Resource res = new ClassPathResource("beans.xml");
		XmlBeanFactory bf = new XmlBeanFactory(res);
		System.out.println("beans.xml파싱완료");
		Test tt=(Test)bf.getBean("test");
		tt.printTest();
		System.out.println(tt);
		tt=(Test)bf.getBean("test2");
		tt.printTest();

	}
}
