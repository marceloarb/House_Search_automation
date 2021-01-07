package com.marcelo.view.houses;

public class HousesViewExpected {

    private static final String LABEL = "redfin";

    private HousesViewExpected(){}
    public static HousesViewExpected getInstance() {
        return new HousesViewExpected();
    }

    public String getLabel(){
        return LABEL;
    }
}
