package pages;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import java.io.IOException;
import java.util.List;

public class AddEmployeePage extends BasePage{
  @FindBy (css="#employeeId")
  WebElement empId;
  @FindBy(css="#firstName")
   WebElement firstName;
  @FindBy (css="#lastName")
  WebElement lastName;
  @FindBy(css="#photofile")
  WebElement photo;
  @FindBy(css="#btnSave")
  WebElement saveBtn;
  @FindBy(css="#personal_txtEmpFirstName")
  WebElement empName;


    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }

    public void addEmpPresence() {
        String empIdNo=empId.getAttribute("value");
        System.out.println(empIdNo);
        Assert.assertTrue(empIdNo,true);
    }

    public void EnterAddEMpCredentials(DataTable table) {
        List<List<String>> values = table.cells(0);
        firstName.sendKeys(values.get(1).get(0));
        lastName.sendKeys(values.get(1).get(1));
        String name=(values.get(1).get(0));
        System.out.println(name);


    }

    public void upLoadPhoto() {
        photo.sendKeys("C://hybrid//src//main//resources//7.png");

    }

    public void clickSave() {
        saveBtn.click();
    }

    public void verifyEmpAdded() {
        String EmployeeName=empName.getAttribute("value");
        System.out.println(EmployeeName);
        Assert.assertTrue(EmployeeName,true);



    }
}
