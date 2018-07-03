package com.bridgelabzSprings.AutowireByConstructor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*****************************************************************************
 * @author Ankita Kalgutkar
 *
 * 27-JUN-2018
 *
 *PURPOSE:Load the context and run it
 *******************************************************************************/
public class MainApp
{
	 public static void main(String args[])
	 {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext
		 ("com/bridgelabzSprings/AutowireByConstructor/appConfig.xml");
	     //autowire=constructor
	     Performer performer = (Performer)context.getBean("performer");
	     System.out.println("Performer Details : "+performer);
	 } 
}