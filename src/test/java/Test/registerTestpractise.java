package Test;

import Base.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import Page.RegisterPage;

public class registerTestpractise extends Base {

    private static final Logger log = LogManager.getLogger(registerTest.class);

    @Test(priority = 1)
    public void registerstart() {
        try {
            log.info("########### Starting Test: Register Page ###########");
            RegisterPage registerpage = new RegisterPage(driver);

            // Verify and fill First Name
            log.info("Retrieving First Name label text");
            String firstNameLabel = registerpage.getFirstNameTextElement().getText();
            log.info("Verifying First Name label: Expected='First Name:'");
            Assert.assertEquals(firstNameLabel, "First Name:", "First Name label mismatch");
            log.info("First Name label verification PASSED");

            log.info("Filling First Name with: kooks");
            registerpage.getFirstNameInputElement().sendKeys("kooks");
            log.info("First Name filled successfully");

            // Verify and fill Last Name
            log.info("Retrieving Last Name label text");
            String lastNameLabel = registerpage.getLastNameTextElement().getText();
            log.info("Verifying Last Name label: Expected='Last Name:'");
            Assert.assertEquals(lastNameLabel, "Last Name:", "Last Name label mismatch");
            log.info("Last Name label verification PASSED");

            log.info("Filling Last Name with: kooks");
            registerpage.getLastNameInputElement().sendKeys("kooks");
            log.info("Last Name filled successfully");

            // Verify and fill Phone
            log.info("Retrieving Phone label text");
            String phoneLabel = registerpage.getPhoneTextElement().getText();
            log.info("Verifying Phone label: Expected='Phone:'");
            Assert.assertEquals(phoneLabel, "Phone:", "Phone label mismatch");
            log.info("Phone label verification PASSED");

            log.info("Filling Phone with: 1234567899");
            registerpage.getPhoneInputElement().sendKeys("1234567899");
            log.info("Phone filled successfully");

            // Verify and fill Email
            log.info("Retrieving Email label text");
            String emailLabel = registerpage.getEmailTextElement().getText();
            log.info("Verifying Email label: Expected='Email:'");
            Assert.assertEquals(emailLabel, "Email:", "Email label mismatch");
            log.info("Email label verification PASSED");

            log.info("Filling Email with: senel123@gmail.com");
            registerpage.getEmailInputElement().sendKeys("senel123@gmail.com");
            log.info("Email filled successfully");

            // Verify Mailing Information (no input)
            log.info("Retrieving Mailing Information label text");
            String mailingInfoLabel = registerpage.getMailingInformationTextElement().getText();
            log.info("Verifying Mailing Information label: Expected='Mailing Information'");
            Assert.assertEquals(mailingInfoLabel, "Mailing Information", "Mailing Information label mismatch");
            log.info("Mailing Information label verification PASSED");

            // Verify and fill Address
            log.info("Retrieving Address label text");
            String addressLabel = registerpage.getAddressTextElement().getText();
            log.info("Verifying Address label: Expected='Address:'");
            Assert.assertEquals(addressLabel, "Address:", "Address label mismatch");
            log.info("Address label verification PASSED");

            log.info("Filling Address with: 1234 Main St");
            registerpage.getAddressInputElement().sendKeys("1234 Main St");
            log.info("Address filled successfully");

            // Verify and fill City
            log.info("Retrieving City label text");
            String cityLabel = registerpage.getCityTextElement().getText();
            log.info("Verifying City label: Expected='City:'");
            Assert.assertEquals(cityLabel, "City:", "City label mismatch");
            log.info("City label verification PASSED");

            log.info("Filling City with: Anytown1");
            registerpage.getCityInputElement().sendKeys("Anytown1");
            log.info("City filled successfully");

            // Verify and fill State/Province
            log.info("Retrieving State/Province label text");
            String provinceLabel = registerpage.getProvinceTextElement().getText();
            log.info("Verifying State/Province label: Expected='State/Province:'");
            Assert.assertEquals(provinceLabel, "State/Province:", "State/Province label mismatch");
            log.info("State/Province label verification PASSED");

            log.info("Filling State/Province with: Anystate2");
            registerpage.getProvinceInputElement().sendKeys("Anystate2");
            log.info("State/Province filled successfully");

            // Verify and fill Postal Code
            log.info("Retrieving Postal Code label text");
            String postalCodeLabel = registerpage.getPostalCodeTextElement().getText();
            log.info("Verifying Postal Code label: Expected='Postal Code:'");
            Assert.assertEquals(postalCodeLabel, "Postal Code:", "Postal Code label mismatch");
            log.info("Postal Code label verification PASSED");

            log.info("Filling Postal Code with: 123456");
            registerpage.getPostalCodeInputElement().sendKeys("123456");
            log.info("Postal Code filled successfully");

            // Verify Country label (no input - handled separately)
            log.info("Retrieving Country label text");
            String countryLabel = registerpage.getCountryTextElement().getText();
            log.info("Verifying Country label: Expected='Country:'");
            Assert.assertEquals(countryLabel, "Country:", "Country label mismatch");
            log.info("Country label verification PASSED");

            // Verify and fill User Name
            log.info("Retrieving User Name label text");
            String userNameLabel = registerpage.getUserNameTextElement().getText();
            log.info("Verifying User Name label: Expected='User Name:'");
            Assert.assertEquals(userNameLabel, "User Name:", "User Name label mismatch");
            log.info("User Name label verification PASSED");

            log.info("Filling User Name with: johndoe");
            registerpage.getUserNameInputElement().sendKeys("johndoe");
            log.info("User Name filled successfully");

            // Verify and fill Password
            log.info("Retrieving Password label text");
            String passwordLabel = registerpage.getPasswordTextElement().getText();
            log.info("Verifying Password label: Expected='Password:'");
            Assert.assertEquals(passwordLabel, "Password:", "Password label mismatch");
            log.info("Password label verification PASSED");

            log.info("Filling Password with: password1235");
            registerpage.getPasswordInputElement().sendKeys("password1235");
            log.info("Password filled successfully");

            // Verify and fill Confirm Password
            log.info("Retrieving Confirm Password label text");
            String confirmPasswordLabel = registerpage.getConfirmPasswordTextElement().getText();
            log.info("Verifying Confirm Password label: Expected='Confirm Password:'");
            Assert.assertEquals(confirmPasswordLabel, "Confirm Password:", "Confirm Password label mismatch");
            log.info("Confirm Password label verification PASSED");

            log.info("Filling Confirm Password with: password1235");
            registerpage.getConfirmPasswordInputElement().sendKeys("password1235");
            log.info("Confirm Password filled successfully");

            // Handle country selection
            log.info("Selecting country: ALGERIA");
            registerpage.selectCountryByVisibleText("ALGERIA");
            String selectedCountry = registerpage.getSelectedCountry();
            log.info("Selected country: {}", selectedCountry);

            // Submit the form
            log.info("Submitting registration form");
            registerpage.getClickSubmitButtonElement().click();
            Thread.sleep(4000);

            log.info("Click Signinbutton Link");
            registerpage.getClickLoginButtonElement().click();

            log.info("########### Test Completed Successfully ###########");

        } catch (Exception e) {
            log.error("Test execution failed: {}", e.getMessage());
            throw new RuntimeException("Test execution failed", e);
        } finally {
            log.info("Test execution completed");
        }
    }
}