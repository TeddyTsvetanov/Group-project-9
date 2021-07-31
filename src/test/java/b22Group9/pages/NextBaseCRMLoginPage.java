package b22Group9.pages;

import b22Group9.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseCRMLoginPage {

    public NextBaseCRMLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@name='USER_LOGIN']")
    public WebElement inputUserName;

    @FindBy (xpath = "//input[@name='USER_PASSWORD']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;
}
