package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;
//clasa de sleep -   nu ramane in test sleep dupa verificare

public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {
//        aici apelam metoda
        String email = "grupa1@automation.com";
        String password = "parola";
        String email2 = "grupa1@automation.com";
        String password2 = "parola";
//        test data -  se definesc doua variabile pentru email si parola

        LOG.info("Check 'Sign in' button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");
//asert reprezinta cautarea pe pagina a butonului sign in
        signInPage.clickSignInButton();
        sleep(3000);
//        nu ramane in cod dupa verificare se sterge sleep

//        in test apelam metoda pe care am creat-o in sign in page pentru a da click pe buton

        LOG.info("Check logo");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");
        sleep(3000);


        LOG.info("Clik enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed");
        sleep(3000);


        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email);
        signInPage.typeInSignInPasswordField(password);
        sleep(3000);


        LOG.info("Clik enter and check message");
        signInPage.clickEnterButton();
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed");
        sleep(3000);


        LOG.info("Complete the fields");
        signInPage.typeInSignInEmailField(email2);
        signInPage.typeInSignInPasswordField(password2);
        sleep(3000);
//        nu raman in test sleep
    }


}


//pasi de urmat pentru automatizare - 1 identificam locatorul si scriem in SignIn page, 2 creem metoda in Sign in page, 3 apelam metoda de test in SigninTest.


