package com.orangehrm.testsuite;

import com.orangehrm.pages.WelcomeAdminPage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    WelcomeAdminPage welcomeAdminPage = new WelcomeAdminPage();

    @Test (priority = 0, groups = { "smoke", "regression"})
    public void UserIsAbleToLoginSuccessfully (){
        homePage.setUsernameField();
        homePage.setPasswordField();
        homePage.clickonLoginBtn();
        welcomeAdminPage.displayWelcomeAdminText();
        SoftAssert sa = new SoftAssert();
        sa.assertTrue(welcomeAdminPage.getWelcomeAdminText().contains("Welcome Admin"));

    }


}
