package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.CccontactusHomePage;
import com.crowdar.examples.pages.CccontactusResultOkPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CccontactusSteps extends PageSteps {

    @Given("the client is in contact-us page")
    public void home() {
        Injector._page(CccontactusHomePage.class).go();
    }

    @When("the Client enters his Name (.*)")
    public void name(String name) {
        Injector._page(CccontactusHomePage.class).name(name);
    }

    @And("the Client enters his Lastname (.*)")
    public void lastname(String lastname) {
        Injector._page(CccontactusHomePage.class).lastname(lastname);
    }

    @And("the Client enters his EmailAddress (.*)")
    public void emailaddress(String emailaddress) {
        Injector._page(CccontactusHomePage.class).emailaddress(emailaddress);
    }

    @And("the Client enters his Message (.*)")
    public void message(String message) {
        Injector._page(CccontactusHomePage.class).message(message);
        Injector._page(CccontactusHomePage.class).clickSubmitButton();
    }


    @Then("the client verifies that the message is sent correctly")
    public void statMessageVerification() {
    Assert.assertTrue(!Injector._page(CccontactusResultOkPage.class).getStatsMessageok().isEmpty());

    }

}
