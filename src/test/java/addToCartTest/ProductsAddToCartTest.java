package addToCartTest;

import org.testng.annotations.Test;

import BaseTest.LaunchApplication;
import addToCartPage.ProductsAddToCartPage;

public class ProductsAddToCartTest extends LaunchApplication {

	ProductsAddToCartPage cart;

	@Test
	public void ProductsAddToCartTest() {
        cart = new ProductsAddToCartPage(driver);
		cart.clickOnList();
		cart.SelectSamsungModel();

		for (int i = 0; i < 10; i++) {
			cart.ClickOnAddButton();
		}

	}

}
