package pages.RegisterPage;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
    private By languageField = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";
    //    locatorul este artificiu pentru a apela o lista de elemente din pagina web
//    sa nu se creeeze aceasi locatori pentru fiecare tara
    String selectSkill = "Skills";
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By searchField = By.xpath("//input[@type='search']");
    private By birthYear = By.id("yearbox");
    private By birthMonth = By.xpath("//select[@placeholder='Month']");
    private By birthDay = By.id("daybox");
    private By firstPassword = By.id("firstpassword");
    private By secondPassword = By.id("secondpassword");
    private By chooseFile = By.id("imagesrc");
    private By submitBtn = By.id("submitbtn");


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

    public void clickMaleGender() {
        LOG.info("Click 'gender' radio button 'Male'");
        driver.findElement(genderMale).click();
    }

    public void clickFeMaleGender() {
        LOG.info("Click 'gender' radio button 'Female'");
        driver.findElement(genderFeMale).click();
    }

    public void clickCheckBoxCricket() {
        LOG.info("Click 'Cricket' radio button");
        driver.findElement(checkBoxCricket).click();
    }

    public void clickCheckBoxMovies() {
        LOG.info("Click 'Movies' radio button");
        driver.findElement(checkBoxMovies).click();
    }

    public void clickCheckBoxHochey() {
        LOG.info("Click 'Hockey' radio button");
        driver.findElement(checkBoxHockey).click();
    }

    public void clickLanguageField(String language) {
        LOG.info("Select language field");
        driver.findElement(languageField).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();
    }

    public void clickSelectSkill(String skill) {
        LOG.info("Select skills");
        Select newskill = new Select(driver.findElement(By.id(selectSkill)));
        newskill.selectByValue(skill);
    }

    public void clickSelectCountry(String country) {
        LOG.info("Select country field");
        driver.findElement(selectCountry).click();
        driver.findElement(searchField).sendKeys(country);
        driver.findElement(searchField).sendKeys(Keys.ENTER);

    }

    public void birthDate(String year, String month, String day) {
        LOG.info("Select Birthdate");
        Select birthYearDate = new Select(driver.findElement(birthYear));
        birthYearDate.selectByValue(year);
        Select birthMonthDate = new Select(driver.findElement(birthMonth));
        birthMonthDate.selectByValue(month);
        Select birthDayDate = new Select(driver.findElement(birthDay));
        birthDayDate.selectByValue(day);
    }

    public void confirmPassword (String password,String confirmPassword) {
        LOG.info("Enter First password");
        driver.findElement(firstPassword).sendKeys(password);
        driver.findElement(secondPassword).sendKeys(confirmPassword);
    }

    public void chooseFileButton(){
        LOG.info("Upload file");
        driver.findElement(chooseFile).click();
        WebElement chooseFilePC = driver.findElement(chooseFile);
        chooseFilePC.sendKeys("D://20140818_125717.jpg");
    }
    public void clickSubmitButton(){
        LOG.info("Click on 'submit' button");
        driver.findElement(submitBtn).click();
    }


    }









