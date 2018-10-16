package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/**
 * @author quoc tran
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
					glue="stepdefinations",
					plugin = "pretty")

public class Runner {

}
