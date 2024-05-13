package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {
    private By title() {
    return By.className("app_logo");
    }


    private By addToCartButton() {
        return By.id("add-to-cart-sauce-labs-backpack");
    }
    private By cartCounter() {
        return By.className("shopping_cart_badge");
    }

    @Step
    public boolean validateOnProductsPage() {
       return $(title()).isDisplayed();
    }

    @Step
    public void clickItemToCart() {
        $(addToCartButton()).click();
    }

    @Step
    public boolean validateCartCounterIsDisplayed() {
        return $(cartCounter()).isDisplayed();
    }

    @Step
    public boolean validateCartCounter() {
        return $(cartCounter()).getText().equals("1");
    }
}

