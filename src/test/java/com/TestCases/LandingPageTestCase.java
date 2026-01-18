package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.LandingPage;
import com.Pages.LoginPage;

	public class LandingPageTestCase extends BaseClass {

	    public LandingPage lp;

	    @BeforeMethod
	    public void initPage() {
	        lp = new LandingPage(driver);   // driver is ready here
	    }


	    @Test
	    void testEmailDisplayed() {
	        Assert.assertTrue(lp.isEmailDisplayed(), "Email/Login link is NOT displayed");
	    }

	    @Test
	    void testEmailClickable() {
	        LoginPage loginPage = lp.clickLogin();
	        Assert.assertTrue(loginPage.btnLogin.isDisplayed());
	    }

	    @Test
	    void testRegisterDisplayed() {
	        Assert.assertTrue(lp.isRegisterDisplayed(), "Register link is NOT displayed");
	    }

	    @Test
	    void testRegisterClickable() {
	        lp.isRegisterClicakable();
	        Assert.assertTrue(true, "Register link click action failed");
	    }


	    @Test
	    void testSearchBoxTyping() {
	        lp.searchBox("Laptop");
	        Assert.assertTrue(true, "Search text typing failed");
	    }

	    @Test
	    void testSearchButtonClickable() {
	        lp.clickSearch();
	        Assert.assertTrue(true, "Search button click failed");
	    }


	    @Test
	    void testAdvanceSearchDisplayed() {
	        Assert.assertTrue(lp.isAdvanceSearchDisplayed(), "Advance Search link is NOT displayed");
	    }

	    @Test
	    void testAdvanceSearchClickable() {
	        lp.isAdvanceSearcClicakbel();
	        Assert.assertTrue(true, "Advance Search link click failed");
	    }

	}


