package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        String baseUrl = "https://www.nopcommerce.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.getTitle();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise window
        driver.getTitle();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();
    }
}
