package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class codeChallenge {

    public WebDriver driver;

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void escribirUsuarioLogIn(){
        WebElement barra;
        barra = driver.findElement(By.cssSelector("#user-name"));
        barra.sendKeys("standard_user");
    }

    public void escribirPasswordLogIn(){
        WebElement barra;
        barra = driver.findElement(By.cssSelector("#password"));
        barra.sendKeys("secret_sauce");
    }

    public void clickLoginButton(){
        WebElement button;
        button = driver.findElement(By.cssSelector("#login-button"));
        button.click();
    }

    public void clickAddToCartButton(){
        WebElement button;
        button = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack"));
        button.click();
    }

    public void clickAddToCart2Button(){
        WebElement button;
        button = driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light"));
        button.click();
    }


    public void clickViewCartutton(){
        WebElement button;
        button = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]"));
        button.click();
    }

    public void removerItemButton(){
        WebElement button;
        button = driver.findElement(By.cssSelector("#remove-sauce-labs-backpack"));
        button.click();
    }

    public void CheckoutButton(){
        WebElement button;
        button = driver.findElement(By.cssSelector("#checkout"));
        button.click();
    }




    @Test
    public void test(){
        setUp();
        escribirUsuarioLogIn();
        escribirPasswordLogIn();
        clickLoginButton();
        clickAddToCartButton();
        clickAddToCart2Button();
        clickViewCartutton();
        removerItemButton();
        CheckoutButton();
    }



}
