
package com.bridgelabzSprings.QualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/******************************************************************************
 * @author Ankita Kalgutkar
 *
 * 28-Jun-2018
 *Purpose:If you want to create more than one bean of the same type and to to wire 
 *        only one of them with property then use @qualifier along with @autowired 
 *        to remove confusion by specifying which exact bean is required.
 ********************************************************************************/
public class MainApp 
{
   public static void main(String[] args) 
   {
      @SuppressWarnings("resource")
      ApplicationContext context = new ClassPathXmlApplicationContext("com/bridgelabzSprings/QualifierAnnotation/Beans.xml");
      Profile profile = (Profile) context.getBean("profile");
      profile.printAge();
      profile.printName();
   }
}