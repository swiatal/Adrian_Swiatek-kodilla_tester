package com.kodilla.selenium.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreSearchExample {
    public static void main(String[] args) {
        //webdriver.chrome.driver wskazuje, gdzie na dysku znajduje się zainstalowany sterownik do przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        //obiekt typu WebDriver – jest to interfejs pochodzący z biblioteki Selenium
        WebDriver driver = new ChromeDriver();
        //polecenia otwarcia strony o wskazanym adresie
        driver.get("https://kodilla.com/pl/test/store");
        //szukamy nazwy pola input
        WebElement inputField = driver.findElement(By.name("search"));
        //wpisujemy w to pole szukaną frazę
        inputField.sendKeys("School");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my_Class")));
    }
}
