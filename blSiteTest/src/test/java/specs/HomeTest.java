package specs;

import blsitetest.steps.MainPageSteps;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


public class HomeTest {
    
    MainPageSteps home = new MainPageSteps();
    
    public HomeTest() {
    }

    @Test
    @Description("Test logo and name visibility on home page")
    public void testLogoName(){  
        home.home();
        home.testLogovsb();
        home.testName();
    }
}
