package com.iot.spring;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;
import com.iot.spring.dev.Worker;



public class Excute {
	private Worker w;
	
	public Excute(Worker w) {
		this.w=w;
	}
	
	public void setWorker(Worker w) {
		this.w=w;
	}
	
	public Worker getWorker() {
		return this.w;
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*Resource res = new ClassPathResource("beans.xml");
		XmlBeanFactory bf = new XmlBeanFactory(res);
		System.out.println("beans.xml파싱완료");*/
		
/*		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("파싱만 완료일까?");
		Won w =(Won) ac.getBean("won");
		System.out.println(w);*/
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("ioc.xml");
		Excute e = (Excute)ac.getBean("ex");
		e.getWorker().goToWork();
/*		Designer designer = (Designer)ac.getBean("designer");
		designer.goToWork();
		designer.goToWork();
		designer.getOffWork();*/
		String[] objs = ac.getBeanDefinitionNames();
		System.out.println(objs[1]);
		
		
/*		InputStream is = Excute.class.getResourceAsStream("/bean1.xml");
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = (Document)db.parse(is);
		NodeList nl =  document.getElementsByTagName("bean");
		for(int i=0; i<nl.getLength();i++) {
			Node node = nl.item(i);
			Element e = (Element)node;
			System.out.println(e.getAttribute("id"));
			System.out.println(e.getAttribute("class"));
			Class c = Class.forName(e.getAttribute("class"));
			c.newInstance();
		}*/
		
		
		
/*		Car c = (Car)bf.getBean("c");
		c.printCarInfo();*/
		
/*		Car c=new Kia("소나타");
		Money m = new Won();
		c.setMoney(m);
		m.setMoney(3000000);
		c.printCarInfo();*/
	}
}
