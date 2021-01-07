package com.marcelo.view.houses;

import org.openqa.selenium.chrome.ChromeDriver;

public class HousesView {
    private static final String URL = "https://www.redfin.com/zipcode/75048/filter/viewport=32.99325:32.9415:-96.55098:-96.64751,no-outline";
    private HousesView() {
    }

    public static HousesView getInstance() {
        return new HousesView();
    }
    public void load(){UiHost.getInstance().load(URL);}



}