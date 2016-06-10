package com.visa.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebTestDataProvider {
	
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider() {
 
        return new Object[][] {
                { "Guru99", "India" },
                { "Krishna", "UK" },
                { "Bhupesh", "USA" }
            };
    }
    
    @Test(dataProvider = "SearchProvider")
    public void testSearch(String name, String country) {
    	System.out.println("name = " + name + " country: " + country);
    }

}
