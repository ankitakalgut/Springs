package com.bridgelabzSprings.NoAutowire;

/************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 27-Jun-2018
 * 
 *Purpose:Define Beans to work with
 ************************************************************************************************/

public class License 
{ 
    private String number;
 
    public String getNumber() 
    {
        return number;
    }
 
    public void setNumber(String number)
    {
        this.number = number;
    }
 
    @Override
    public String toString() 
    {
        return "License [number=" + number + "]";
    }
    
}