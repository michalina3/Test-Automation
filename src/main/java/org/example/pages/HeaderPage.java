package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getShopNavBar() {
        return driver.findElement(By.id("menu-item-40"));
    }
    public void goToShopPage(){
        getShopNavBar().click();
    }
    public WebElement isShoppingCartVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='wpmenucart-contents']")));
    }
    public WebElement getShoppingCartBar() {
        return driver.findElement(By.xpath("//a[@class='wpmenucart-contents']"));
    }
    public void goToShoppingCartPage(){
        getShoppingCartBar().click();
    }

}
