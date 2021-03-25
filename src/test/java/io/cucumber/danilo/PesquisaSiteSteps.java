package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class PesquisaSiteSteps {

	public WebDriver browser;
	
	public PesquisaSiteSteps() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");		
		browser = new ChromeDriver();
	}
	   
	@Quando("eu acesso o site da gama academy")
	public void eu_acesso_o_site_da_gama_academy() {
	    browser.get("https://www.gama.academy/");
	}
	
	@Quando("clico para fechar propaganda")
	public void clico_para_fechar_propaganda()throws InterruptedException {
		 Thread.sleep(4000);
		 browser.findElement(By.cssSelector(".ub-emb-close")).click();
	}
	

    @Quando("clico na opcao quem somos")
    public void clico_na_opcao_quem_somos() {
    	WebElement input = browser.findElement( By.cssSelector("a[class='nav-link nav w-nav-link']"));
    	input.click();
    }
   
    @Entao("devo ver o item {string}")
    public void devo_ver_o_item(String string) {
       WebElement input =browser.findElement(By.cssSelector(".manifesto h1.heading.lado"));
       assertEquals(string,input.getText());
       input.click();
       browser.quit();
       
    }
       
       
}
   

 