package com.fyber;

/**
 * Created by eroguli on 24/05/2017.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:target/cucumber.json",
        features = {"classpath:features"},
        glue = {"com.fyber"},
        tags = {"~@ignore"})
public class RunCukesTest {

}
