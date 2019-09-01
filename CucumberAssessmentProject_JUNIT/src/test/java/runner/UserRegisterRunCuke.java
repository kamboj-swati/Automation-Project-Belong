package runner;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


/** Runner file to run the scenarios specified in UserRegistration feature
 * @author Swati kamboj
 *  
 */
@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		features= {"src/test/resources/features/UserRegistration.feature"},
		glue= {"steps"},
		monochrome=true,
		tags= {},
		plugin = {"pretty","html:target/RunCuke/cucumber.html","html:test-output/Cucumber-report"})

public class UserRegisterRunCuke {


	
}
