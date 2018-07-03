package com.bridgelabzSprings.NoAutowire;

/************************************************************************************************
 * @author Ankita Kalgutkar
 *
 * 27-Jun-2018
 * 
 *Purpose:Define Beans to work with
 ************************************************************************************************/
public class Driver 
{ 
    private License license;
     
    public void setLicense(License license) 
    {
        this.license = license;
    }
 
    public License getLicense()
    {
        return license;
    }
 
    @Override
    public String toString() 
    {
        return "Driver [license=" + license + "]";
    }
}