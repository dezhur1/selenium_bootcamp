package classTests.day2;

import baseWebTest.BaseWebTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.day2.*;

public class WorkEodTest extends BaseWebTest {
    @BeforeClass
    public void navigateTo(){
        navigateTo("http://tutorialsninja.com/demo/index.php?route=common/home");
    }
    @Test
    public void findAndAddToCart(){
        WorkEodPage homePage = new WorkEodPage(driver);
        homePage.clickComponentsMenu();
        homePage.clickMonitorsSubMenu();

        WorkEodMonitorsPage monitorsPage = new WorkEodMonitorsPage(driver);
        monitorsPage.clickAddToCartApple(0); // 0 - Apple

        WorkEodApplePage applePage = new WorkEodApplePage(driver);
        applePage.clickRadioButton(0);// 0 - small, 1 - medium, 2 - large.
        applePage.clickcheckBoxButton(0);// 0 - checkbox2, 1 - checkbox3, 2 - checkbox4.
        applePage.chooseDropdownSelectColor("1");// 4-Red/3-Blue/1-Green/2-Yellow
        applePage.enterTextToTextarea("Hello World!");
        applePage.uploadFile(); // THE APROACH WE LEARNED (how to upload file on site (example FileUploadingTest)) DOES NOT WORK ON THIS SITE!
        applePage.acceptAlert();// NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        applePage.clickAddToCartButton();
        applePage.clickCartButton();
        applePage.clickCheckoutButton(); // NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!

        WorkEodCheckOutPage checkOutPage = new WorkEodCheckOutPage(driver);
        checkOutPage.clickOnGuestButton();//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.clickContinueButton();//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.enterFirstName("John");//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.enterLastName("Smith");//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.enterEmail("test@test.com");//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.enterPhoneNumber("12345678");//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.enterAdress("Baker st., 201");//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.enterCity("London");//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.enterPostCode("GB-2563");//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.selectCountry("117"); //117 - Latvia  //NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.selectRegion("4163");// 4163 - Riga  //NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.clickContinueButtonInStep2();//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.clickContinueButtonInStep4();//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.clickAgreeCheckbox();//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.clickContinueButtonInStep5();//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!
        checkOutPage.clickConfirmOrderButton();//NOT ACCESSIBLE DUE TO NOT UPLOADED FILE!














    }
}
