package com.marcelo.view.houses;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

@Test
public class HousesViewTests {
    @Test
    public void smoke(){
        String expected = HousesViewExpected.getInstance().getLabel();
        String actual = HousesView.getInstance().getLabel();

        Assert.assertEquals(actual,expected);
    }
}

