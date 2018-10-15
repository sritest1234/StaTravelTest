package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends AbstractMain {
    private static String BASE_URL="http://www.statravel.co.uk/tours-worldwide.htm";
    private static By ACCEPT_COOKIES=By.cssSelector("#sta-cookie-save-all-button");

    @Before

    public void start(){
        System.setProperty("webdriver.chrome.driver","./src/test/resources/Drivers/chromedriver");
        driver=new ChromeDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        driver.findElement(ACCEPT_COOKIES).click();
    }
    @After

    public void close(){
        driver.close();
    }
}
