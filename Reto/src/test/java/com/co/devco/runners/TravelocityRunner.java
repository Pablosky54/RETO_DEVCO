package com.co.devco.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PaginaTravelocity.feature",
        glue = "com.co.devco.stepDefinitions",
        snippets = SnippetType.CAMELCASE
        ,tags= {"@case1"}
        ,monochrome =  true)

public class TravelocityRunner {
}