package com.akhila;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void login(String username, String password) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username"))
              .sendKeys(username);

        driver.findElement(By.id("password"))
              .sendKeys(password);

        driver.findElement(By.cssSelector("button[type='submit']"))
              .click();

        String message = driver.findElement(By.id("flash"))
                               .getText();

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Result: " + message);
        System.out.println("-------------------------");

        driver.quit();
    }

    public static void main(String[] args) {

        // Valid username + Valid password
        login("tomsmith", "SuperSecretPassword!");

        // Valid username + Invalid password
        login("tomsmith", "wrongpass");

        // Invalid username + Valid password
        login("wronguser", "SuperSecretPassword!");

        // Invalid username + Invalid password
        login("wronguser", "wrongpass");

        // Blank username
        login("", "SuperSecretPassword!");

        // Blank password
        login("tomsmith", "");

        // Blank username and password
        login("", "");
    }
}
