package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.List;

public class WorkEodApplePage extends BaseFunc {
    public WorkEodApplePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//input[@name='option[218]']") // Navigate to Radio buttons
    private List<WebElement> radioButtons;

    public void clickRadioButton(int i){ //  Click to one of the Radio buttons
        waitElementAppeared(radioButtons);
        radioButtons.get(i).click();
    }
    @FindBy(how = How.XPATH, using = "//input[@type='checkbox']") // Navigate to Checkbox buttons
    private List<WebElement> checkBoxButtons;

    public void clickcheckBoxButton(int i){ //  Click to one of the Checkbox buttons
        checkBoxButtons.get(i).click();
    }
    @FindBy(how = How.XPATH, using = "//select[@id='input-option217']") // Navigate to Select dropdown menu
    private WebElement dropdownSelect;

    public void chooseDropdownSelectColor(String color){ //  Click to one of the Select dropdown items
        Select select = new Select(dropdownSelect);
        select.selectByValue(color);
    }

    @FindBy(how = How.ID, using = "input-option209") // Navigate to Text area
    private WebElement textArea;

    public void enterTextToTextarea(String text){ //  Enter text to one Textarea
        textArea.sendKeys(text);
    }

    @FindBy(how = How.CSS, using = "[id='button-upload222']") // Navigate to Upload button
    private WebElement uploadButton;

    public void uploadFile(){ //  Enter text to one Textarea
        String path = "/Users/Igor/IdeaProjects/selenium_bootcamp/src/resources/Test document uploading.pdf";
        uploadButton.sendKeys(path);
    }

    @FindBy(how = How.XPATH, using = "//button[text()='Add to Cart']") // Navigate to Add to Cart button
    private WebElement addToCartButton;

    public void clickAddToCartButton() { //  Click Add to Cart button
        addToCartButton.click();
    }

    @FindBy(how = How.CSS, using = "[id='cart-total']") // Navigate to Cart button
    private WebElement cartButton;

    public void clickCartButton() { //  Click to Cart button
        cartButton.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='cart']/ul/li[2]/div/p/a[2]/strong") // Navigate to Checkout button
    private WebElement checkoutButton;

    public void clickCheckoutButton(){ //  Click to Checkout button
        checkoutButton.click();
    }
}
