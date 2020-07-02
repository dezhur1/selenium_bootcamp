package pageObject.day3;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticeSecondItemPage extends BaseFunc {
    public PracticeSecondItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//span[contains(text(), 'Add to cart')]")
    private WebElement addToChartSecondItem;

    public void clickAddToChartSecondItem(){
        addToChartSecondItem.click();
    }
}
