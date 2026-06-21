package com.akhila;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.akhila.pages.LoginPage;

public class LoginTest {

    public static void login(String username, String password) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        //driver.quit();
    }

    public static void main(String[] args) {

        login("tomsmith", "SuperSecretPassword!");
    }
}