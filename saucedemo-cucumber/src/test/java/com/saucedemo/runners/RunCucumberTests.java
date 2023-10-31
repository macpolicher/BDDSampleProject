package com.saucedemo.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"com.saucedemo.steps"},
//        tags = ("@validCompleteOrder"),
        plugin = {"json:target/cucumber.json"}
        )


public class RunCucumberTests {

}
