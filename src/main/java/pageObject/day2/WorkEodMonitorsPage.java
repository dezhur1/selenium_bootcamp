package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class WorkEodMonitorsPage extends BaseFunc {
    public WorkEodMonitorsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//button[contains(@onclick, 'cart.add')]") // Navigate to Add to Cart button
    private List<WebElement> addToCart;

    public void clickAddToCartApple(int i){ //  Click Add to chart button (Apple)
        addToCart.get(i).click();
    }
}
