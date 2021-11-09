package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "edge";
    static String baseURL = "https://www.wcht.org.uk/";
    static WebDriver driver;

    public static void main(String[] args) {
        // Object baseURL;
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//chrome
            driver = new ChromeDriver();
            driver.get(baseURL);
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");//edge
            driver = new EdgeDriver();
            driver.get(baseURL);
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");//firefox
            driver = new FirefoxDriver();
            driver.get(baseURL);
        } else {
            System.out.println("Wrong Browser Name");
        }
    }
}
