package com.runner;  // Class 12 Day Time is 4:05H

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)  // Class 12 Day Time is 4:07H
	@CucumberOptions(
			features = "src/test/resources", 
			glue = { "dashboard.steps" }, 
			tags = { "@smokeTest" }, 
			plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
			monochrome = true)

	public class Runner {  // Class 12 Day Time is 4:20H

		@AfterClass
		public static void writeExtentReport() {

			Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
			Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
			Reporter.setSystemInfo("Machine", "Windows 10 " + "64 Bit");
			Reporter.setSystemInfo("Selenium", "3.7.0");
			Reporter.setSystemInfo("Maven", "3.6.2");
			Reporter.setSystemInfo("Java Version", "1.8.0_231");
			Reporter.setSystemInfo("Smart Tech", "Saturday Morning");
		}

	}