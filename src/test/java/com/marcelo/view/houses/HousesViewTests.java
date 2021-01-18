package com.marcelo.view.houses;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

@Test
public class HousesViewTests {
    @Test
    public void smoke(){
        HousesViewExpected expected = HousesViewExpected.getInstance();
        HousesView actual = HousesView.getInstance();
        Assert.assertEquals(actual,expected);
    }
}

