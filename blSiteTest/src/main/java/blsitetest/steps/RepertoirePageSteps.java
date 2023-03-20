
package blsitetest.steps;

import io.qameta.allure.Step;
import blsitetest.pages.RepertoirePage;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;
import java.io.FileNotFoundException; 
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RepertoirePageSteps {
    @Step("Check that pdf icon is visible")
    public void pdfIcon(){
        $(new RepertoirePage().onRepertoireForm().pdf).shouldBe(visible);
    }
    
    @Step("Check that docx icon is visible")
    public void docxIcon(){
        $(new RepertoirePage().onRepertoireForm().docx).shouldBe(visible);
    }
    
    @Step("Download pdf file")
    public void pdfDownload() throws FileNotFoundException{
        $(new RepertoirePage().onRepertoireForm().pdf).download();
    }

    @Step("Download docx file")
    public void docxDownload() throws FileNotFoundException{
        $(new RepertoirePage().onRepertoireForm().docx).download();
    }
    
    @Step("Check songs table visibility")
    public void songsTable(){
        $(new RepertoirePage().onRepertoireForm().table)
                .shouldBe(visible);
    }
    
    @Step("Get access to the table elements")
    public void inframeTable(){
        switchTo().frame($(".nKphmK"));
    }
    
    @Step("Seacrh for a song that exists in playlist. "
            + "The table should display a row with the searched song")
    public void songIsInPlaylist() {
        String word = "хлопья";
        $(new RepertoirePage().onRepertoireForm().searchSong)
                .scrollIntoView(true);
        $(new RepertoirePage().onRepertoireForm().searchSong).clear();
        $(new RepertoirePage().onRepertoireForm().searchSong)
                .sendKeys(word);
        $(new RepertoirePage().onRepertoireForm().tableBody)
                 .shouldHave(text(word)).shouldBe(visible);
    } 
    
    @Step("Seacrh a song that doesn't exist in the list. "
            + "The table should display \"Нет данных для показа.\"")
    public void songIsNotInPlaylist(){
        String word = "красный";
        String noSuchSong = "Нет данных для показа.";
        $(new RepertoirePage().onRepertoireForm().searchSong)
                .scrollIntoView(true);
        $(new RepertoirePage().onRepertoireForm().searchSong)
                .clear();
        $(new RepertoirePage().onRepertoireForm().searchSong)
                .sendKeys(word);
        $(new RepertoirePage().onRepertoireForm().tableBody)
                .shouldHave(text(noSuchSong)).shouldBe(visible);
    }
    
    @Step("Find first song in the list(asc order)")
    public String firstSongInList(){
        String firstElementBeforeSort = $(new RepertoirePage()
                .onRepertoireForm().firstElement).innerText();
        return firstElementBeforeSort;    
    }
    
    @Step("Find last song in the list (asc order)")
    public String lastSongInList(){
        String lastElementBeforeSort = $(new RepertoirePage()
                .onRepertoireForm().lastElement).innerText();
        return lastElementBeforeSort;
    }
    
    @Step("Press songsNumber button to display the song list in desc order")
    public void songsOrder(){

        String firstElementBeforeSort = firstSongInList();
        String lastElementBeforeSort = lastSongInList();
                
        $(new RepertoirePage().onRepertoireForm().arrowBtn)
                .shouldBe(enabled).doubleClick().scrollIntoView(true);
        $(new RepertoirePage()
                .onRepertoireForm().firstElementSort).shouldBe(visible);
        
        String firstElementAfterSort = $(new RepertoirePage()
                .onRepertoireForm().firstElementSort).innerText();
        String lastElementAfterSort = $(new RepertoirePage()
                .onRepertoireForm().lastElementSort).innerText();
        
        assertThat(firstElementBeforeSort, equalTo(lastElementAfterSort));
        assertThat(lastElementBeforeSort, equalTo(firstElementAfterSort));
    }
}