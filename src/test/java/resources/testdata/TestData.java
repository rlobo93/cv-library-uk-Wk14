package resources.testdata;

import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name = "jobSearch")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester","Harrow", "up to 5 miles","30000" ,"50000","Per annum","Permanent" ,"Permanent"},
                {"Tester","Harrow", "up to 5 miles","30000" ,"50000","Per annum","Permanent" ,"Permanent"},
                {"automation tester","Harrow", "up to 15 miles","30000" ,"50000","Per annum","Permanent" ,"Permanent"},
                {"automation tester","Harrow", "up to 5 miles","30000" ,"50000","Per annum","Permanent" ,"Permanent"},
                {"automation tester","Harrow", "up to 5 miles","30000" ,"50000","Per annum","Permanent" ,"Permanent"},
                {"automation tester","UB1", "up to 25 miles","30000" ,"70000","Per annum","Permanent" ,"Permanent"},
                {"automation tester","UB1", "up to 25 miles","30000" ,"70000","Per annum","Permanent" ,"Permanent"},
                {"automation tester","UB1", "up to 25 miles","30000" ,"70000","Per annum","Permanent" ,"Permanent"},

        };
        return data;
    }


    @DataProvider(name = "registration")
    public Object[][] registerData(){
        Object[][] data = new Object[][]{
                {""}
        };
        return data;
    }

}
