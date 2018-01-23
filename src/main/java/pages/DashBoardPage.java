package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashBoardPage extends BasePage {
    @FindBy(css="#welcome")
    WebElement welcomeLink;
    @FindBy(linkText="PIM")
    WebElement pimLink;
    @FindBy(css="#menu_pim_viewEmployeeList")
    WebElement employeList;
    @FindBy(css="#resultTable")
    WebElement webTable;
    @FindBy(css="#searchBtn")
    WebElement searchBtn;
    @FindBy (css="#menu_pim_addEmployee")
    WebElement addEmployee;
    AddEmployeePage addEmployeePage=new AddEmployeePage();

public DashBoardPage(){PageFactory.initElements(driver,this);
}
public boolean welcomeLinkDisplayed() {

    return welcomeLink.isDisplayed();
    }

    public void selectPIM() {
    pimLink.click();
    }

    public void selectEmployeeList() {
    employeList.click();

    }

    public void employeSearchBtn() {
    searchBtn.isDisplayed();
    }
    public void employeListTable(){
    webTable.isDisplayed();
    }

    public void clickAddEmployee() {
        addEmployee.click();
    }

    public void verifyEmpTable() {
        employeList.click();
        List<WebElement> rows=webTable.findElements(By.tagName("tr"));
        for (int i = 1; i < rows.size(); i++) {
            String nameOfEmpAdded="sunil";
            List <WebElement>coloumns=rows.get(i).findElements(By.tagName("td"));
            String ActualEmpAdded=coloumns.get(2).getText();
            if(nameOfEmpAdded.equalsIgnoreCase(ActualEmpAdded))
             break;




        }
    }
}
