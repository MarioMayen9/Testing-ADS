package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class primerTest {
    public WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void escribirEnLaBarraDeBusqueda(){
        WebElement barra;
        barra = driver.findElement(By.cssSelector("#APjFqb"));
        barra.sendKeys("UCA");
    }

    public void cerrarPagina(){
      //  driver.quit();
    }

    @Test
    public void test(){
        setUp();
        escribirEnLaBarraDeBusqueda();
        cerrarPagina();
    }




}
