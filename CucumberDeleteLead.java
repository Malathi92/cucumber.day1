package Runner;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/Features/DeleteLead.feature",glue="StepsDeleteLead",monochrome=true,publish=true)
	public class CucumberDeleteLead extends AbstractTestNGCucumberTests{
		

	}


