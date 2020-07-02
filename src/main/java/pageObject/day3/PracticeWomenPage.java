package pageObject.day3;

import core.BaseFunc;
import model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PracticeWomenPage extends BaseFunc {

    public PracticeWomenPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='product-image-container']")
    private List<WebElement> productContainer;

//    @FindBy(how = How.XPATH, using = ".//span[.='Add to cart']")
//    private WebElement addToChartButton;


    public void clickProduct(int i) {
        waitElementAppeared(productContainer);
        productContainer.get(i).click();
    }

//    public void clickAddToChartButton() {
//        waitElementAppeared(addToChartButton);
//        addToChartButton.click();
//    }
//    public Product getProductAttributes(){
//
//        Product addToChartButton = new Product();
//    }
    public void clickAddToChartButton(int i){
        productContainer.get(i).findElement(By.xpath(".//span[contains(text(), 'Add to cart')]")).click();
    }
}

