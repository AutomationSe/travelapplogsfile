package Test;

import Base.Base;
import org.testng.annotations.Test;
import org.testng.Assert;
import Page.guru99;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class guru99open extends Base {

    private static final Logger log = LogManager.getLogger(guru99open.class);

    @Test
    public void testPageContent() {
        try {
            log.info("Starting test: Verifying Guru99 website content");
            guru99 guru99page = new guru99(driver);

            // Verify homepage name
            log.info("Verifying Homepage name text");
            Assert.assertEquals(guru99page.getHomepageNameElement().getText(), "Demo Site",
                    "Homepage name mismatch");
            log.info("Homepage name verification PASSED");

            // Verify Atlanta to Las Vegas flight
            log.info("Verifying Atlanta to Las Vegas flight text");
            Assert.assertEquals(guru99page.getAtlantatovegasTextElement().getText(), "Atlanta to Las Vegas",
                    "Atlanta to Las Vegas flight text mismatch");
            log.info("Atlanta to Las Vegas flight verification PASSED");

            // Verify Atlanta to Las Vegas cost
            log.info("Verifying Atlanta to Las Vegas cost text");
            Assert.assertEquals(guru99page.getAtlantatovegasCostTextElement().getText(), "$398",
                    "Atlanta to Las Vegas cost mismatch");
            log.info("Atlanta to Las Vegas cost verification PASSED");

            // Verify Boston to San Francisco flight
            log.info("Verifying Boston to San Francisco flight text");
            Assert.assertEquals(guru99page.getBostontoSanFranciscoTextElement().getText(), "Boston to San Francisco",
                    "Boston to San Francisco flight text mismatch");
            log.info("Boston to San Francisco flight verification PASSED");

            // Verify Boston to San Francisco cost
            log.info("Verifying Boston to San Francisco cost text");
            Assert.assertEquals(guru99page.getBostontoSanFranciscoCostTextElement().getText(), "$513",
                    "Boston to San Francisco cost mismatch");
            log.info("Boston to San Francisco cost verification PASSED");

            // Verify Los Angeles to Chicago flight
            log.info("Verifying Los Angeles to Chicago flight text");
            Assert.assertEquals(guru99page.getLosAngelestoChicagoTextElement().getText(), "Los Angeles to Chicago",
                    "Los Angeles to Chicago flight text mismatch");
            log.info("Los Angeles to Chicago flight verification PASSED");

            // Verify Los Angeles to Chicago cost
            log.info("Verifying Los Angeles to Chicago cost text");
            Assert.assertEquals(guru99page.getLosAngelestoChicagoCostTextElement().getText(), "$168",
                    "Los Angeles to Chicago cost mismatch");
            log.info("Los Angeles to Chicago cost verification PASSED");

            // Verify New York to Chicago flight
            log.info("Verifying New York to Chicago flight text");
            Assert.assertEquals(guru99page.getNewYorktoChicagoTextElement().getText(), "New York to Chicago",
                    "New York to Chicago flight text mismatch");
            log.info("New York to Chicago flight verification PASSED");

            // Verify New York to Chicago cost
            log.info("Verifying New York to Chicago cost text");
            Assert.assertEquals(guru99page.getNewYorktoChicagoCostTextElement().getText(), "$198",
                    "New York to Chicago cost mismatch");
            log.info("New York to Chicago cost verification PASSED");

            // Verify Phoenix to San Francisco flight
            log.info("Verifying Phoenix to San Francisco flight text");
            Assert.assertEquals(guru99page.getPhoenixtoSanFranciscoTextElement().getText(), "Phoenix to San Francisco",
                    "Phoenix to San Francisco flight text mismatch");
            log.info("Phoenix to San Francisco flight verification PASSED");

            // Verify Phoenix to San Francisco cost
            log.info("Verifying Phoenix to San Francisco cost text");
            Assert.assertEquals(guru99page.getPhoenixtoSanFranciscoCostTextElement().getText(), "$213",
                    "Phoenix to San Francisco cost mismatch");
            log.info("Phoenix to San Francisco cost verification PASSED");

            // Verify Capture date
            log.info("Verifying Capture date text");
            Assert.assertEquals(guru99page.getCapturedateTextElement().getText(), "Jul 6, 2017",
                    "Capture date mismatch");
            log.info("Capture date verification PASSED");

            log.info("All initial assertions passed successfully!");

            // The rest of your test remains a separate, specific flow.
            log.info("Clicking on register link");
            guru99page.getClickregisterTextElement().click();
            log.info("Successfully clicked register link");

            // Verify Register page text
            log.info("Verifying Register page text");
            Assert.assertEquals(guru99page.getRegistTextElement().getText(), "Contact Information",
                    "Register page text mismatch");
            log.info("Register page text verification PASSED");

        } catch (AssertionError e) {
            log.error("Assertion failed: {}", e.getMessage());
            throw e;
        } catch (Exception e) {
            log.error("Unexpected error during test execution: {}", e.getMessage());
            throw new RuntimeException("Test execution failed", e);
        } finally {
            log.info("Test execution completed");
        }
    }
}