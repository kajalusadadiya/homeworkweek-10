package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//this is maximise window
        driver.getTitle();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();
    }
}
