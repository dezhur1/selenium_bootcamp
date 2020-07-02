package classTests.day1;

import baseWebTest.BaseWebTest;
import core.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day1.ChapterOnePage;
import pageObject.day1.HomePage;

public class ChapterOneTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://book.theautomatedtester.co.uk/");
    }
    @Test
    public void chapterOneTest() {
        HomePage homePage = new HomePage(driver);

        Assertions.assertTrue(homePage.chapter1.isDisplayed(), "Chapter link not displayed");

        homePage.clickChapterOne();

        //************************************
        ChapterOnePage chapterPage = new ChapterOnePage(driver);
        chapterPage.setTextBox("Hello WArld!");

        chapterPage.setSelectTypeDD("Selenium RC");
        Assertions.assertEquals("Hello World!", chapterPage.getTextOfTextBox(), "Text not the same");

        //************************************
        chapterPage.getTextOfWindowLink();
        String textLink = chapterPage.getTextOfWindowLink();

        Assertions.assertNotNull(textLink);


        //************************************
        chapterPage.printAttributeOfVerifyButton();

//        Assertions.assertEquals("Verify this button he here", chapterPage.getAttributeOfVerifyButton(), "Attribute is not the same");

        //*************************************
        chapterPage.printCssValueguide();

        Assertions.assertNotEquals("yellow", chapterPage.printCssValueguide());

    }
}
