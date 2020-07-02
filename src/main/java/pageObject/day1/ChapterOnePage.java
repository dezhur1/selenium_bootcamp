package pageObject.day1;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChapterOnePage extends BaseFunc {
    public ChapterOnePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how=How.ID, using = "html5div")
    private WebElement textBox;

    @FindBy(how=How.ID, using = "multiplewindow")
    private WebElement windowLink;

    @FindBy(how=How.ID, using = "verifybutton")
    private WebElement verifyButton;

    @FindBy(how=How.CLASS_NAME, using = "multiplewindow")
    private WebElement seleniumText;

    @FindBy(how = How.CSS, using ="[id='selecttype']")
    private WebElement selectTypeDD;

    public void setTextBox(String textToSend){
        textBox.clear();
        textBox.sendKeys(textToSend);
    }
    public String getTextOfTextBox() {                           //for assertion
        return textBox.getText();
    }

    public String getTextOfWindowLink() {
        String text = windowLink.getText();
        System.out.println(text);
        return text;
    }


    public void printAttributeOfVerifyButton() {
        String value = verifyButton.getAttribute("value");
        System.out.println(value);
    }
//    public String getAttributeOfVerifyButton() {                 //for assertion
//        return verifyButton.getAttribute("value");
//    }

    public String printCssValueguide(){
        return seleniumText.getCssValue("color");
    }
    public void setSelectTypeDD(String optionName){
        sellectByVisibleText(selectTypeDD, optionName );
    }



}
