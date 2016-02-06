package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import support.TestBase;

/**
 * Created by idorovskikh on 1/9/16.
 */
public class LoginSignupSteps extends TestBase {

    @Given("^I login to Instagram app$")
    public void iLoginToInstagramApp(){

    }

    @When("^I tap on Login button$")
    public void iTapOnLoginButton(){
        driver.findElement(By.name("login_btn")).click();

    }


    @Then("^I type \"([^\"]*)\" into username field$")
    public void iTypeIntoUsernameField(String name)  {
        driver.findElement(By.name("user_name")).sendKeys(name);

    }

    @And("^I type \"([^\"]*)\" into password field$")
    public void iTypeIntoPasswordField(String password)  {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @And("^I verify user is logged in$")
    public void iVerifyUserIsLoggedIn()  {
       Boolean result = driver.findElement(By.name("user_list")).isDisplayed();
       Assert.assertTrue(result);
    }
}
