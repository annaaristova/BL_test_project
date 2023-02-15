package specs;

import Pages.HomePage;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import org.testng.annotations.Test;


public class HomeTest {
    
    HomePage home = new HomePage();
    
    public HomeTest() {
    }

    @Test
    public void testLogoName(){    
        open("https://www.blacklistband.ru/");
        home.nameElement().shouldBe(visible);
        home.logoElement().shouldBe(visible);
    }
    
    @Test
    public void testWeddingProgramAndButtons(){
        open("https://www.blacklistband.ru/light-show-new-year");
        home.weddingProgram().shouldBe(visible);
        home.weddingPagePriceButton1().shouldBe(enabled);
        home.weddingPagePriceButton2().shouldBe(enabled);
    }
}
