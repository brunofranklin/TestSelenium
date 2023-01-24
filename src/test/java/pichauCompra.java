import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class pichauCompra {

    WebDriver nav = new ChromeDriver();
    String url = "https://www.pichau.com.br";
    String email = "test.valtech2023@gmail.com";
    String senha = "valtech9753";

    @Test
    public void simulandoCompra() {
        nav.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        nav.manage().window().maximize();
        nav.get(url);
        nav.findElement(By.xpath("//a[contains(text(),'Entrar')]")).click();
        nav.findElement(By.id("username")).click();
        nav.findElement(By.id("username")).sendKeys(email);
        nav.findElement(By.id("password")).click();
        nav.findElement(By.id("password")).sendKeys(senha);
        nav.findElement(By.xpath("//div[@id='__next']/main/div/div/div/div/div/form/button/span")).click();
        nav.findElement(By.xpath("//img[@alt='Pichau']")).click();
        nav.findElement(By.cssSelector("//div[@id='__next']/main/div[3]/section/div/div/div/ul/li/div/a/div/div[3]/h2")).click();
        Assert.assertEquals(nav.findElement(By.xpath("//div[@id='__next']/main/div[2]/div/div[2]/h1")).getText(), "CADEIRA GAMER THUNDERX3 TGC12 PRETO, TGC12 PT/PT");
        nav.findElement(By.xpath("//div[@id='__next']/main/div[2]/div/div[2]/div[4]/div[2]/div/button/span")).click();
        nav.findElement(By.cssSelector(".jss16 .MuiButton-label")).click();
        nav.findElement(By.xpath("(//input[@id='my-input'])[2]")).click();
        nav.findElement(By.xpath("(//input[@id='my-input'])[2]")).sendKeys("25964-201");
        nav.findElement(By.xpath("//div[@id='__next']/main/div/div/div[2]/div[2]/div[3]/div/div/div/div[2]/button/span")).click();
        nav.findElement(By.name("gender1")).click();
        nav.findElement(By.xpath("//div[@id='__next']/main/div/div/div/div/a/span")).click();
        nav.findElement(By.name("shipping_address")).click();
        nav.findElement(By.cssSelector(".MuiButton-containedSecondary > .MuiButton-label")).click();
        nav.findElement(By.cssSelector(".MuiButton-contained > .MuiButton-label")).click();
        Assert.assertEquals(nav.findElement(By.xpath("//div[@id='__next']/main/div[3]/div/div/div/div/h2")).getText(), "Revise seu pedido e finalize!");
        nav.findElement(By.xpath("//img[@alt='Pichau']")).click();
        nav.findElement(By.linkText("sair")).click();

    }
}
