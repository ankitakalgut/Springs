package com.bridgelabzSprings.AutowiredAnnotationProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
   public static void main(String[] args) 
   {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabzSprings/AutowiredAnnotationProperties/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}