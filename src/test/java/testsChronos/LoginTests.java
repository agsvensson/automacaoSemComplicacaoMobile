package testsChronos;

import core.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProdutosPage;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTests {
    LoginPage loginPage;
    ProdutosPage produtosPage;

    @BeforeEach
    public void iniciaTesteLogin() throws MalformedURLException {
        Driver.inicializaDriver();
        loginPage = new LoginPage();
    }


    @Test
    public void realizarLoginValido() {
        loginPage.realizarLogin("teste@chronosacademy.com.br", "123456");
        produtosPage = new ProdutosPage();
        assertEquals("Conheça todos os nossos cursos", produtosPage.getTextTituloProdutos());
    }

    @Test
    public void realizarLoginEmailInvalido() throws MalformedURLException {
        loginPage.realizarLogin("teste", "123456");
        assertEquals("O email não é válido.", loginPage.getTxtEmailError());
    }

    @Test
    public void realizarLoginSenhaInvalida() throws MalformedURLException {
        loginPage.realizarLogin("teste@chronosacademy.com.br", "1234");
        assertEquals("A senha deve ter no mínimo 6 caracteres.", loginPage.getTxtPasswordError());
    }

    @Test
    public void realizarLoginEmailBranco() throws MalformedURLException {
        loginPage.realizarLogin("", "123456");
        assertEquals("O campo de email é obrigatório.", loginPage.getTxtEmailError());
    }

    @Test
    public void realizarLoginSenhaBranco() throws MalformedURLException {
        loginPage.realizarLogin("teste@chronosacademy.com.br", "");
        assertEquals("O campo de senha é obrigatório.", loginPage.getTxtPasswordError());
    }

    @Test
    public void realizarLoginEmailIncorreto() throws MalformedURLException {
        loginPage.realizarLogin("incorreto@chronosacademy.com.br", "123456");
        assertEquals("Email ou senha incorretos.", loginPage.getTxtEmailError());
    }

}
