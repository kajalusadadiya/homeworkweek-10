package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";//url
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise
        String getTitle = driver.getTitle();//url title
        System.out.println(getTitle);
        driver.close();//url close
    }
}