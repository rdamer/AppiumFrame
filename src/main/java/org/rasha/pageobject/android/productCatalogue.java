package org.rasha.pageobject.android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.rasha.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class productCatalogue extends AndroidActions {
	AndroidDriver driver;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='ADD TO CART']")
	public List <WebElement> addtocard;
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement cardclick;
	// معناتو لازم لما نتست شيء الو علاقة بال  list  نحكيلو ليش لحنا اخترنا list 
	public productCatalogue(AndroidDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), driver);
	}
	public void addingnewitemsbyindex() {
		
	}
	public void additemTocartindex (int index) {
		addtocard.get(index).click();
		
	}
	public CartPage GoToCartPage () throws InterruptedException {
		cardclick.click();
		Thread.sleep(2000);
		return new CartPage(driver);
		
		
}
}
