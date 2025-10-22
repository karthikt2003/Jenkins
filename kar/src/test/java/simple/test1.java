package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
    public static void main(String[] args) {
        // Setup Chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Open Google
        driver.get("https://www.google.com");
        
        // Enter "Vijay TVK" in search box and submit
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Vijay TVK");
        searchBox.submit();
        
        // Wait for 5 seconds to see result
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        
        // Close browser
        driver.quit();
    }
}
