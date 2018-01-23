package pages;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static pages.BasePage.driver;

public class LoginPage extends BasePage {
    @FindBy(css = "#txtUsername")
    WebElement username;
    @FindBy(css = "#txtPassword")
    WebElement password;
    @FindBy(css = "#btnLogin")
    WebElement loginBtn;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public boolean loginbuttonDisplayed() {
return loginBtn.isDisplayed();
    }


    public void enterUsernamePassword(DataTable table) {

            List<List<String>> values = table.cells(0);
            username.sendKeys(values.get(1).get(0));
            password.sendKeys(values.get(1).get(1));


    }

    public void ClickLoginbtn() {
        loginBtn.click();
    }


}


