package pages.RegisterPage;

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
    public static RegisterPage getInstance(){
        if (instance==null){
            instance = new RegisterPage();
        }
        return instance;



    }
}
