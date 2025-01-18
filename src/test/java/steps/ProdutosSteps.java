package steps;

import core.Driver;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ProdutosPage;

import static org.junit.Assert.assertEquals;


public class ProdutosSteps {
    ProdutosPage produtosPage;

    @Entao("valido que exibe a tabela de produtos")
    public void validoQueExibeATabelaDeProdutos() {
        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());
    }

    @Quando("seleciono o pacote de cursos")
    public void selecionoOPacoteDeCursos() {
        Driver.swipe(0, 0, "down", 1.0);
        produtosPage.clickPacoteCursos();
    }
}
