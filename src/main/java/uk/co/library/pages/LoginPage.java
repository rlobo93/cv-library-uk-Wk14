package uk.co.library.pages;


import org.openqa.selenium.By;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailField = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");


    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        Reporter.log("Enter email link " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        Reporter.log("Enter password link " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        Reporter.log("Clicking on login button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

    public void loginToApplication(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}
