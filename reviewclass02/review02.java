package com.syntax.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class review02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement femalebtn = driver.findElement(By.xpath("//input[@value='Female' and  @name='optradio']"));
//        check if the radio btn is enabled
        System.out.println("the female radio btn is enabled "+femalebtn.isEnabled());
//        check if the radio btn female is displayed
        System.out.println("the female radio btn is displayed "+femalebtn.isDisplayed());
//        check if its selected or not
        System.out.println("the female radio btn is selected " +femalebtn.isSelected());

//        check if the button is not selected amd select it
        if(!femalebtn.isSelected()){
            femalebtn.click();
        }
//        check the status of selection again
        System.out.println("the female radio btn is selected " +femalebtn.isSelected());


//        to get all the links in the current webpagen and print their text
        List<WebElement> links = driver.findElements(By.tagName("a"));


        for(WebElement link:links){
            String name = link.getText();
            if(!name.isEmpty()){
                System.out.println(name);
            }
        }

    }
}