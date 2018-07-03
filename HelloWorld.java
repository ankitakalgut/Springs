package com.bridgelabzSprings.Scope;

/***********************************************************
 * @author Ankita Kalgutkar
 *
 * 28-Jun-2018
 *
 *Purpose:POJO file to accept message.
 ***********************************************************/
public class HelloWorld 
{
	   private String message;

	   public void setMessage(String message)
	   {
	      this.message  = message;
	   }
	   public void getMessage()
	   {
	      System.out.println("Your Message : " + message);
	   }
	}