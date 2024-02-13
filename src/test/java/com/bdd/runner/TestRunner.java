package com.bdd.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\neworkspace\\BDDFramework_Jan\\src\\test\\java\\com\\bdd\\featurefile",
				glue="com.bdd.stepdefinition",
				plugin= {"pretty","html:target/cucumber"},
	tags= {"@sanity"},
	monochrome=true,
	dryRun=true)
public class TestRunner {

}
