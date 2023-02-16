
package specs;

import blsitetest.steps.MainPageSteps;
import blsitetest.steps.WeddingPageSteps;
import org.testng.annotations.Test;
        
public class WeddingPageTest {
    
    MainPageSteps home = new MainPageSteps();
    WeddingPageSteps weddingPage = new WeddingPageSteps();
    
    public WeddingPageTest() {
    }
    
    @Test(description = "Test weddings2023 button, wedding programs div and price buttons") 
    public void testWedding2023(){
        home.home();
        home.weddings2023(); 
        weddingPage.weddingProgram();
        weddingPage.priceBtns();
    }
}
