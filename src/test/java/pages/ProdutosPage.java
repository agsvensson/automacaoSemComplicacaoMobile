package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.ProdutosMap;
import org.openqa.selenium.support.PageFactory;

public class ProdutosPage extends ProdutosMap {

    public ProdutosPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public String getTextTituloProdutos() {
        return txtTituloProdutos.getText();
    }

    public void clickPacoteCursos(){
        btnComprarPacoteCursos.click();
    }
}
