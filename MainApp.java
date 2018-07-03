package com.bridgelabzSprings.AutowiredAnnotation;

import org.springframework.context.ApplicationContext;
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
   public static void main(String[] args) 
   {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabzSprings/AutowiredAnnotation/Beans.xml");

      TextEditor te = (TextEditor) context.getBean("textEditor");

      te.spellCheck();
   }
}