package com.pages;

import com.cucumberrunner.AbstractMain;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends AbstractMain {

    private static By SELECT_COUNTRY_TEXTBOX =By.cssSelector(".sta-tour-search-text.sta-ui-autocomplete-input");
    private static By SELECT_COUNTRY_OPTION=By.cssSelector("#ui-id-22 span");
    private static By SELECT_FIND_A_TOUR_BUTTON=By.cssSelector(".sta-submit.sta-contain");

    public void is_HomePage_Displayed(){
        Assert.assertEquals("Worldwide Tours | STA Travel",driver.getTitle());

    }

    public void select_Country_From_Ajax(String country){
        driver.findElements(SELECT_COUNTRY_TEXTBOX).get(1).clear();
        driver.findElements(SELECT_COUNTRY_TEXTBOX).get(1).sendKeys(country);
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SELECT_COUNTRY_OPTION));
        driver.findElement(SELECT_COUNTRY_OPTION).click();

    }

    public void select_Find_A_Tour_Button(){
        WebDriverWait wait=new WebDriverWait(driver,10);
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(driver.findElements(SELECT_FIND_A_TOUR_BUTTON).get(6)));
        element.click();

    }
}
