package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(features="src/test/java/Features/MergeContact.feature",glue="StepsMergeContact",monochrome=true,publish=true)
	public class CucumberMergeContact extends AbstractTestNGCucumberTests{
		

	}

