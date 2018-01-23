package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends DriverFactory {
    //ExplicitWait
    WebDriverWait wait=new WebDriverWait(driver,AutomationConstants.timeout);
    public void waitForElementClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitForElementVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    //MoveToElement
    public static void moveTo(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }
    //MouseHoverAndClick
    public static void mouseHoverAndClick(WebElement elementToHover,WebElement elementToClick){
        Actions action=new Actions(driver);
        action.moveToElement(elementToHover).click(elementToClick).build().perform();
    }

    //sleep
    public void sleep(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void dragAndDop(WebElement From){
        Actions action=new Actions(driver);
        action.dragAndDropBy(From,38,0).build().perform(); //Select from minimum 40 dollars
    }
}

