package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.ProductsPage;

public class CartSteps {
    @Steps
    ProductsPage productsPage;

    @And("I add item to the cart")
    public void addItemToCart() {
        productsPage.clickItemToCart();
    }

    @Then("the item is added to the cart")
    public void itemIsAddedToCart() {
        Assertions.assertTrue(productsPage.validateCartCounterIsDisplayed());
        Assertions.assertTrue(productsPage.validateCartCounter());
    }
}
