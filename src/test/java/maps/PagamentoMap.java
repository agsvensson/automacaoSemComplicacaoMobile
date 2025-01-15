package maps;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PagamentoMap {
    @AndroidFindBy(accessibility = "imagemCartao_credito")
    protected WebElement btnCartaoCredito;

    @AndroidFindBy(accessibility = "inputCredicard")
    protected WebElement inpCredicard;

    @AndroidFindBy(accessibility = "inputdata")
    protected WebElement inpData;

    @AndroidFindBy(accessibility = "inputCVV")
    protected WebElement inpCVV;

    @AndroidFindBy(accessibility = "inputNomeTitular")
    protected WebElement inpNomeTitular;

    @AndroidFindBy(accessibility = "inputCPFTitular")
    protected WebElement inpCPFTitular;

    @AndroidFindBy(accessibility = "confirmar_pagamento_botao")
    protected WebElement btnConfirmarPagamento;
}
