package com.bridgelabzSprings.AutowireByType;

/****************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 27-Jun-2018
 *
 *Purpose:Define Beans to work with
 *****************************************************************************************/
public class Employee 
{

   private EmployeeAddress address;

   public EmployeeAddress getAddress() 
   {
       return address;
   }

   public void setAddress(EmployeeAddress address) 
   {
       this.address = address;
   }

   @Override
   public String toString() 
   {
       return "Employee [address=" + address + "]";
   }
}