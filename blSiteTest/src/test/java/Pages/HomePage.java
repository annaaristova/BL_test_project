
package Pages;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


public class HomePage {
    
    public SelenideElement logoElement(){
        return $(By.xpath("//*[@id=\"comp-k66l3uf0\"]/div"));
    } 
           
    public SelenideElement nameElement(){
        return $(By.xpath("//*[@id=\"comp-jlkmxcup\"]/h6"));
    } 
    
    public SelenideElement weddingProgram(){
        return $(By.id("comp-ldt2hbi81"));
    }
           
    public SelenideElement weddingPagePriceButton1(){
        return $(By.id("comp-kuzpmz7i"));
    }
    
    public SelenideElement weddingPagePriceButton2(){
        return $(By.id("comp-kuzpmz7i"));
    }
}
