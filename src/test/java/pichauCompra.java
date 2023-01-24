import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class pichauCompra {

    WebDriver nav = new ChromeDriver();

    @Test
    public void testScreen() {
        nav.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        nav.manage().window().maximize();
        nav.get("https://www.pichau.com.br");
        nav.findElement(By.xpath("//a[contains(text(),'Entrar')]")).click();
        nav.findElement(By.id("username")).click();
        nav.findElement(By.id("username")).sendKeys("test.valtech2023@gmail.com");
        nav.findElement(By.id("password")).click();
        nav.findElement(By.id("password")).sendKeys("valtech9753");
        nav.findElement(By.xpath("//div[@id='__next']/main/div/div/div/div/div/form/button/span")).click();
        nav.findElement(By.xpath("//img[@alt='Pichau']")).click();
        nav.findElement(By.cssSelector(".slide___3-Nqo:nth-child(1) .MuiTypography-root")).click();
        Assert.assertEquals(nav.findElement(By.cssSelector(".content-title")).getText(), "CADEIRA GAMER THUNDERX3 TGC12 PRETO, TGC12 PT/PT");
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
        Assert.assertEquals(nav.findElement(By.cssSelector(".content-title")).getText(), "Revise seu pedido e finalize!");
        nav.findElement(By.xpath("//img[@alt='Pichau']")).click();
        nav.findElement(By.linkText("sair")).click();

    }
}
