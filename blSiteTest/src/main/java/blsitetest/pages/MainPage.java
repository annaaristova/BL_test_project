
package blsitetest.pages;

import blsitetest.forms.HeaderForm;
import blsitetest.forms.MainPageForm;

public class MainPage {
    public HeaderForm onHeaderForm(){
        return new HeaderForm();
    }
    
    public MainPageForm onMainPageForm(){
        return new MainPageForm();
    }
}