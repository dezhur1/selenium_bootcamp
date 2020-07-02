package classTests.day3;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day3.PracticeFirstItemPage;
import pageObject.day3.PracticeHomePage;
import pageObject.day3.PracticeSecondItemPage;
import pageObject.day3.PracticeWomenPage;

public class PracticeWebPageTest extends BaseWebTest {

    @BeforeClass
    public void navigateTo(){
        navigateTo("http://automationpractice.com/index.php");
    }

    @Test
    public void practiceWebPageTest(){
        PracticeHomePage hp = new PracticeHomePage(driver);
        PracticeWomenPage wp = new PracticeWomenPage(driver);

        hp.clickWomenButton();
        wp.clickProduct(3);
        wp.clickAddToChartButton(3);
//        wp.clickAddToChartButton();



    }
}
