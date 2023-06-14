package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    // 1 acestia sunt locatorii (id ex. btn sau xpath ex placeholder
    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By signInEmailField = By.xpath("//input[@placeholder='E mail']");
    private By signInPasswordField = By.xpath("//input[@placeholder='Password']");
    private By enterButton = By.id("enterbtn");
    private By errorMsg = By.id("errormsg");

    //    curs 14.06.2023
    private By skipSignInButton = By.id("btn2");
    private By signUpEmailField = By.id("email");
    private By enterSignUpButton = By.id("enterimg");
    private By signUpLogo = By.id("logo");



    //    2 metoda de testare
    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();
//        sa caute si sa ne confirme/infirme true/false daca butonul sign in este afisat pe pagina
    }

    public void clickSignInButton() {
        LOG.info("Click 'Sign in button'");
        driver.findElement(signInButton).click();
//        creem metoda pentru test - adica sa dea click pe butonul sign in
    }


    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo button is displayed");
        return driver.findElement(logo).isDisplayed();
//        intre apostrof se pune denumirea copy paste de la buton/nume/ exact ce cautam pe pagina si exact cum apare
    }

    public void typeInSignInEmailField(String email) {
        LOG.info("Typing email address in 'E mail' field");
        driver.findElement(signInEmailField).sendKeys(email);

    }

    public void typeInSignInPasswordField(String password) {
        LOG.info("Typing password  in 'Password' field");
        driver.findElement(signInPasswordField).sendKeys(password);

    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verify if error message is displayed");
        return driver.findElement(errorMsg).isDisplayed();
    }

//    SkipSignIn curs 14.06.2023 = continuare

    public void clickSkipSignInButton() {
        LOG.info("Click 'SkipSign in button'");
        driver.findElement(skipSignInButton).click();
    }
    public void typeSignUpEmailField(String email) {
        LOG.info("Typing email address in 'Sign up' field");
        driver.findElement(signUpEmailField).sendKeys(email);
    }

    public void clickBack(){
        LOG.info("Click back in bowser");
        driver.navigate().back();
    }

    public void clickEnterSignUpButton(){
        LOG.info("Click'Enter SignUp button'");
        driver.findElement(enterSignUpButton).click();
    }

    public boolean signUpLogoDisplayed() {
        LOG.info("Verify if logo button is displayed in ribbon");
        return driver.findElement(signUpLogo).isDisplayed();
    }
}
