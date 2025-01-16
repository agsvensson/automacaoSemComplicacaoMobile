package pages;

import core.Driver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import maps.PagamentoMap;
import org.openqa.selenium.support.PageFactory;

public class PagamentoPage extends PagamentoMap {
    public PagamentoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver()), this);
    }

    public void clickCartaoDeCredito() {
        btnCartaoCredito.click();
    }

    public void finalizaCompraCartao(String numeroCartao, String vencimento, String cvv, String nomeTitular,
                                     String cpfTitular) {
        inpCredicard.sendKeys(numeroCartao);
        inpData.sendKeys(vencimento);
        inpCVV.sendKeys(cvv);
        inpNomeTitular.sendKeys(nomeTitular);
        inpCPFTitular.sendKeys(cpfTitular);
        btnConfirmarPagamento.click();
    }

    public String getMsgPagamento(){
        return txtMsgPagamento.getText();
    }

}
