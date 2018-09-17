package steps;

import org.openqa.selenium.WebDriver;
import pages.GooglePage;

public class GoogleSteps {
    private GooglePage google;

    public GoogleSteps(WebDriver driver) {
        this.google =  new GooglePage(driver);
    }

    public void givenIOpenedGooglePageSearchPage() {
        google.open();
    }

    public void whenITypeTextInTheSearchStringTextField(String text) {
        google.insertSearchText(text);
    }

    public void whenClickOnTheSubmitButton() {
        google.clickSubmit();
    }

    public Boolean thenIShouldSeeTextAsTheFirstEntry(String text) {
        return google.isFirstEntryTitleEquals(text);
    }
}