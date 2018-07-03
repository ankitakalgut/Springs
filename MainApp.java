package com.bridgelabzSprings.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 28-Jun-2018
 *Purpose:Scope:*Singleton :Only one instance of object is created.(use scope="singleton")in xml file.
                *Prototype:Many instances of an object is created.(use scope="prototype")in xml file.
 ************************************************************************************************/
public class MainApp
{
   public static void main(String[] args) 
   {
	  ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabzSprings/Scope/Beans.xml");
      //Singleton Scope
	  HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.setMessage("Welcome!!!!!!");
      obj.getMessage();
      System.out.println(obj.hashCode());
      HelloWorld obj1= (HelloWorld) context.getBean("helloWorld");
      obj1.setMessage("Welcme!!!!!!");
      obj1.getMessage();
      System.out.println(obj1.hashCode());
      //prototype scope
      HelloWorld obj2= (HelloWorld) context.getBean("helloWorld1");
      obj2.getMessage();
      System.out.println(obj2.hashCode());
      
      HelloWorld obj3= (HelloWorld) context.getBean("helloWorld1");
      obj3.getMessage();
      System.out.println(obj3.hashCode());
   }
}