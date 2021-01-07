package com.marcelo.view.houses;

import org.openqa.selenium.chrome.ChromeDriver;

public class UiHost {
    private static final String DRIVER_PATH = "./src/main/resources/chromedriver.exe";
    private static ChromeDriver driver;
    private static UiHost uiHost;

    private UiHost(){}
    public static UiHost getInstance(){
        if(uiHost == null){
            uiHost = new UiHost();
        }
        return uiHost;
    }
    public ChromeDriver getDriver(){
        System.setProperty("webdriver", DRIVER_PATH);
        if(driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    public void load(String url){getDriver().get(url);}
}
