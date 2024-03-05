package org.rasha.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.rasha.pageobject.android.AppiumUtilis;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AndroidActions extends AppiumUtilis {
AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), driver);
	}
	
	 public void longpressAction(WebElement ele) {
    	 ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
    			  ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
    			  "duration",2000));
     }
     {
     }
    	 public void scrolltoendaction()
    	 {
     
     boolean Scrollmore;
     do
     {
     Scrollmore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
     }while (Scrollmore);
     }
    	 public void scrolltotext(String text)
    	 {
  	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
    	 }  
public Double getFormattedAmount(String amount) {
	    double price = Double.parseDouble(amount.substring(1));
	    return price ;
}
}
