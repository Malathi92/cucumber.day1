package Runner;


	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/Features/Duplicate.feature",glue="StepsDuplicateLead",monochrome=true,publish=true)
	public class CucumberDuplicateLead extends AbstractTestNGCucumberTests{
		

	}


