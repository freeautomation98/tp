package com.facebook.com.facebook;

import PageObject.Registration_page;

public class App extends baseclass 
{
    public static void main( String[] args )
    {
    	baseclass b = new baseclass();
    	b.inialization();
    	Registration_page r=new Registration_page();
    	r.CreateNewAccount();
		r.firstname("Maay");
		r.lastname("Ghalichyaaaaa");
		r.email("mayghalichumy@gamil.com");
		r.password("Taklu@4321");
		r.day("12");
		r.month("Aug");
		r.year("1994");
		r.genderMale();
		r.clickSignUp();
    }
}
