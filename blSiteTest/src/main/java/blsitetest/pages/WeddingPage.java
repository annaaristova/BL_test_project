
package blsitetest.pages;

import blsitetest.forms.HeaderForm;
import blsitetest.forms.WeddingsForm;

public class WeddingPage {
    
    public HeaderForm onHeaderForm(){
        return new HeaderForm();
    }
    
    public WeddingsForm onWeddingsForm(){
        return new WeddingsForm();
    }
}
