package pageObject.day2;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.lang.model.element.Element;
import java.util.List;

public class WorkEodPage extends BaseFunc {
    public WorkEodPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[.='Components']") //  Navigate to Components
    private WebElement componentsMenu;

    public void clickComponentsMenu(){ //   Click to Components
        componentsMenu.click();
    }
    @FindBy(how = How.XPATH, using = "//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=25_28']") //  Navigate to Monitors
    private WebElement monitorsSubMenu;

    public void clickMonitorsSubMenu(){ //  Click to Components
        monitorsSubMenu.click();
    }
    @FindBy(how = How.XPATH, using = "//*[@id='content']/div[3]/div[1]/div/div[2]/div[2]/button[1]/span") // Navigate to Add to Chart button
    private WebElement addToChartApple;


    public void clickAddToChartApple(){ //  Click Add to chart button (Apple)
        addToChartApple.click();
    }

    @FindBy(how = How.XPATH, using = "//*[@id='input-option218']/div[1]/label") // Navigate to Radio "Small"   //input[@name='option[218]']
    private WebElement radioSmall;

    public void clickRadioSmall(){ //  Click to Radio "Small"
        radioSmall.click();
    }

}
