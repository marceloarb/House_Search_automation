package com.marcelo.view.houses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HousesView {
    private static final String URL = "https://www.redfin.com/zipcode/75048/filter/viewport=32.99325:32.9415:-96.55098:-96.64751,no-outline";
    private UiHost uiHost = UiHost.getInstance();
    private HousesView() {
    }

    public static HousesView getInstance() {
        return new HousesView();
    }
    public void load(){uiHost.load(URL);}
    public String getLabel(){
        WebElement title = uiHost.getTitle();
       return title.getText();
    }
    public void insertPrice() {
       WebElement housePrice = uiHost.getSelector("#sidepane-header > div.StickyContainer-placeholder > div > div.exposedFilterForm.font-weight-roman > form > div > div.RangeSelect.quickPrice > span:nth-child(3) > span > span");
       housePrice.click();
       Select house = new Select(housePrice.findElement(By.xpath("//*[@id=\"sidepane-header\"]/div[2]/div/div[1]/form/div/div[2]/span[3]/span/span/select")));
       house.selectByIndex(13);
       
       
    }



}