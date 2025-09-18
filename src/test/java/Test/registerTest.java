package Test;

import Base.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import Page.RegisterPage;
import java.util.LinkedHashMap;
import java.util.Map;

public class registerTest extends Base {

    private static final Logger log = LogManager.getLogger(registerTest.class);

    @Test(priority = 1)
    public void registerstart() {
        try {
            log.info("########### Starting Test: Register Page ###########");
            RegisterPage registerpage = new RegisterPage(driver);

            // Test data - field names, expected labels, and values to input
            Map<String, Object[]> testData = new LinkedHashMap<String, Object[]>() {{
                put("First Name", new Object[]{"First Name:", "kooks"});
                put("Last Name", new Object[]{"Last Name:", "kooks"});
                put("Phone", new Object[]{"Phone:", "1234567899"});
                put("Email", new Object[]{"Email:", "senel123@gmail.com"});
                put("Mailing Information", new Object[]{"Mailing Information", null}); // Special case - no input
                put("Address", new Object[]{"Address:", "1234 Main St"});
                put("City", new Object[]{"City:", "Anytown1"});
                put("State/Province", new Object[]{"State/Province:", "Anystate2"});
                put("Postal Code", new Object[]{"Postal Code:", "123456"});
                put("Country", new Object[]{"Country:", null}); // Special case - handled separately
                put("User Name", new Object[]{"User Name:", "johndoe"});
                put("Password", new Object[]{"Password:", "password1235"});
                put("Confirm Password", new Object[]{"Confirm Password:", "password1235"});
            }};

            log.info("Processing registration form fields");

            for (Map.Entry<String, Object[]> entry : testData.entrySet()) {
                String fieldName = entry.getKey();
                String expectedLabel = (String) entry.getValue()[0];
                String inputValue = (String) entry.getValue()[1];

                // Handle special cases
                if ("Mailing Information".equals(fieldName)) {
                    verifyFieldLabel(registerpage, fieldName, expectedLabel);
                    continue;
                }

                if ("Country".equals(fieldName)) {
                    verifyFieldLabel(registerpage, fieldName, expectedLabel);
                    continue;
                }

                // Process regular fields (verify label + fill input)
                processFormField(registerpage, fieldName, expectedLabel, inputValue);
            }

            // Handle country selection separately
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

    /**
     * Process a form field: verify label and fill input
     */
    private void processFormField(RegisterPage page, String fieldName, String expectedLabel, String inputValue) {
        // Verify the field label
        verifyFieldLabel(page, fieldName, expectedLabel);

        // Fill the field with input value
        log.info("Filling {} with: {}", fieldName, inputValue);

        switch (fieldName) {
            case "First Name":
                page.getFirstNameInputElement().sendKeys(inputValue);
                break;
            case "Last Name":
                page.getLastNameInputElement().sendKeys(inputValue);
                break;
            case "Phone":
                page.getPhoneInputElement().sendKeys(inputValue);
                break;
            case "Email":
                page.getEmailInputElement().sendKeys(inputValue);
                break;
            case "Address":
                page.getAddressInputElement().sendKeys(inputValue);
                break;
            case "City":
                page.getCityInputElement().sendKeys(inputValue);
                break;
            case "State/Province":
                page.getProvinceInputElement().sendKeys(inputValue);
                break;
            case "Postal Code":
                page.getPostalCodeInputElement().sendKeys(inputValue);
                break;
            case "User Name":
                page.getUserNameInputElement().sendKeys(inputValue);
                break;
            case "Password":
                page.getPasswordInputElement().sendKeys(inputValue);
                break;
            case "Confirm Password":
                page.getConfirmPasswordInputElement().sendKeys(inputValue);
                break;
            default:
                throw new IllegalArgumentException("Unknown field: " + fieldName);
        }

        log.info("{} filled successfully", fieldName);
    }

    /**
     * Verify a single field label
     */
    private void verifyFieldLabel(RegisterPage page, String fieldName, String expectedLabel) {
        log.info("Retrieving {} label text", fieldName);
        String actualLabel = getFieldLabelText(page, fieldName);
        /*log.info("Verifying {} label: Actual='{}', Expected='{}'", fieldName, actualLabel, expectedLabel);*/
        log.info("Retrieved {} label: '{}'", fieldName, actualLabel);
        log.info("Verifying {} label: Expected='{}'", fieldName, expectedLabel);

        try {
            Assert.assertEquals(actualLabel, expectedLabel, fieldName + " label mismatch");
            log.info("{} label verification PASSED", fieldName);
        } catch (AssertionError e) {
            log.error("{} label verification FAILED: {}", fieldName, e.getMessage());
            throw e;
        }
    }

    /**
     * Get the text label for a specific field
     */
    private String getFieldLabelText(RegisterPage page, String fieldName) {
        switch (fieldName) {
            case "First Name":
                return page.getFirstNameTextElement().getText();
            case "Last Name":
                return page.getLastNameTextElement().getText();
            case "Phone":
                return page.getPhoneTextElement().getText();
            case "Email":
                return page.getEmailTextElement().getText();
            case "Mailing Information":
                return page.getMailingInformationTextElement().getText();
            case "Address":
                return page.getAddressTextElement().getText();
            case "City":
                return page.getCityTextElement().getText();
            case "State/Province":
                return page.getProvinceTextElement().getText();
            case "Postal Code":
                return page.getPostalCodeTextElement().getText();
            case "Country":
                return page.getCountryTextElement().getText();
            case "User Name":
                return page.getUserNameTextElement().getText();
            case "Password":
                return page.getPasswordTextElement().getText();
            case "Confirm Password":
                return page.getConfirmPasswordTextElement().getText();
            default:
                throw new IllegalArgumentException("Unknown field: " + fieldName);
        }
    }
}