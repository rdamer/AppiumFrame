package org.rasha.pageobject.android;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class AppiumUtilis {
	AndroidDriver driver;
	public AppiumUtilis(AndroidDriver driver) {
		this.driver=driver;
	}
	
	
	
	
public Double getFormattedAmount(String amount) {
double price = Double.parseDouble(amount.substring(1));
return price ;
}
public void WaitForElementToAppear(WebElement ele) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
wait.until(ExpectedConditions.attributeContains((ele),"text", "Cart"));
}
}
