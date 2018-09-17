import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import steps.GoogleSteps;

public class GoogleSearchTest {

    private static WebDriver driver;
    private static GoogleSteps googleSteps;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chrome_v67-69.exe");
        ChromeOptions options = new ChromeOptions();

        driver = new ChromeDriver(options);
        googleSteps = new GoogleSteps(driver);
    }

    @Test
    public void searchGoogleForSpecificStringAndCheckResults() {
        googleSteps.givenIOpenedGooglePageSearchPage();

        googleSteps.whenITypeTextInTheSearchStringTextField("HEC");
        googleSteps.whenClickOnTheSubmitButton();

        googleSteps.thenIShouldSeeTextAsTheFirstEntry("HEC | IT-Engineering | - Bremen");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
