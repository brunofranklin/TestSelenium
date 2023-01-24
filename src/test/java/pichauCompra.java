import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    }
}
