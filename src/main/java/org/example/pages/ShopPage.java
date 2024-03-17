package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
    private WebDriver driver;

    public ShopPage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement getProduct169Button() {
        return driver.findElement(By.xpath("//a[@data-product_id='181']"));
    }
    public void addProduct169(){
        getProduct169Button().click();
    }
}
