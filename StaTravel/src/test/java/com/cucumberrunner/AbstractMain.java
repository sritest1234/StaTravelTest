package com.cucumberrunner;

import com.pages.HomePage;
import com.pages.SearchResultsPage;
import org.openqa.selenium.WebDriver;

public class AbstractMain {

    public static WebDriver driver;
    public static HomePage homepage=new HomePage();
    public static SearchResultsPage searchresultspage=new SearchResultsPage();
}
