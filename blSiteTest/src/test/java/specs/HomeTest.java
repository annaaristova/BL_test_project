package specs;

import blsitetest.HomePage;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import org.testng.annotations.Test;


public class HomeTest {
    
    HomePage home = new HomePage();
    
    public HomeTest() {
    }

    @Test(description = "Test logo and name")
    public void testLogoName(){    
        home.open();
        home.nameElement().shouldBe(visible);
        home.logoElement().shouldBe(visible);
    }
    
    @Test(description = "Test wedding program and price buttons")
    public void testWeddingProgramAndButtons(){
       
        home.open();
        home.weddings2023().click();
        home.weddingProgram().shouldBe(visible);
        home.weddingPagePriceButton1().shouldBe(enabled);
        home.weddingPagePriceButton2().shouldBe(enabled);
    }
}
