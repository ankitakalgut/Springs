package com.bridgelabzSprings.AutowireByConstructor;
 
/*****************************************************************************
 * @author Ankita Kalgutkar
 *
 * 28-Jun-2018
 *
 *Purpose:Define Beans to work with
 ******************************************************************************/
public class Performer 
{
   private Instrument instrument;
    
   public Performer(Instrument instrument)
   {
       this.instrument = instrument;
   }

   @Override
   public String toString() 
   {
       return "Performer [instrument=" + instrument + "]";
   }
}