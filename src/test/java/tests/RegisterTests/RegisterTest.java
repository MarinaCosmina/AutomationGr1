package tests.RegisterTests;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.RegisterPage.RegisterPage;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    private String newUrl = getBaseUrl() + "Register.html";



    @Test
    public void registerPage() {

        driver.get(newUrl);

        String firstName = "Ion";
        String lastName = "Ion2";
        String address = "Cluj";
        String email = "tester@com";
        String phone = "0745272719";

        LOG.info("Complete first name");
        registerPage.typeInFirstNameField(firstName);
        sleep(3000);


        LOG.info("Complete last name");
        registerPage.typeInLastNameField(lastName);
        sleep(3000);

        LOG.info("Complete 'address' field");
        registerPage.typeInAddressField(address);
        sleep(3000);


        LOG.info("Complete 'email and phone' fields");
        registerPage.typeInEmailField(email);
        registerPage.typeInPhoneField(phone);
        sleep(3000);

        LOG.info ("Click gender radio button");
        registerPage.clickMaleGender();
        registerPage.clickFeMaleGender();

        LOG.info ("Click 'Cricket' radio button");
        registerPage.clickCheckBoxCricket();

        LOG.info ("Click 'Cricket' radio button");
        registerPage.clickCheckBoxMovies();

        LOG.info ("Click 'Cricket' radio button");
        registerPage.clickCheckBoxHochey();










    }
}
