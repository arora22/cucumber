package com.romal;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author ROMAL.ARORA
 *
 * @description Runner class to execute all available tests/features
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = { "classpath:features" }, plugin = { "pretty", "html:target/cucumber" }, glue = {
      "com.romal.stepdefinitions" })
public class TestRunner {
}
