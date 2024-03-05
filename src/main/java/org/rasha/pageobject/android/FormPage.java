package org.rasha.pageobject.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rasha.utils.AndroidActions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class FormPage extends AndroidActions {
	AndroidDriver driver;
	
	public FormPage(AndroidDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rasha");
      @AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
      private WebElement nameField;
      
      @AndroidFindBy(xpath="//android.widget.RadioButton[@text='Female")
      private WebElement femaloption;
		//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']"))
      
      @AndroidFindBy(xpath="//android.widget.RadioButton[@text='Male")
      private WebElement maloption;
		//driver.findElement(By.xpath("//android.widget.RadioButton[@text='Male']"))
      
      @AndroidFindBy(id="android:id/text1")
      private WebElement dropdown;
      //watch the id of dropdown maype its wrong
      
      @AndroidFindBy(xpath="//android.widget.TextView[@text='Brazil']")
      private WebElement brazil;
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Brazil']")).click();

      @AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
      private WebElement shopbasket;

      
      
      
      
      public void sendname(String name) {
    	  nameField.sendKeys(name);  
  		   driver.hideKeyboard();
//  			Thread.sleep(5);
      }
      public void setgender(String gender) 
      {
    	  if (gender.contains("female"))
          femaloption.click();
          else
          maloption.click();  
    	  
      }
       public void choosecountry(String countryName) {
    	   //we need to put the tree test cases into it and we have to define it as on into thereal test case page 
    	   dropdown.click();
    	   scrolltotext(countryName);
   		driver.findElement(By.xpath("//android.widget.TextView[@text='countryName']")).click();
    	   
    	   
       }
       public productCatalogue pressbasket() {
    	   shopbasket.click();
    	   return new productCatalogue(driver);
}
}

