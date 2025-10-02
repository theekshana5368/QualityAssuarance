package com.example.springcrud.Selenium;

import java.time.Duration;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientUiTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Make sure chromedriver.exe is in your PATH or specify its location
        driver = new ChromeDriver();
    }

    @Test
    public void testAddClient() {
        driver.get("http://localhost:8080/clients/create"); 

        
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("email")).sendKeys("john@example.com");
        driver.findElement(By.id("address")).sendKeys("123 Main St");

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
        submitBtn.click();


        Assertions.assertFalse(driver.getPageSource().contains("John Doe"));
    }

     @Test
     public void testEditClient(){
        driver.get("http://localhost:8080/clients/edit?id=8");

        driver.findElement(By.id("name")).clear();        
        driver.findElement(By.id("name")).sendKeys("Shashini Perera");

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("shashini@example.com");

        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("Mabola Wattala");



         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit']")));
         submitBtn.click();

        Assertions.assertTrue((driver.getPageSource().contains("Shashini Perera")));
     }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
