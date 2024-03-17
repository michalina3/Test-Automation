package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ConsentPopupPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ConsentPopupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public WebElement getConsentButton() {
        return driver.findElement(By.cssSelector(".fc-button-label"));
    }
    public void goToHomePage(){
        getConsentButton().click();
    }

    // Metoda do sprawdzenia czy okienko pop up jest widoczne
    public boolean isPopupDisplayed() {
        try {
            return driver.findElement(By.cssSelector(".fc-button-label")).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


   public void clickConsentButton() {
     WebElement consentButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".fc-button-label")));
       consentButton.click();
    }
}
