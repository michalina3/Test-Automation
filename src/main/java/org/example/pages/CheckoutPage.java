package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstNameBar() {
        return driver.findElement(By.id("billing_first_name"));
    }
    public void insertFirstName(String firstName){
        getFirstNameBar().sendKeys(firstName);
    }
    public WebElement getLastNameBar() {
        return driver.findElement(By.id("billing_last_name"));
    }
    public void insertLastName(String lastName){
        getLastNameBar().sendKeys(lastName);
    }
    public WebElement getEmailBar() {
        return driver.findElement(By.id("billing_email"));
    }
    public void insertEmail(String email){
        getEmailBar().sendKeys(email);
    }
    public WebElement getPhoneBar() {
        return driver.findElement(By.id("billing_phone"));
    }
    public void insertPhone(String phone){
        getPhoneBar().sendKeys(phone);
    }
    public WebElement getAddress1Bar() {
        return driver.findElement(By.id("billing_address_1"));
    }
    public void insertAddress1(String address1){
        getAddress1Bar().sendKeys(address1);
    }
    public WebElement getCityBar() {
        return driver.findElement(By.id("billing_city"));
    }
    public void insertCity(String city){
        getCityBar().sendKeys(city);
    }
    public WebElement getStateBar() {
        return driver.findElement(By.id("billing_state"));
    }
    public void insertState(String state){
        getStateBar().sendKeys(state);
    }
    public WebElement getPostcodeBar() {
        return driver.findElement(By.id("billing_postcode_field"));
    }
    public void insertPostcode(String postcode){
        getPostcodeBar().sendKeys(postcode);
    }

    public WebElement getPlaceOrderButton() {
        return driver.findElement(By.id("place_order"));
    }
    public void goToOrderPage() {
        getPlaceOrderButton().click();
    }

}
