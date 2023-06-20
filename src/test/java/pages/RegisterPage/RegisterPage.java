package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;
//    partea de sigleton ii instanta

    private RegisterPage() {
//accesul catre clasa asta se face prin metoda catre clasa asta
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }


    private By firstNameField = By.xpath("//input[@placeholder='First Name']");
    private By lastNameField = By.xpath("//input[@placeholder='Last Name'] ");
    private By addressField = By.xpath("//textarea[@ng-model='Adress']");
    private By emailField = By.xpath("//input[@type='email'] ");
    private By phoneField = By.xpath("//input[@type='tel'] ");
    private By genderMale = By.xpath("//input[@value='Male']");
    private By genderFeMale = By.xpath("//input[@value='FeMale']");
    private By checkBoxCricket = By.id("checkbox1");
    private By checkBoxMovies = By.id("checkbox2");
    private By checkBoxHockey = By.id("checkbox3");



    public void typeInFirstNameField(String firstName) {
        LOG.info("Typing firs name in 'First Name' field");
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void typeInLastNameField(String lastName) {
        LOG.info("Typing firs name in 'First Name' field");
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void typeInAddressField(String address) {
        LOG.info("Typing firs 'address' in address field");
        driver.findElement(addressField).sendKeys(address);
    }

    public void typeInEmailField(String email) {
        LOG.info("Typing firs 'email' in address field");
        driver.findElement(emailField).sendKeys(email);
    }

    public void typeInPhoneField(String phone) {
        LOG.info("Typing firs 'phone' in address field");
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickMaleGender () {
        LOG.info("Click 'gender' radio button 'Male'");
        driver.findElement(genderMale).click();
    }
    public void clickFeMaleGender () {
        LOG.info("Click 'gender' radio button 'Female'");
        driver.findElement(genderFeMale).click();
    }

    public void clickCheckBoxCricket () {
        LOG.info("Click 'Cricket' radio button");
        driver.findElement(checkBoxCricket).click();
    }

    public void clickCheckBoxMovies () {
        LOG.info("Click 'Movies' radio button");
        driver.findElement(checkBoxMovies).click();
    }

    public void clickCheckBoxHochey () {
        LOG.info("Click 'Hochey' radio button");
        driver.findElement(checkBoxHockey).click();
    }


}
