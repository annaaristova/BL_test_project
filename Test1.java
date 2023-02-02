/*
 * Test 1: checking logo and name
*/

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

public class Test1 {
 
    public static void main(String[] args) {
        
        boolean logo, name;
        
        open("https://www.blacklistband.ru/");
        name = $(By.xpath("//*[@id='comp-jlkmxcup']/h6/span/a")).exists();
        logo = $(By.xpath("//*[@id=\"img_comp-k66l3uf0\"]/img")).exists();
        System.out.println(logo + " " + name);
    }
}

