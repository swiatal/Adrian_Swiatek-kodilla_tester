package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaStorePom {

    @FindBy(css = "input[name ='search']")
    WebElement searchField;

    @FindAll({@FindBy(css = "#elements-wrapper > div")})
    public List<WebElement> result;
    WebDriver driver;
    public int numberOfResult;

    public KodillaStorePom(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public int insertPhrase(String search, int numberOfResult) throws InterruptedException {
        this.numberOfResult = numberOfResult;
        searchField.clear();
        searchField.sendKeys(search);
        Thread.sleep(1000);
        System.out.println(result.size() == numberOfResult);
        System.out.println(result.size());
        return numberOfResult;
    }
}
