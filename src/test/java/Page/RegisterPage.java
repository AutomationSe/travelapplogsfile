package Page;

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    //locators
    private By firstnametext = By.xpath("(//b[contains(text(),'First')])[1]");
    private By firstnameinput = By.cssSelector("input[name='firstName']");
    private By lastnametext = By.xpath("(//b[contains(text(),'Last')])[1]");
    private By lastnameinput = By.cssSelector("input[name='lastName']");
    private By Phonetext = By.xpath("(//b[normalize-space()='Phone:'])[1]");
    private By Phoneinput = By.cssSelector("input[name='phone']");
    private By Emailtext = By.xpath("(//b[normalize-space()='Email:'])[1]");
    private By Emailinput = By.cssSelector("#userName");
    private By Mailing_Informationtext = By.xpath("(//font[contains(text(),'Mailing')])[1]");
    private By Addresstext = By.xpath("(//b[normalize-space()='Address:'])[1]");
    private By Addressinput = By.cssSelector("input[name='address1']");
    private By Citytext = By.xpath("(//b[normalize-space()='City:'])[1]");
    private By Cityinput = By.cssSelector("input[name='city']");
    private By Provincetext = By.xpath("(//b[normalize-space()='State/Province:'])[1]");
    private By Provinceinput = By.cssSelector("input[name='state']");
    private By Postal_Codetext = By.xpath("(//b[contains(text(),'Postal')])[1]");
    private By Postal_Codeinput = By.cssSelector("input[name='postalCode']");
    private By countrytext = By.xpath("(//b[normalize-space()='Country:'])[1]");
    private By clickcountrydropdown = By.xpath("(//select[@name='country'])[1]");
    private By User_Nametext = By.xpath("(//b[contains(text(),'User')])[1]");
    private By User_Nameinput = By.cssSelector("#email");
    private By Passwordtext = By.xpath("(//b[normalize-space()='Password:'])[1]");
    private By Passwordinput = By.cssSelector("input[name='password']");
    private By Confirm_Passwordtext = By.xpath("(//b[contains(text(),'Confirm')])[1]");
    private By Confirm_Passwordinput = By.xpath("(//input[@name='confirmPassword'])[1]");
    private By clickcloseicon = By.xpath("//*[@id=\"cbox\"]/div/div/div/div/div/div[1]");
    private By clickSubmitbutton = By.xpath("(//input[@name='submit'])[1]");
    private By clickloginbutton = By.cssSelector("a[href='login.php']");
    private By usernameinput_two = By.cssSelector("input[name='userName']");
    private By passwordtext_two = By.cssSelector("input[name='password']");
    private By submitbutton_two = By.xpath("(//input[@name='submit'])[1]");


    public WebElement getFirstNameTextElement() {
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(firstnametext));
    }

    public WebElement getFirstNameInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(firstnameinput));
    }

    public WebElement getLastNameTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lastnametext));
    }

    public WebElement getLastNameInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(lastnameinput));
    }

    public WebElement getPhoneTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Phonetext));
    }

    public WebElement getPhoneInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Phoneinput));
    }

    public WebElement getEmailTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Emailtext));
    }

    public WebElement getEmailInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Emailinput));
    }

    public WebElement getMailingInformationTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Mailing_Informationtext));
    }
    public WebElement getAddressTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Addresstext));
    }
    public WebElement getAddressInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Addressinput));
    }

    public WebElement getCityTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Citytext));
    }

    public WebElement getCityInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Cityinput));
    }

    public WebElement getProvinceTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Provincetext));
    }
    public WebElement getProvinceInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Provinceinput));
    }

    public WebElement getPostalCodeTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Postal_Codetext));
    }

    public WebElement getPostalCodeInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Postal_Codeinput));
    }

    public WebElement getCountryTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(countrytext));
    }

    public WebElement getCountryDropdownElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(clickcountrydropdown));
    }

    public void selectCountryByVisibleText(String countryName) {
        WebElement dropdown = getCountryDropdownElement();
        Select countrySelect = new Select(dropdown);
        countrySelect.selectByVisibleText(countryName);
    }

    public String getSelectedCountry() {
        WebElement dropdown = getCountryDropdownElement();
        Select countrySelect = new Select(dropdown);
        return countrySelect.getFirstSelectedOption().getText();
    }

    public WebElement getUserNameTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(User_Nametext));
    }

    public WebElement getUserNameInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(User_Nameinput));
    }

    public WebElement getPasswordTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Passwordtext));
    }

    public WebElement getPasswordInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Passwordinput));
    }

    public WebElement getConfirmPasswordTextElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Confirm_Passwordtext));
    }

    public WebElement getConfirmPasswordInputElement() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(Confirm_Passwordinput));
    }

    public WebElement getclickclosebutton(){
        return wait.until(ExpectedConditions.elementToBeClickable(clickcloseicon));
    }

    public WebElement getClickSubmitButtonElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(clickSubmitbutton));
    }

    public WebElement getClickLoginButtonElement() {
        return wait.until(ExpectedConditions.elementToBeClickable(clickloginbutton));
    }

    public WebElement getUsernameInputElement_two() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(usernameinput_two));
    }
    public WebElement getPasswordInputElement_two() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(passwordtext_two));
    }

    public WebElement getSubmitButtonElement_two() {
        return wait.until(ExpectedConditions.elementToBeClickable(submitbutton_two));
    }

}
