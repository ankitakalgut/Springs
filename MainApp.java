package com.bridgelabzSprings.NoAutowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**********************************************************************************
 * @author Ankita Kalgutkar
 *
 * 27-Jun-2018
 *Purpose:Load the context and run it.
 *********************************************************************************/
public class MainApp 
{
    public static void main(String args[])
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabzSprings/NoAutowire/autoConfig.xml");
 
        //autowire=default
        Driver driver = (Driver)context.getBean("driver");
        System.out.println("Driver Details : "+driver);   
    }
}