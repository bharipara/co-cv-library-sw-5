package uk.co.library.Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlistners.CustomListeners;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitleField;

    @CacheLookup
    @FindBy(id = "location")
    WebElement locationField;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDownField;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsField;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMinField;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMaxField;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeField;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDownField;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtnField;

   public void clickOnAcceptCookies(){
       clickOnElement(acceptCookies);

   }

    public void enterJobTitle(String jobTitle) {
        CustomListeners.test.log(Status.PASS, "Click on Job Title ");
        Reporter.log("Clicking on Job Title" + jobTitle.toString());
        sendTextToElement(jobTitleField, jobTitle);

    }
    public void enterLocation(String location){
        CustomListeners.test.log(Status.PASS,"Enter location ");
        Reporter.log("Enter location" + location.toString());
        sendTextToElement(locationField,location);

    }

   public void selectDistance(String distance){
       CustomListeners.test.log(Status.PASS,"Select Distance ");
       Reporter.log("Select Distance" + distance.toString());
       selectByVisibleTextFromDropDown(distanceDropDownField,distance);

   }
   public void clickOnMoreSearchOptionLink(){
       CustomListeners.test.log(Status.PASS,"Click on More search option Link ");
       Reporter.log("Clicking on More search option Link" + moreSearchOptionsField.toString());
       clickOnElement(moreSearchOptionsField);

   }
    public void enterMinSalary(String minSalary){
        CustomListeners.test.log(Status.PASS,"Enter Min salary ");
        Reporter.log("Enter Min salary" + salaryMinField.toString());
        sendTextToElement(salaryMinField,minSalary);

    }
    public void enterMaxSalary(String maxSalary){
        CustomListeners.test.log(Status.PASS,"Enter Max salary ");
        Reporter.log("Enter Max salary" + salaryMaxField.toString());
        sendTextToElement(salaryMaxField,maxSalary);

    }
    public void selectSalaryType(String sType){
        CustomListeners.test.log(Status.PASS,"Select salary Type ");
        Reporter.log("Select salary Type" + salaryTypeField.toString());
        selectByVisibleTextFromDropDown(salaryTypeField,sType);

    }
    public void selectJobType(String jobType){
        CustomListeners.test.log(Status.PASS,"Select Job Type ");
        Reporter.log("Select Job Type" + jobTitleField.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDownField,jobType);

    }
    public void clickOnFindJobsButton(){
        CustomListeners.test.log(Status.PASS,"Click on Find Jobs Button ");
        Reporter.log("Click on Find Jobs Button" + findJobsBtnField.toString());
        clickOnElement(findJobsBtnField);

    }

}
