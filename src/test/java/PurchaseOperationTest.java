import org.example.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PurchaseOperationTest {

    private WebDriver driver;
    public static final String firstName = "Ann";
    public static final String lastName = "Now";
    public static final String email = "fdfd@gmail.com";
    public static final String phone = "857444777";
    public static final String address1 = "Rjnd 65";
    public static final String city = "Wroclaw";
    public static final String state = "LowerS";
    public static final String postcode = "45-666";


    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://practice.automationtesting.in/");
    }

    @Test
    public void shouldPurchaseOperation(){

        ConsentPopupPage consentPopupPage = new ConsentPopupPage(driver);
        consentPopupPage.isPopupDisplayed();
        consentPopupPage.clickConsentButton();
       // consentPopupPage.goToHomePage();

        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.goToShopPage();

        ShopPage shopPage = new ShopPage(driver);
        shopPage.addProduct169();
        headerPage.isShoppingCartVisible();
        headerPage.goToShoppingCartPage();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.isCheckoutButtonVisible();
        shoppingCartPage.goToCheckoutPage();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.insertFirstName(firstName);
        checkoutPage.insertLastName(lastName);
        checkoutPage.insertEmail(email);
        checkoutPage.insertPhone(phone);
        checkoutPage.insertAddress1(address1);
        checkoutPage.insertCity(city);
        checkoutPage.insertState(state);
        checkoutPage.insertPostcode(postcode);
        checkoutPage.goToOrderPage();


    }

    @After
    public void teardown(){
     //   driver.quit();
    }
}
