/*
 * Test 1: checking logo and name
*/

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;


public class Test1 {
 
    public static void main(String[] args) {
        
        open("https://www.blacklistband.ru/");
        System.out.println(
                $(By.xpath("//*[@id='comp-jlkmxcup']/h6/span/a"))
                .shouldBe(visible));
        System.out.println(
                $(By.xpath("//*[@id=\"img_comp-k66l3uf0\"]/img"))
                .shouldBe(visible));
        
    }
}

