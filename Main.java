package com.bridgelabzSprings.ConstructorDependency;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;  

/***********************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 28-Jun-2018
 * 
 *Purpose:Exceution of bean.
 ***********************************************************************************************/
@SuppressWarnings("deprecation")
public class Main
{  
    public static void main(String[] args) 
    {  
        Resource r=new ClassPathResource("com/bridgelabzSprings/ConstructorDependency/applicationContext.xml");  
		BeanFactory factory=new XmlBeanFactory(r);  
        Book b=(Book)factory.getBean("book");  
        b.display();  
    }  

}