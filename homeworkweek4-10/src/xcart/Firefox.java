package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximize window
        String getTitle = driver.getTitle();//url title
        System.out.println(getTitle);
         driver.close();//close url

    }

}
