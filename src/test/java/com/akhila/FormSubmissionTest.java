package com.akhila;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormSubmissionTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {

            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            driver.findElement(By.name("my-text"))
                    .sendKeys("Akhila");

            driver.findElement(By.cssSelector("button"))
                    .click();

            String message =
                    driver.findElement(By.tagName("h1"))
                          .getText();

            if(message.equals("Form submitted")) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}