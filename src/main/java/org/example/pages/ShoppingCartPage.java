package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartPage {
    private WebDriver driver;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriverWait wait;

    public WebElement isCheckoutButtonVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".checkout-button")));
    }
    public WebElement getCheckoutButton() {
        return driver.findElement(By.cssSelector(".checkout-button"));
    }
    public void goToCheckoutPage() {
        getCheckoutButton().click();
    }

}
