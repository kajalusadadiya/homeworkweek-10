package xcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://www.x-cart.com/";//url
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise window
        String getTitle = driver.getTitle();//url title
        System.out.println(getTitle);
        driver.close();//url close
    }
}
