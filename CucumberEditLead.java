package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/Features/EditLead.feature",glue="StepsEditLead",monochrome=true,publish=true)
	public class CucumberEditLead extends AbstractTestNGCucumberTests{
		

	}


