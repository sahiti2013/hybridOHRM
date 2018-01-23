package steps;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.DriverFactory;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

public class LoginSteps {
public LoginPage loginPage;
public DashBoardPage dashBoardPage;

    @Before
    public void start() {
        DriverFactory.startBrowser();
    }
    /*@After
    public void stop(){
        DriverFactory.stopBrowser();
    }*/


    @Given("^admin on login page$")
    public void admin_on_login_page(){
        loginPage=new LoginPage();
        loginPage.loginbuttonDisplayed();


    }

    @When("^admin enters username,password$")
    public void admin_enters_usernamepassword(DataTable table)  {
loginPage.enterUsernamePassword(table);


    }

    @And("^clicks login button$")
    public void clicks_login_button()  {
        loginPage.ClickLoginbtn();

    }



    @Then("^admin should enter into dashboard page$")
    public void admin_should_enter_into_dashboard_page()  {
        dashBoardPage=new DashBoardPage();
        dashBoardPage.welcomeLinkDisplayed();


    }


}
