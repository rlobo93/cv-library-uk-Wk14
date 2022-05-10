package uk.co.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.library.utility.Utility;

import java.util.List;

public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    //Locators - resultText
    @FindBy(xpath = "//li[@class='results__item']")
    WebElement resultText;

    public String verifyTheResults(String expected){
        return getTextFromElement(resultText);
    }









//        clickOnElement(By.xpath("//input[@id='sp-cc-accept']"));
//        sendTextToElement(By.xpath("//input[@id='twotabsearchtextbox']"), "Dell Laptop");
//        clickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));
//        clickOnElement(By.xpath("//li[@id='p_89/Dell']//span[@class='a-list-item']//a[@class='a-link-normal s-navigation-item']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//label//i[@class='a-ico


    /// List<WebElement> number =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
    //    int actualnumber =number.size();
    //    System.out.println("Actual Number: "+ actualnumber);
    //    int expectednumber = 30;
    //    Assert.assertEquals(expectednumber,actualnumber);


//    clickOnElement(By.xpath("//li[@id='p_89/Dell']//span[@class='a-list-item']//a[@class='a-link-normal s-navigation-item']//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//label//i[@class='a-icon a-icon-checkbox']"));
//    // List<WebElement> number= driver.findElements(By.className("sg-col-inner"));//li[@class='results__item]
//    List<WebElement> number = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
//    int actualnumber = number.size();
//        System.out.println("===========================");
//        System.out.println("Number of Items on the Page:"+actualnumber);
//    int expected = 30;
//        Assert.assertEquals(30, actualnumber);
//    getTextFromElement(By.xpath("//div[@data-component-




}
