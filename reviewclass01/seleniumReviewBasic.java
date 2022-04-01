package com.syntax.reviewclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumReviewBasic {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        //WebElement username=driver.findElement(By.id("userName"));

       // username.sendKeys("fuvhurrvuv");

       // username.clear();

        //username.sendKeys("Whats up my dude");


        WebElement username=driver.findElement(By.xpath("//input[@id='username']"));

        username.sendKeys("hellothere");













    }
}
