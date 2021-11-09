package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";//url
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//this is maximise window
        driver.getTitle();
        String getTitle = driver.getTitle();//url titel
        System.out.println(getTitle);
        driver.close();//close url
    }
}
