
package blsitetest.steps;

import blsitetest.pages.MainPage;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPageSteps {
    public void testLogovsb(){
        $(new MainPage().onHeaderForm().name)
                .shouldBe(visible);
    }
    
    public void testName(){
        $(new MainPage().onHeaderForm().logo)
                .shouldBe(visible);
    }
    
    public void home(){
        open("https://www.blacklistband.ru/");
    }
    
    public void weddings2023(){
        $(new MainPage().onHeaderForm().weddings2023).click();
    }
}
