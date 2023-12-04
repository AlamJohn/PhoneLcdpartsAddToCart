package addToCartPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsAddToCartPage {

	public ProductsAddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//span[@class='title' and text()='Samsung']") 
	public WebElement clickOnSamsung; 
	public void clickOnList() {
		clickOnSamsung.click();
	}
	
	
	@FindBy(xpath="//span[@class='title' and text()='Galaxy S23 Ultra']")
	public WebElement choseSamsungModel;
	
	public void SelectSamsungModel(){
		choseSamsungModel.click();
	}
	
	@FindBy(xpath="//body/div[2]/main[1]/div[1]/div[1]/div[1]"
			+ "/div[1]/div[3]/div[3]/ol[1]/li[1]/div[1]/div[1]"
			+ "/div[2]/div[2]/div[1]/form[1]/div[1]/button[2]")
	
	public WebElement addProducts;
	
	public void ClickOnAddButton(){
		addProducts.click();
		
	}
	
	
	
}
