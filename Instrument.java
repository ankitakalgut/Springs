package com.bridgelabzSprings.AutowireByConstructor;

/*********************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 27-jUN-2018
 *
 *PURPOSE: ‘Performer’ class has a constructor which accepts a ‘Instrument’ type argument.
 *********************************************************************************************/
public class Instrument 
{ 
    private String name;
 
    public String getName() 
    {
        return name;
    }
 
    public void setName(String name)
    {
        this.name = name;
    }
 
    @Override
    public String toString()
    {
        return "Instrument [name=" + name + "]";
    }
}