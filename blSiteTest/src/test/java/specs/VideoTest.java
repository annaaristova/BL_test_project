
package specs;

import blsitetest.steps.MainPageSteps;
import blsitetest.steps.VideoPageSteps;
import org.testng.annotations.Test;

public class VideoTest {
    
    MainPageSteps home = new MainPageSteps();
    VideoPageSteps video = new VideoPageSteps();
    
    @Test(description = "Previews should be visible")
    public void preview(){
        home.home();
        home.video();
        video.preview();
    }
    
    @Test(description = "Video should start playing after clicking it")
    public void previewPlay(){
        home.home();
        home.video();
        video.preview();
        video.videoAutoplay();      
    }
}
