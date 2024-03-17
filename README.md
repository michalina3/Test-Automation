# Test-Automation
Purchase Operation Automation

Description
This project contains an automated purchase test on the e-commerce website practice.automationtesting.in. The test script adds a book to the cart, proceeds to the checkout process, and completes the operation on the order confirmation page ('Order Details'). The test is written in Java using Selenium WebDriver.

Requirements
Java Development Kit (JDK) version 20 or higher
IntelliJ IDEA or other preferred IDE
Selenium WebDriver
WebDriver for Chrome browser
Maven (for managing dependencies and building the project)

Setup
Open the project in IntelliJ IDEA or your preferred IDE.
Ensure JDK is installed and configured as the default Java version in the project.
Ensure WebDriver for the Chrome browser is downloaded and configured in the project.
Run the mvn clean test command in the terminal to execute the tests.

Project Structure
- src/main/java: Contains the following classes:
CheckoutPage: Contains methods for automating the checkout process.
ConsentPopupPage: Handles consent pop-up interactions.
HeaderPage: Contains methods for interactions with the website header.
HomePage: Represents the home page and contains related methods.
ShopPage: Contains methods for navigating and interacting with the shop page.
ShoppingCartPage: Represents the shopping cart page and contains methods for cart operations.
- src/test/java: Contains the PurchaseOperationTest class, which contains the automated purchase test.
- pom.xml: Maven configuration file containing project dependencies.

