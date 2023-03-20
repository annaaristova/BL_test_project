
package blsitetest.steps;

import blsitetest.pages.MainPage;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
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
    
    @Step("Open weddings2023 page")
    public void weddings2023(){
        $(new MainPage().onHeaderForm().weddings2023).click();
    }
    
    @Step("Open youtube link")
    public void youtube(){
        $(new MainPage().onHeaderForm().youtube).click();
        switchTo().window(1);
        $(new MainPage().onHeaderForm().youtubename)
                .shouldBe(visible);
        closeWindow();
    }
    
    @Step("Open vkontakte link")
    public void vkontakte(){
        $(new MainPage().onHeaderForm().vkontakte).click();
        switchTo().window(1);
        $(new MainPage().onHeaderForm().vkontakteName)
                .shouldBe(visible);
        closeWindow();
    }
    
    @Step("Open instagram link")
    public void instagram(){
        $(new MainPage().onHeaderForm().instagram).click();
        switchTo().window(1);
        $(new MainPage().onHeaderForm().instagramName)
                .should(exist);
        closeWindow();
    }
    
    @Step("Open facebook link")
    public void facebook(){
        $(new MainPage().onHeaderForm().facebook).click();
        switchTo().window(1);
        $(new MainPage().onHeaderForm().facebookName)
                .should(exist);
        closeWindow();
    }
    
    @Step("Open prices link")
    public void prices(){
        $(new MainPage().onHeaderForm().prices).click();    
        $(new MainPage().onMainPageForm().pricesDiv)
                .shouldBe(visible).scrollIntoView(false);
    }
    
    @Step("Open repertoire page on the header")
    public void repertoire(){
        $(new MainPage().onHeaderForm().repertoire).click();
    }
    
    @Step("Open video page")
    public void video(){
        $(new MainPage().onHeaderForm().video).click();
    }
}
