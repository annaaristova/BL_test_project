
package specs;

import blsitetest.steps.MainPageSteps;
import blsitetest.steps.WeddingPageSteps;
import org.testng.annotations.Test;

public class WeddingPageTest {
    
    MainPageSteps home = new MainPageSteps();
    WeddingPageSteps weddingPage = new WeddingPageSteps();
    
    public WeddingPageTest() {
    }
    
    @Test (description = "Test weddings2023 button on the home page."
            + "Test wedding programs div visibility on weddings2023 page."
            + "Test price buttons on weddings2023 page.")
    public void testWedding2023(){
        home.home();
        home.weddings2023(); 
        weddingPage.weddingProgram();
        weddingPage.priceBtns();
    }
}
