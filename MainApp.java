package com.bridgelabzSprings.AutowireByType;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*******************************************************************************************************
 * @author Ankita Kalgutkar
 *
 *28-Jun-2018
 *
 *Purpose:Load the context and run it.
 *****************************************************************************************************/
public class MainApp
{
	public static void main(String args[])
	{
	    AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabzSprings/AutowireByType/appConfig.xml");
	    //autowire=byType
	    Employee employee = (Employee)context.getBean("employee");
	    System.out.println("Employee Details : "+employee);
	 }
}

