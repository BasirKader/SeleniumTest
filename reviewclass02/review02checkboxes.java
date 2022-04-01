package com.syntax.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class review02checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement checkbox1=driver.findElement(By.cssSelector("input#isAgeSelected"));
        System.out.println("the checkbox is selected "+ checkbox1.isSelected());
        //select the checkbox
        checkbox1.click();
        Thread.sleep(1000);
        //deselect the checkbox

        WebElement message = driver.findElement(By.id("txtAge"));
        System.out.println(message.getText());
        checkbox1.click();

        //get all the available options
        List<WebElement>checkBoxes= driver.findElements(By.xpath("//input[@class='cb1-element]"));


        for (WebElement checkBox:checkBoxes) {
            checkBox.click();
        }
        Thread.sleep(1000);

        for (WebElement checkBox:checkBoxes) {
            checkBox.click();
        }



    }
}
