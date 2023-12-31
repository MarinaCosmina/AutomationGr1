package pages;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver114.exe");
        driver = new ChromeDriver();
        String url = "https://demo.automationtesting.in/Index.html";
        driver.get(url);//Methoda care porneste Chrome

        LOG.info("Open Browser Maximized");
//        driver.manage().window().maximize();//Methoda care Porneste Chrome in Maximized Window
        Dimension dimension = new Dimension(1366,768);
        driver.manage().window().setSize(dimension);
//        metoda pentru setarea rezolutiei, in cazul in care apar reclame pe pagina

    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();//Methoda care inchide browser-ul.
    }
//    metoda pentru sleep a paginii sa vezi cum ruleaza
    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String returnBaseUrl(){
        return "https://demo.automationtesting.in/Index.html";
    }
    public static String getBaseUrl() {
        String baseurl = returnBaseUrl();
        if (baseurl != null){
            return baseurl.replace("Index.html", "");
        }
        return baseurl;
    }


}