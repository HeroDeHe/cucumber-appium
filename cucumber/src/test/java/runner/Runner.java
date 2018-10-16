package runner;

import cucumber.api.CucumberOptions;
/**
 * @author quoc tran
 *
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features={"src//test//java//features"},
					glue={"stepdefinations","utils"},
					plugin = {"pretty", "html:target/cucumber"})

public class Runner {

}
