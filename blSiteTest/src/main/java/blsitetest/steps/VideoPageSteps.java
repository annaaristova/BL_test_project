
package blsitetest.steps;

import blsitetest.pages.VideoPage;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import io.qameta.allure.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class VideoPageSteps {

    @Step("Previews are visible")
    public void preview(){
        $(new VideoPage().onVideoPage().previewVideoContainer)
                .scrollIntoView(false).shouldBe(visible);
    }
    
    @Step("Click previews")
    public void videoAutoplay(){
        String autoplay = "autoplay";
        $(new VideoPage().onVideoPage().videoPlayBtn)
                .shouldBe(enabled).click();
        String text = $(new VideoPage().onVideoPage().iframeVideo)
                .getAttribute("allow");
        assertThat(text, containsString(autoplay));
    }
}
