package pageObject.day2;

import com.sun.jdi.event.StepEvent;
import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

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
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Monitors')]") //  Navigate to Monitors
    private WebElement monitorsSubMenu;

    public void clickMonitorsSubMenu(){ //  Click to Monitors
        monitorsSubMenu.click();
    }
}
