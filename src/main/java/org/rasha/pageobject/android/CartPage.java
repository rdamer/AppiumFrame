package org.rasha.pageobject.android;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rasha.utils.AndroidActions;
//import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CartPage extends AndroidActions {
	AndroidDriver driver;
	
	public CartPage(AndroidDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
//    List <WebElement> productprice=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
	@AndroidFindBy(id="com.androidsample.generalstore:id/productPrice")
	public List <WebElement> productList;
//	String displaysum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	@AndroidFindBy(id="com.androidsample.generalstore:id/totalAmountLbl")
	public WebElement totalamount;
//    WebElement ele=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
    @AndroidFindBy(id="com.androidsample.generalstore:id/termsButton")
	public WebElement Terms;
//    driver.findElement(By.id("android:id/button1")).click();
    @AndroidFindBy(id="android:id/button1")
 	public WebElement accepybutton;
//    driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
    @AndroidFindBy(id="android.widget.CheckBox")
   	public WebElement procced;
//    driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
    @AndroidFindBy(id="com.androidsample.generalstore:id/btnProceed")
   	public WebElement checkbox;


   public List <WebElement> getproductlist(){
	   return productList;
	   
   }
   public double getProductSum() {
       int count = productList.size();
       double totalsum=0;
       for(int i=0;i<count;i++)
       {
    	   String amountprice = productList.get(i).getText();
       	Double price = Double.parseDouble(amountprice.substring(1));
       	totalsum=totalsum+price;
       }
       	return totalsum;
   }
//   double totalprice = getFormattedAmount(displaysum);
//   Assert.assertEquals(totalsum, totalprice);
   public double getTotalAmountDisplayed() {
	   return getFormattedAmount(totalamount.getText());
	   
   }
   
   }