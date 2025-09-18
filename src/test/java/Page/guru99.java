package Page;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class guru99 {

    //locaters

    private WebDriver driver;
    private WebDriverWait wait;

    public guru99(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    private By homepageName = By.xpath("(//a[normalize-space()='Demo Site'])[1]");
    private By atlantatovegastext = By.xpath("(//font[contains(text(),'Atlanta')])[1]");
    private By atlantatovegascosttext = By.xpath("(//b[normalize-space()='$398'])[1]");
    private By BostontoSanFranciscoText = By.xpath("(//font[contains(text(),'Boston')])[1]");
    private By BostontoSanFranciscocostText = By.xpath("(//b[normalize-space()='$513'])[1]");
    private By LosAngelestoChicagotxt = By.xpath("(//font[contains(text(),'Los')])[1]");
    private By LosAngelestoChicagocosttxt = By.xpath("(//b[normalize-space()='$168'])[1]");
    private By NewYorktoChicagotxt = By.xpath("(//font[contains(text(),'New')])[1]");
    private By NewYorktoChicagocosttxt = By.xpath("(//b[normalize-space()='$198'])[1]");
    private By PhoenixtoSanFranciscotxt = By.xpath("(//font[contains(text(),'Phoenix')])[1]");
    private By PhoenixtoSanFranciscocosttxt = By.xpath("(//b[normalize-space()='$213'])[1]");
    private By capturedatetxt = By.xpath("(//b[normalize-space()='Jul 6, 2017'])[1]");

    private By captureregisterText = By.xpath("(//a[normalize-space()='REGISTER'])[1]");
    private By clickregisterText = By.xpath("//a[contains(@href, 'register')]");
    private By registtext = By.cssSelector("font[color='#FFFFFF'] font[face='ARIAL, HELVETICA']");


    public WebElement getHomepageNameElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(homepageName));
    }

    public WebElement getAtlantatovegasTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(atlantatovegastext));
    }

    public WebElement getAtlantatovegasCostTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(atlantatovegascosttext));
    }

    public WebElement getBostontoSanFranciscoTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(BostontoSanFranciscoText));
    }
    public WebElement getBostontoSanFranciscoCostTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(BostontoSanFranciscocostText));
    }

    public WebElement getLosAngelestoChicagoTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(LosAngelestoChicagotxt));
    }

    public WebElement getLosAngelestoChicagoCostTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(LosAngelestoChicagocosttxt));
    }

    public WebElement getNewYorktoChicagoTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(NewYorktoChicagotxt));
    }

    public WebElement getNewYorktoChicagoCostTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(NewYorktoChicagocosttxt));
    }

    public WebElement getPhoenixtoSanFranciscoTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(PhoenixtoSanFranciscotxt));
    }

    public WebElement getPhoenixtoSanFranciscoCostTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(PhoenixtoSanFranciscocosttxt));
    }

    public WebElement getCapturedateTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(capturedatetxt));
    }

/*    public WebElement getCaptureregisterTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(captureregisterText));
    }*/

    public WebElement getClickregisterTextElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(clickregisterText));
    }

    public WebElement getRegistTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(registtext));
    }

}
