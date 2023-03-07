package specs;

import blsitetest.steps.MainPageSteps;
import org.testng.annotations.Test;

public class HomeTest {
    
    MainPageSteps home = new MainPageSteps();
    
    public HomeTest() {
    }

    @Test (description = "Test logo and name visibility on home page")
    public void testLogoName(){  
        home.home();
        home.testLogovsb();
        home.testName();
    }
    
    @Test (description = "Test facebook link")
    public void testFacebook(){
        home.home();
        home.facebook();
    }
    
    @Test (description = "Test vkontakte link")
    public void testVk(){
        home.home();
        home.vkontakte();
    }
    
    @Test (description = "Test youtube link")
    public void testYoutube(){
        home.home();
        home.youtube();
    }
    
    @Test (description = "Test instagram link")
    public void testInstagram(){
        home.home();
        home.instagram();
    }
    
    @Test (description = "Test prices link")
    public void testPrices(){
        home.home();
        home.prices();
    }
}