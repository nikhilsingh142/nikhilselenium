package com.Filpkart.Shopping;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src\\main\\resources"
 ,glue={"TestSteps"}
 )
 
public class TestRunner {
 
}

