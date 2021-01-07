package com.marcelo.view.houses;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

@Test
public class HousesViewTests {
    @Test
    public void smoke(){
        HousesView actual = HousesView.getInstance();
        ArrayList<String> expected = new ArrayList<>();
        Assert.assertEquals(actual,expected);
    }
}

