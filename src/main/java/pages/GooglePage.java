package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
    private WebDriver driver;

    private final String URL = "https://www.google.de";

    private final By TXF_SEARCHTEXT = By.id("lst-ib");
    private final By BTN_SEARCHBUTTON = By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input");
    private final By DIV_FIRST_RESULT_TITLE = By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a");

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(URL);
    }

    public void insertSearchText(String text) {
        driver.findElement(TXF_SEARCHTEXT).sendKeys(text);
    }

    public void clickSubmit() {
        driver.findElement(BTN_SEARCHBUTTON).click();
    }

    public boolean isFirstEntryTitleEquals(String text) {
        return driver.findElement(DIV_FIRST_RESULT_TITLE).getText().equals(text);
    }
}
