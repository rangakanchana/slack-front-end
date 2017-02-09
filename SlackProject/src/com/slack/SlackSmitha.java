package com.slack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SlackSmitha {
	
WebDriver driver;
	
	@Test
	public void slack(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://slack.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("domain")).sendKeys("ipsnetwork");
		
		driver.findElement(By.id("submit_team_domain")).click();
		
		driver.findElement(By.id("email")).sendKeys("smitha.surekha@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Innovapath1");
		
		driver.findElement(By.id("signin_btn" )).click();
		
		//enter text in message box
		WebElement msg = driver.findElement(By.xpath(".//*[@id='msg_input']"));
		msg.sendKeys("Hi hello");
		msg.sendKeys(Keys.ENTER);
			//}
		//public String starMessage() {

	    Actions action = new Actions(driver);
			        // Gets all the messages in the history.
			        List<WebElement> web = driver.findElements(By.className("day_msgs"));

			        // Get the last day.
			        WebElement day = web.get(web.size() - 1);

			        // Get the last message in the day.
			        List<WebElement> id = day.findElements(By.className("message"));
			        WebElement message = id.get(id.size() - 1);

			        String href = message.findElement(By.className("timestamp")).getAttribute("href");
			        WebElement messageBody = message.findElement(By.className("message_body"));
			        action.moveToElement(messageBody).perform();
			        WebElement messageContent = message.findElement(By.className("message_content"));
			        // Since this element is visible after hover, webElement.click() doesn't work and it throws an exception
			        // waiting for the visibility of it. Hence using javascript to click on the star message.
			       /* WebDriverUtils.jsClick(messageContent.findElement(By.className("star_message")));
			        return href;
			    }
			    
			        public void clickSearchTextBox() {
			            WebElement searchTextBox;
			            searchTextBox.clear();
			            searchTextBox.sendKeys("has:star");
			            searchTextBox.sendKeys(Keys.ENTER);
			        }	            

			        public String getEnteredInput(String path) {
			            return getWebelementForEnteredInput().findElement(By.className(path)).getText();
			        }

			        public WebElement getWebelementForEnteredInput() {
			            // Gets all the messages in the history.
			            List<WebElement> web = driver.findElements(By.className("day_msgs"));

			            // Get the last day.
			            WebElement day = web.get(web.size() - 1);

			            // Get the last message in the day.
			            List<WebElement> id = day.findElements(By.className("message"));
			            WebElement message = id.get(id.size() - 1);

			            return message.findElement(By.className("message_body"));
			        }
				
				}
			
		}
			
		Click here to Reply or Forward
		2.35 GB (15%) of 15 GB used
		Manage
		Terms - Privacy
		Last account activity: 19 minutes ago
		Details
		Surekha smitha
		Add to circles

		Show details*/

	}
	

}
