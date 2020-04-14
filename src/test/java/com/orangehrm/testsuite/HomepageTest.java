package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomepageTest extends TestBase {

    HomePage homePage = new HomePage();

    @Test (priority = 0, groups = {"sanity", "smoke"})
    public void verifyThatLoginPanelTextisDisplayed(){
        homePage.loginPanelTextisDisplayed();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(homePage.getLoginPanelText().contains("LOGIN Panel"));
    }

}
