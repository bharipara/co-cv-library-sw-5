package uk.co.library.Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlistners.CustomListeners;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[@class ='search-header__title']")
    WebElement resultText;


    public void verifyTheResults(String expected) {
        CustomListeners.test.log(Status.PASS, "Verify the results");
        Reporter.log("Verify the results" + resultText.toString());
        String  actual= getTextFromElement(resultText);
        Assert.assertEquals(expected,actual);
    }

//    public String verifyTheResults(String expected){
//        Assert.assertEquals(resultText,expected);
//        CustomListeners.test.log(Status.PASS, "Verify the Results ");
//        Reporter.log("Verify the Results" + resultText.toString());
//        return getTextFromElement(resultText);

}
