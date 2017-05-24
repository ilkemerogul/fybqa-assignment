package com.fyber.stepdefs;

/**
 * Created by eroguli on 24/05/2017.
 */

import com.fyber.MD5Model;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.fyber.stepdefs.Hooks.driver;
import static com.fyber.stepdefs.Hooks.waitForPageLoaded;

public class Md5StepDefs {

    String baseURL = "http://md5.jsontest.com/?text=";
    String remoteMD5, calculatedMD5;

    @Given("^I navigate to md5jsontestcom with parameter '(.*)'$")
    public void iNavigateToMd5Com(String parameter) {
        waitForPageLoaded();
        driver.get(baseURL + parameter);
    }

    @When("^I parse returned md5 from parameter with '(.*)'$")
    public void iParseReturnedMd5FromParameterWithParameter(String parameter) {
        waitForPageLoaded();
        Gson gson = new GsonBuilder().create();

        // Firefox behaves different than Chrome. In order to cover both browsers I wrote the if statement below and switched to "Raw Data" view.

        if (System.getProperty("browser").equalsIgnoreCase("firefox")) {
            driver.findElement(By.linkText("Raw Data")).click();
        }
        MD5Model md5Model = gson.fromJson(driver.findElement(By.tagName("pre")).getText(), MD5Model.class);

        remoteMD5 = md5Model.getMd5();
        calculatedMD5 = DigestUtils.md5Hex(parameter);
    }

    @Then("^It should match with java comparison$")
    public void itShouldMatchWithJavaComparison() {
        Assert.assertEquals(remoteMD5, calculatedMD5);
    }
}
