package com.syntax.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class review02dropDowns {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");


        WebElement createNewAccount = driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);
//get the desired dropdown
        WebElement daysoptions=driver.findElement(By.cssSelector("select#day"));
//use selenium select class
        Select days=new Select(daysoptions);
        days.selectByValue("5");
        Thread.sleep(2000);
        days.selectByIndex(0);
        Thread.sleep(2000);
        days.selectByVisibleText("25");
// print all the options of the dropdown
//get all the options using select class
       List<WebElement> options =days.getOptions();

        for(WebElement option:options){
            System.out.println(option.getText());
        }

//------------------------
    }
}
