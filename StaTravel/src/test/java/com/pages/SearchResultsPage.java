package com.pages;

import com.cucumberrunner.AbstractMain;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchResultsPage extends AbstractMain {
    private static By CHANGE_SORT_ORDER=By.cssSelector("#sortSelect");
    private static By SELECT_VIEW_MORE_BUTTON=By.cssSelector("#btnViewMore");
    private static By ACTUAL_RESULTS=By.cssSelector("h4 a");
    private static By TOTAL_SEARCH_RESULTS_COUNT=By.cssSelector("#lblTotalSearchResult");

    public void is_SearchResultsPage_Displayed(){
        Assert.assertEquals("Find Great Adventures at Great Prices on AdventureLink! | STA Travel",driver.getTitle());
    }

    public void change_Sort_Order_Price(){
        Select pricedropdown=new Select(driver.findElement(CHANGE_SORT_ORDER));
        pricedropdown.selectByIndex(0);
    }

    public void select_ViewMore_Button(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,4000)");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SELECT_VIEW_MORE_BUTTON));
        driver.findElement(SELECT_VIEW_MORE_BUTTON).click();
    }

    public int verify_Actual_Results(){
        return driver.findElements(ACTUAL_RESULTS).size();
    }
    public int get_Total_SearchResults_Count(){

       return Integer.parseInt(driver.findElement(TOTAL_SEARCH_RESULTS_COUNT).getText().substring(0,2));

    }

}
