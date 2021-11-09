package harrow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";//URL

        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise
        String getTitle = driver.getTitle();//url title
        System.out.println(getTitle);
        driver.close();//close url
    }
}
