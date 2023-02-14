
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewEmptyTestNGTest {
    
    public WebDriver driver;
    
    @Test
    public void testLogoName(){
        
        driver= new ChromeDriver();
        driver.get("https://www.blacklistband.ru/");
        
        Boolean logo = driver.findElement(By.xpath(
                "//*[@id='comp-jlkmxcup']/h6/span/a")).isDisplayed();
        
        Boolean name = driver.findElement(By.xpath(
                "//*[@id=\"img_comp-k66l3uf0\"]/img")).isDisplayed();
        
        System.out.println("Logo check: " + logo);
        System.out.println("Name check: " + name);
    }
    
    @Test
    public void testWeddings2023(){
        
        driver= new ChromeDriver();
        driver.get("https://www.blacklistband.ru/light-show-new-year");
        
        Boolean priceButtonOne = driver.findElement(By.xpath(
                "//*[@id=\"comp-kumt3z1j\"]/a/div/span[1]")).isEnabled();
        Boolean priceButtonTwo = driver.findElement(By.xpath(
                "//*[@id=\"comp-kumt4p8l\"]/a/div/span[1]")).isEnabled();
        
        System.out.println(priceButtonOne + "\n" + priceButtonTwo);
        
        Boolean weddingsProg = driver.findElement(By.xpath(
                "//*[@id=\"comp-kumq5n1n\"]")).isDisplayed();
        
        System.out.println("Wedding program check: " + weddingsProg);
        System.out.println("Button price1 check: " + priceButtonOne);
        System.out.println("Button price2 check: " + priceButtonTwo);
      
    }
    
    @AfterMethod
    public void quitDriver(){
        driver.quit();
    }
}
