package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.LoginPage;
import starter.pages.ProductsPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    ProductsPage productsPage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://www.saucedemo.com/");
        Assertions.assertTrue(loginPage.validateOnLoginPage());
    }

    @When("I input valid username")
    public void inputValidUsername() {
        loginPage.inputUsername("standard_user");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the products page")
    public void onTheProductsPage() {
        Assertions.assertTrue(productsPage.validateOnProductsPage());
    }

    @When("I input locked username")
    public void inputLockedUsername() {
        loginPage.inputUsername("locked_out_user");
    }

    @Then("I get error message {string}")
    public void getErrorMessage(String message) {
        Assertions.assertTrue(loginPage.validateErrorMessageIsDisplayed());
        Assertions.assertTrue(loginPage.validateEqualErrorMessage(message));
    }
}
