package com.facebook.com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.facebook.com.facebook.baseclass;

public class Registration_page extends baseclass {
	static WebElement Button;
	static WebElement firstname;
	static WebElement lastname;
	static WebElement email;
	static WebElement password ;
	static WebElement Day;
	static WebElement month;
	static WebElement year;
	static WebElement genderFemale;
	static WebElement genderMale;
	static WebElement genderCustom;
	static WebElement signUp;
	
	
	public Registration_page(){
       Button = driver.findElement(By.xpath("//div/a[text()='Create new account']"));
	   firstname = driver.findElement(By.name("firstname"));
	   lastname = driver.findElement(By.name("lastname"));
	   email=  driver.findElement(By.name("reg_email__"));
	   password =driver.findElement(By.id("password_step_input"));
	   Day= driver.findElement(By.xpath("//select[@id='day']"));
	   month = driver.findElement(By.xpath("//select[@id='month']"));
	   year = driver.findElement(By.xpath("//select[@id='year']"));
	   genderFemale = driver.findElement(By.xpath("//input[@type='radio']/parent::span//label[text()='Female']"));
	   genderMale = driver.findElement(By.xpath("//input[@type='radio']/parent::span//label[text()='Male']"));
	   genderCustom = driver.findElement(By.xpath("//input[@type='radio']/parent::span//label[text()='Custom']"));
	   signUp = driver.findElement(By.xpath("//button[@id='u_1f_n_66']"));
	}
	
	public static void CreateNewAccount()
	{
		Button.click();
	}
	public static void firstname(String c) {
		firstname.sendKeys(c);		
	}
	public static void lastname(String c) {
		lastname.sendKeys(c);		
	}
	public static void email(String c) {
		email.sendKeys(c);		
	}
	public static void password(String c) {
		password.sendKeys(c);		
	}
	public static void day(String c) {
		dropdown(Day, "13");		
	}
	public static void month(String c) {
		dropdown(month, "13");		
	}
	public static void year(String c) {
		dropdown(year, "13");		
	}
	public static void genderFemale()
	{
		genderFemale.click();
	}
	public static void genderMale()
	{
		genderMale.click();
	}
	public static void genderCustom()
	{
		genderCustom.click();
	}
	public static void clickSignUp()
	{
		signUp.click();
	}

}
