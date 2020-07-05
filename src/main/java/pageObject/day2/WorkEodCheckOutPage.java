package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WorkEodCheckOutPage extends BaseFunc {
    public WorkEodCheckOutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.CSS, using = "[value='guest']")// Navigate to Guest button
    private WebElement guestButton;

    public void clickOnGuestButton(){ // Click Guest button
        guestButton.click();
    }

    @FindBy(how = How.ID, using = "button-account")// Navigate to Guest button
    private WebElement continueButton;

    public void clickContinueButton(){ // Click Guest button
        continueButton.click();
    }

    @FindBy(how = How.ID, using = "input-payment-firstname")// Navigate to First Name field
    private WebElement firstName;

    public void enterFirstName(String text){ // Enter First name
        firstName.sendKeys(text);
    }

    @FindBy(how = How.ID, using = "input-payment-lastname")// Navigate to Last Name field
    private WebElement lastName;

    public void enterLastName(String text){ // Enter Last name
        lastName.sendKeys(text);
    }

    @FindBy(how = How.ID, using = "input-payment-email")// Navigate to Email field
    private WebElement email;

    public void enterEmail(String text){ // Enter email
        email.sendKeys(text);
    }
    @FindBy(how = How.ID, using = "input-payment-email")// Navigate to Phone field
    private WebElement phoneNumber;

    public void enterPhoneNumber(String text){ // Enter phone number
        phoneNumber.sendKeys(text);
    }
    @FindBy(how = How.ID, using = "input-payment-address-1")// Navigate to Adress1 field
    private WebElement adress1;

    public void enterAdress(String text){ // Enter phone number
        adress1.sendKeys(text);
    }

    @FindBy(how = How.ID, using = "input-payment-city")// Navigate to City field
    private WebElement city;

    public void enterCity(String text){ // Enter City
        city.sendKeys(text);
    }

    @FindBy(how = How.ID, using = "input-payment-postcode")// Navigate to Post Code field
    private WebElement postCode;

    public void enterPostCode(String text){ // Enter Post Code
        postCode.sendKeys(text);
    }

    @FindBy(how = How.NAME, using = "country_id") // Navigate to Country dropdown menu
    private WebElement countrySelect;

    public void selectCountry(String name){ //  Select one of the Country dropdown items
        Select select = new Select(countrySelect);
        select.selectByValue(name);
    }

    @FindBy(how = How.NAME, using = "zone_id") // Navigate to Region/State dropdown menu
    private WebElement regionSelect;

    public void selectRegion(String name){ //  Select one of the Region/State dropdown items
        Select select = new Select(regionSelect);
        select.selectByValue(name);
    }
    @FindBy(how = How.ID, using = "button-guest")// Navigate to Continue button (in step 2)
    private WebElement continueButtonInStep2;

    public void clickContinueButtonInStep2(){ // Click Continue button (in step 2)
        continueButtonInStep2.click();
    }
    @FindBy(how = How.ID, using = "button-shipping-method")// Navigate to Continue button (in step 4)
    private WebElement continueButtonInStep4;

    public void clickContinueButtonInStep4(){ // Click Continue button (in step 4)
        continueButtonInStep4.click();
    }

    @FindBy(how = How.NAME, using = "agree")// Navigate to Agree to Terms checkbox (in step 5)
    private WebElement agreeCheckbox;

    public void clickAgreeCheckbox(){ // Click Agree Checkbox (in step 5)
        agreeCheckbox.click();
    }

    @FindBy(how = How.ID, using = "button-payment-method")// Navigate to Continue button (in step 5)
    private WebElement continueButtonInStep5;

    public void clickContinueButtonInStep5(){ // Click Continue button (in step 5)
        continueButtonInStep5.click();
    }

    @FindBy(how = How.ID, using = "button-confirm")// Navigate to Confirm Order button (in step 6)
    private WebElement confirmOrderButton;

    public void clickConfirmOrderButton(){ // Click Confirm Order button (in step 6)
        confirmOrderButton.click();
    }
}
