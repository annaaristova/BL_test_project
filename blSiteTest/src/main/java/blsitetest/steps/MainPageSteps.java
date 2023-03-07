
package blsitetest.steps;

import blsitetest.pages.MainPage;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import io.qameta.allure.Step;

public class MainPageSteps {
    
    @Step("Check that logo is visible")
    public void testLogovsb(){
        $(new MainPage().onHeaderForm().name)
                .shouldBe(visible);
    }
    
    @Step("Check that name of the band is visible")
    public void testName(){
        $(new MainPage().onHeaderForm().logo)
                .shouldBe(visible);
    }
    
    @Step("Open home page in browser")
    public void home(){
        open("https://www.blacklistband.ru/");
    }
    
    @Step("Open weddings2023 page on the header")
    public void weddings2023(){
        $(new MainPage().onHeaderForm().weddings2023).click();
    }
    
    @Step("Check youtube link")
    public void youtube(){
        $(new MainPage().onHeaderForm().youtube).click();
    }
    
    @Step("Check vkontakte link")
    public void vkontakte(){
        $(new MainPage().onHeaderForm().vkontakte).click();
    }
    
    @Step("Check instagram link")
    public void instagram(){
        $(new MainPage().onHeaderForm().instagram).click();
    }
    
    @Step("Check facebook link")
    public void facebook(){
        $(new MainPage().onHeaderForm().facebook).click();
    }
    
    @Step("Check prices link")
    public void prices(){
        $(new MainPage().onHeaderForm().prices).click();
        $(new MainPage().onPricesDiv().pricesDiv).shouldBe(visible);
    }
    
}
