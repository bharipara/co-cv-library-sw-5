package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "jobSearch")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow","5 miles","30000","500000","Per annum","Permanent","Permanent Tester jobs in Harrow"},
                {"Developer","London","7 miles","28000","32000","Per annum","Permanent","Permanent Developer jobs in London"},
                {"Senior Business Analyst","Birmingham","10 miles","40000","45000","Per annum","Permanent","Permanent Senior Business Analyst jobs in Birmingham"},
                {"Test Analyst","West London","15 miles","39000","45000","Per annum","Permanent","Permanent Test Analyst jobs in West London"},
                {"Test Engineer","Somerset","10 miles","3000","4000","Per month","Contract","Contract Test Engineer jobs in Somerset"},
                {"Test Manager","London","10 miles","4000","5000","Per month","Contract","Contract Test Manager jobs in London"},
                {"Development Manager","London","15 miles","50000","60000","Per annum","Permanent","Permanent Development Manager jobs in London"}



        };
        return data;
    }
}
