
package specs;

import blsitetest.steps.RepertoirePageSteps;
import blsitetest.steps.MainPageSteps;
import java.io.FileNotFoundException;
import org.testng.annotations.Test;

public class RepertoireTest {
    
    MainPageSteps home = new MainPageSteps();
    RepertoirePageSteps repertoire = new RepertoirePageSteps();
    
    public RepertoireTest(){
        
    }
    
    @Test (description = "Test pdf file")
    public void pdfDownload() throws FileNotFoundException{
        home.home();
        home.repertoire();
        repertoire.pdfIcon();
        repertoire.pdfDownload();
    }
    
    @Test (description = "Test docx file")
    public void docxDownload() throws FileNotFoundException{
        home.home();
        home.repertoire();
        repertoire.docxIcon();
        repertoire.docxDownload();
    }
    
    @Test (description = "Test song search. Song should exist")
    public void songIsInPlaylist() throws InterruptedException {
        home.home();
        home.repertoire();
        repertoire.songsTable();
        repertoire.inframeTable();
        repertoire.songIsInPlaylist();
    }
    
    @Test (description = "Test song search. Song shouldn't exist")
    void songIsNotInPlaylist() {
        home.home();
        home.repertoire();
        repertoire.songsTable();
        repertoire.inframeTable();
        repertoire.songIsNotInPlaylist();
    }
     
    @Test (description = "Test the arrow button."
            + " After ckicking songs should be displayed in descending order")
    void songsDescOrder() {
        home.home();
        home.repertoire();
        repertoire.songsTable();
        repertoire.inframeTable();
        repertoire.songsOrder();
    }
}


