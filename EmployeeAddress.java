package com.bridgelabzSprings.AutowireByType;
/****************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 27-Jun-2018
 *
 *Purpose:Define Beans to work with
 *****************************************************************************************/

public class EmployeeAddress
{
   private String Street;
   private String city;

   public String getStreet() 
   {
       return Street;
   }

   public void setStreet(String street)
   {
       Street = street;
   }

   public String getCity() 
   {
       return city;
   }

   public void setCity(String city) 
   {
       this.city = city;
   }

   @Override
   public String toString() 
   {
       return "EmployeeAddress [Street=" + Street + ", city=" + city + "]";
   }
}