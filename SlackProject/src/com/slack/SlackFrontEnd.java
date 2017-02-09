package com.slack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SlackFrontEnd {

	WebDriver driver;

	@Test
	public void slack() {

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://slack.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.id("domain")).sendKeys("innovation12345");

		driver.findElement(By.id("submit_team_domain")).click();

		driver.findElement(By.id("email")).sendKeys("rangakanchana@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Krish_2010");

		driver.findElement(By.id("signin_btn")).click();

		WebElement element = driver.findElement(By.xpath("//textarea[@id='msg_input']"));

		element.sendKeys("how can I see my messages?");

		element.sendKeys(Keys.ENTER);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> stars = driver.findElements(By.xpath("//span[@class='message_star_holder']"));

		stars.get(stars.size() - 1).click();

		WebElement search = driver.findElement(By.id("search_terms"));
		search.sendKeys("has:star");
		search.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("stars_toggle" )).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> messages = driver.findElements(By.xpath(".//*[@id='member_stars_list']/div"));////div[@class='search_message_result_text ']

		int no_Of_Messages = messages.size();

		System.out.println(no_Of_Messages);

		for (int i=0;i<no_Of_Messages;i++) {

	    String[] message=messages.get(i).getText().split("\n");
	    
	    
	    
	    //System.out.println(message);
	    
	    String newmessage = message[0]+message[1]+message[2]+message[3]+message[4]+message[5];
	    String actualMessage = message[5];
	    
	    System.out.println(message[0]);
	    System.out.println(message[1]);
	    System.out.println(message[2]);
	    System.out.println(message[3]);
	    
	     System.out.println(newmessage);
	     System.out.println(actualMessage);

	     
	    //Assert.assertTrue(newmessage.contains("how can I see my messages?"),"messages doesnot contain the required text message");
	    
	    Assert.assertEquals(actualMessage,"how can I see my messages?");
	    }
		
		
		System.out.println("the testcase passed");
		
		driver.close();


	}
}
