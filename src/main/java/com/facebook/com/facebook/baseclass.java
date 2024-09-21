package com.facebook.com.facebook;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	public static WebDriver driver;
	public static void inialization()
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/reg");
		}

	
	public static void dropdown(WebElement wb, String b ) {
		Select sel = new Select(wb);
		List<WebElement> ls = sel.getOptions();
		for(WebElement a : ls)
		{
			if(a.equals(b))
			{
				a.click();
			}
		}
	}
}
