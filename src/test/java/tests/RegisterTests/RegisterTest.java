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

    String language = "Romanian";
    String skill = "Android";
    String country = "India";
    String firstName = "Ion";
    String lastName = "Ion2";
    String address = "Cluj";
    String email = "tester@com";
    String phone = "0745272719";
    String year = "1992";
    String month = "July";
    String day = "5";
    String firstPassword = "dajfj";
    String secondPassword = "jffnf";


    @Test
    public void registerPage() {
        driver.get(newUrl);

        LOG.info("Complete first name");
        registerPage.typeInFirstNameField(firstName);

        LOG.info("Complete last name");
        registerPage.typeInLastNameField(lastName);

        LOG.info("Complete 'address' field");
        registerPage.typeInAddressField(address);

        LOG.info("Complete 'email and phone' fields");
        registerPage.typeInEmailField(email);
        registerPage.typeInPhoneField(phone);

        LOG.info ("Click gender radio button");
        registerPage.clickMaleGender();
        registerPage.clickFeMaleGender();

        LOG.info ("Click 'Cricket' radio button");
        registerPage.clickCheckBoxCricket();

        LOG.info ("Click 'Cricket' radio button");
        registerPage.clickCheckBoxMovies();

        LOG.info ("Click 'Cricket' radio button");
        registerPage.clickCheckBoxHochey();

        LOG.info("Click language field");
        registerPage.clickLanguageField(language);
        sleep(3000);

        LOG.info ("Click skill");
        registerPage.clickSelectSkill(skill);

        LOG.info ("Click 'Select Country'");
        registerPage.clickSelectCountry(country);

        LOG.info("Select Birth Date");
        registerPage.birthDate(year,month,day);

        LOG.info("Confirm Password Fields");
        registerPage.confirmPassword(firstPassword,secondPassword);
//
//        LOG.info("Confirm Password Fields");
//        registerPage.();

        LOG.info ("Click 'submit' button");
        registerPage.clickSubmitButton();


//switchToPage - package






    }
}
