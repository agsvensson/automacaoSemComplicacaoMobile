package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginMap {

    public LoginPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void realizarLogin(String email, String password) {
        inpEmail.sendKeys(email);
        inpPassword.sendKeys(password);
        btnEntrar.click();
    }

    public String getTxtEmailError(){
        try {
            return txtEmailError.getText();
        } catch (Exception e) {
            return txtAuthErrorEmail.getText();
        }
    }

    public String getTxtPasswordError(){
        try {
            return txtPasswordError.getText();
        } catch (Exception e) {
            return txtAuthErrorPassword.getText();
        }
    }

    public void clickLinkNaoTemConta(){
        linkNaoTemConta.click();
    }

}
