package uk.co.library.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;


public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void acceptAlert(){
        dismissAlert();
    }



    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;
    public void switchToIframe(WebElement element){
        driver.switchTo().frame(element);
    }
    public void clickAcceptCookies() {
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }



//    jobTitle
    @FindBy(id = "keywords")
    WebElement jobtitle;
    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobtitle,jobTitle);
    }

//    location
    @FindBy(id = "location")
    WebElement locationLink;
    public void enterLocation(String location){
        sendTextToElement(locationLink,location);
    }

//    distanceDropDown
    @FindBy(id = "distance")
    WebElement distanceLink;
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceLink,distance);
    }


//    moreSearchOptionsLink
    @FindBy(id = "toggle-hp-search")
    WebElement moreOptions;

public void clickOnMoreSearchOptionLink(){
    clickOnElement(moreOptions);
}

//    salaryMin
    @FindBy(id = "salarymin")
    WebElement salaryMin;
public void enterMinSalary(String minSalary){
    sendTextToElement(salaryMin,minSalary);
}

//    salaryMax
    @FindBy(id ="salarymax")
    WebElement salaryMax;
public void  enterMaxSalary(String maxSalary){
    sendTextToElement(salaryMax,maxSalary);
}

//    salaryTypeDropDown
    @FindBy(id = "salarytype")
    WebElement getSalaryType;
   public void  selectSalaryType(String salaryType){
       selectByVisibleTextFromDropDown(getSalaryType,salaryType);
   }

//    jobTypeDropDown
    @FindBy(id = "tempperm")
    WebElement typeJob;
   public void  selectJobType(String jobType){
       selectByVisibleTextFromDropDown(typeJob,jobType);
   }

//    findJobsBtn
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;
    public void clickOnFindJobsButton(){
       clickOnElement(findJobsBtn);
    }










}
