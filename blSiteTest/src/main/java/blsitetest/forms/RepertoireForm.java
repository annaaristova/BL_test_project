
package blsitetest.forms;

import org.openqa.selenium.By;

public class RepertoireForm {
    public By docx = By.xpath("//*[@id=\"comp-k8df9esm\"]/a");
    public By pdf = By.xpath("//*[@id=\"comp-k8df9esh\"]/a");
    public By searchSong = By.xpath("//*[@id=\"filterBox\"]/form/div/div/input");
    public By tableBody = By.xpath("//*[@id=\"theTable\"]/tbody/tr");
    public By table = By.xpath("//*[@id=\"comp-kt8rpm8v\"]/iframe");
    public By arrowBtn = By.xpath("//*[@id=\"theTable\"]/thead/tr/th[1]/span");
    public By tableTrOne = By.xpath("//*[@id=\"theTable\"]/tbody/tr[1]");
    public By firstElement = By.xpath("//*[@id=\"theTable\"]/tbody/tr[1]");
    public By lastElement = By.xpath("//*[@id=\"theTable\"]/tbody/tr[last()]");
    public By firstElementSort = By.xpath("//*[@id=\"theTable\"]/tbody/tr[1]");
    public By lastElementSort = By.xpath("//*[@id=\"theTable\"]/tbody/tr[last()]");
}