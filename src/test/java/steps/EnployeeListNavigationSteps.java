package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBoardPage;

public class EnployeeListNavigationSteps {
    DashBoardPage dashBoardPage;

    @When("^user selects PIM on left hand side panel$")
    public void user_selects_pim_on_left_hand_side_panel()  {
         dashBoardPage=new DashBoardPage();
         dashBoardPage.selectPIM();

    }
    @And("^user selects Employee List From PIM menu$")
    public void user_selects_something_from_pim_menu()  {
    dashBoardPage.selectEmployeeList();
    }

    @Then("^user should navigate to Employee list page$")
    public void user_should_navigate_to_employee_list_page()  {
       dashBoardPage.employeSearchBtn();
    }

    @And("^should be able to see list of employees$")
    public void should_be_able_to_see_list_of_employees()  {
        dashBoardPage.employeListTable();

    }
}
