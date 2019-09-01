package steps;

//import org.junit.Before;

import cucumber.api.java.Before;
//import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	

	/** Method to for the setup used with @Before annotation
	 * @author Swati Kamboj
	 */
	@Before
	public void setUp() {
		
		String browserName = getParameter("browser");
		SeleniumDriver.setUpDriver(browserName);
	}
	
	/** Method to fetch the browser name given via command line
	 * @author Swati Kamboj
	 */
	public String getParameter(String name) { 
		
		  String browserValue = System.getProperty(name);
		  if (browserValue == null)
		     throw new RuntimeException(name + " is not a parameter!");

		  if (browserValue.isEmpty())
		    throw new RuntimeException(name + " is empty!");

		  return browserValue;
		 }

}
