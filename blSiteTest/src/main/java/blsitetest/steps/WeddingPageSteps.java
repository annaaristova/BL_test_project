
package blsitetest.steps;

import blsitetest.pages.WeddingPage;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import io.qameta.allure.Step;

public class WeddingPageSteps {
    
    @Step("Check that wedding program division is visible")
    public void weddingProgram(){
        $(new WeddingPage().onWeddingsForm().weddingProgram)
                .shouldBe(visible);
    }
    
    @Step("Check that price buttons are enabled")
    public void priceBtns(){
        $(new WeddingPage().onWeddingsForm().priceBtnOne)
                .shouldBe(enabled).scrollIntoView(false);
        $(new WeddingPage().onWeddingsForm().priceBtnTwo)
                .shouldBe(enabled);
    }
    
    @Step("Check that learn more button is enabled and learn more division is"
            + "visible")
    public void learnMore(){
        $(new WeddingPage().onWeddingsForm().learnMoreBtn)
                .shouldBe(enabled).scrollIntoView(false);
        $(new WeddingPage().onWeddingsForm().learnMoreDiv)
                .shouldBe(visible);
    }           
}