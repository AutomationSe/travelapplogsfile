package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {

    private WebDriver driver;
    private WebDriverWait wait;

    public loginpage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    // Locators
    private By usernameInput = By.cssSelector("input[name='userName']");
    private By passwordInput = By.cssSelector("input[name='password']");
    private By submitButton = By.xpath("(//input[@name='submit'])[1]");
    private By successMessage = By.xpath("//*[contains(text(),'Login Success')]");

    public WebElement getUsernameInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(usernameInput));
    }

    public WebElement getPasswordInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
    }

    public WebElement getSubmitButtonElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(submitButton));
    }

    public WebElement getSuccessMessageElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
    }


}