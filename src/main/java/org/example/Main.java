package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "driver//chrome_driver//chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Google.com URL
        driver.get("https://www.amazon.de/");

        // Wait for 5 seconds to allow the user to see the page
        Thread.sleep(5000);

        // Wait for 5 seconds to allow the user to see the search results
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }

}