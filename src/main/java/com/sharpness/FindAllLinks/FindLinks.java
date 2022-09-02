package com.sharpness.FindAllLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class FindLinks {

    public List<WebElement> findAllLinks(String link) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--log-level=3", "--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get(link);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("\n\n\n\n" + "Links: ");
        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println(allLinks.get(i).getAttribute("href"));
        }
        System.out.println("\n\n\n\n");
        return allLinks;
    }
}
