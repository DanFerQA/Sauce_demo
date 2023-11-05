package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuHamburg {

WebDriver driver;

String usuario = "standard_user";
String senha = "secret_sauce";
String url = "https://www.saucedemo.com/"; //Variavel global

@Before // Antes
public void setup(){

    WebDriverManager.chromedriver().setup(); // Configuração do navegador
    driver = new ChromeDriver(); // Escolhendo o Google Chrome como navegador padrão

}


@After // depois
public void exit(){

    driver.quit(); // Fecha o navegador aberto

}

@Dado("que o usuario fez o login e esta na tela de all products")
public void que_o_usuario_fez_o_login_e_esta_na_tela_de_all_products() {
    //Acessa a URL
    driver.get(url);

    // Clica e preenche o campo username
    driver.findElement(By.id("user-name")).click(); // Clica
    driver.findElement(By.id("user-name")).sendKeys(usuario); // Escreve

    // Clica e preenche o campo password
    driver.findElement(By.id("password")).click(); // Clica
    driver.findElement(By.id("password")).sendKeys(senha); // Escreve

    driver.findElement(By.id("login-button")).click(); // Clica

}
@Quando("clica em menu hamburg")
public void clica_em_menu_hamburg() {
  
driver.findElement(By.id("react-burger-menu-btn")).click();
//valida o caso 1 de menu hamburg
}
@Então("o menu deve abrir")
public void o_menu_deve_abrir() {

//String validacao = driver.findElement(By.id("about_sidebar_link")).getText();
//assertEquals("Abolt", validacao);


}

//valida o caso 2 de menu hamburg
@E("clica em cada um dos itens do menu")
public void clica_em_cada_um_dos_itens_do_menu() {
    
driver.findElement(By.id("inventory_sidebar_link")).Click();
String validacao1 = driver.getCurrentUrl();
assertEquals("https://www.saucedemo.com/inventory.html", validacao1);

driver.findElement(By.id("about_sidebar_link")).Click();
String validacao2 = driver.getCurrentUrl();
assertEquals("https://saucelabs.com/", validacao2);

//Volta para a parte produtos
driver.get(url);
driver.findElement(By.id("react-burger-menu-btn")).click();





}
@Então("cada um dos itens devem ser clicáveis")
public void cada_um_dos_itens_devem_ser_clicáveis() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
