package com.bridgelabzSprings.RequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*******************************************************************************
 * @author Ankita Kalgutkar
 *
 * 28-Jun-2018
 *Purpose:
 ****************************************************************************/
public class MainApp 
{
   public static void main(String[] args) 
   {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabzSprings/RequiredAnnotation/Beans.xml");
      
      Student student = (Student) context.getBean("student");
      System.out.println("Name : " + student.getName() );
      System.out.println("Age : " + student.getAge() );
   }
}