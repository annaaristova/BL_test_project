
package blsitetest.pages;

import blsitetest.forms.HeaderForm;
import blsitetest.forms.PricesDiv;

public class MainPage {
    public HeaderForm onHeaderForm(){
        return new HeaderForm();
    }
    
    public PricesDiv onPricesDiv(){
        return new PricesDiv();
    }
}