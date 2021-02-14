package practica;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("recursospractica/xml/beans_constructorargs.xml");
		ApplicationContext appContext1 =	
				new ClassPathXmlApplicationContext("recursospractica/xml/beans_constructorargs.xml");
		Centro direc = (Centro) appContext1.getBean("ingles");
		System.out.println(direc.toString());
		
		
	}
}
