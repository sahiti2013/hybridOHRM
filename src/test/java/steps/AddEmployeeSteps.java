package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddEmployeePage;
import pages.DashBoardPage;

public class AddEmployeeSteps {
   public DashBoardPage dashBoardPage;
    public AddEmployeePage addEmployeePage;
    @When("^user selects Add Employee Link$")
    public void user_selects_add_employee_link()  {
        dashBoardPage=new DashBoardPage();
        dashBoardPage.clickAddEmployee();


    }
    @Then("^user should enter into add employee page$")
    public void user_should_enter_into_add_employee_page()  {
     addEmployeePage=new AddEmployeePage();
     addEmployeePage.addEmpPresence();



    }

    @When("^user enters FirstName,lastName$")
    public void user_enters_firstnamelastname(DataTable table)  {
        addEmployeePage.EnterAddEMpCredentials(table);


    }

    @And("^uploads a photograph$")
    public void uploads_a_photograph() {
        addEmployeePage.upLoadPhoto();

    }

    @And("^user clicks save button$")
    public void user_clicks_save_button()  {
        addEmployeePage.clickSave();
    }

    @Then("^Employee should be created successfully$")
    public void employee_should_be_created_successfully()  {
addEmployeePage.verifyEmpAdded();
    }

    @And("^able to see recently added Employee in Employee list page$")
    public void able_to_see_recently_added_employee_in_employee_list_page()  {
        dashBoardPage.verifyEmpTable();

    }
}
