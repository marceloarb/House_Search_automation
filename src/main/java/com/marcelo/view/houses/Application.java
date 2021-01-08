package com.marcelo.view.houses;

public class Application {

    public static void main (String[] args){
        HousesView housesView = HousesView.getInstance();
        housesView.load();
        housesView.insertPrice();
    }
}
