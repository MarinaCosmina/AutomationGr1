package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.SwitchToPage.SwitchToAlert;

public class BaseTest{
//se apeleaza clasa din sign in page, iti da acces in clasa pentru a putea apela clasa

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public SwitchToAlert switchToAlertPage= SwitchToAlert.getInstance();


    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown(){
        BasePage.tearDown();
    }
}