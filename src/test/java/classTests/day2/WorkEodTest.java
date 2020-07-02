package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.UploadPage;
import pageObject.day2.WorkEodPage;

public class WorkEodTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://tutorialsninja.com/demo/index.php?route=common/home");
    }
    @Test
    public void findAndAddToChart(){
        WorkEodPage findAndAddToChart = new WorkEodPage(driver);

        findAndAddToChart.clickComponentsMenu();
        findAndAddToChart.clickMonitorsSubMenu();
        findAndAddToChart.clickAddToChartApple();
        findAndAddToChart.clickRadioSmall();
    }
}
