package org.rasha;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.rasha.pageobject.android.CartPage;
import org.rasha.pageobject.android.FormPage;
import org.rasha.pageobject.android.productCatalogue;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class e_Commerce_tc_3_hyprid extends BaseTest {

	@Test
	public void FillForm() throws InterruptedException {
		//xpath=//tagname[@attribute='value']
		formpage.sendname("Rasha");
		formpage.setgender("female");
		formpage.choosecountry("brazil");
		formpage.pressbasket();
		productCatalogue ProductCatalogue= formpage.pressbasket();
		ProductCatalogue.additemTocartindex(0);
		ProductCatalogue.additemTocartindex(0);
		CartPage cartpage=ProductCatalogue.GoToCartPage();
//        driver.pressKey(new KeyEvent(AndroidKey.BACK ));
		//بدنا نعمل  scrolldown  حتى يلاقي اسم البلد اذا ما كانت مبينة
//        String toastvalue=driver.findElement(By.xpath("//android.widget.Toast")).getAttribute("name");
//  	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
//        List <WebElement> productprice=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        
        
//        	String displaysum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//        	
//            
//            WebElement ele=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
//            longpressAction(ele);
//            driver.findElement(By.id("android:id/button1")).click();
//            driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
//            driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
//            Thread.sleep(6000);
            
            //Hybrid-mean having both Andriod native and Webbrowser
            //we have to get the contexet 
//            Set <String> context=driver.getContextHandles();
//            for (String contextName:context)
//            {
//            System.out.println(contextName);
//            }
//            
//            driver.context("WEBVIEW_com.androidsample.generalstore");
            //here we are in browser level -we have to think as web automation and we can get locaters for the browser itself
            //in google there is a lot of locater with name ( speacilly q) and we can use it becuase we are in the level of browser
//            driver.findElement(By.name("q")).sendKeys("rasha");
//            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//            //but when we wont to press any button into the mobile we need to think about appium keys that we have talk about it 
//            driver.pressKey(new KeyEvent(AndroidKey.BACK ));
//            driver.context("NATIVE_APP");
        }
        	
}