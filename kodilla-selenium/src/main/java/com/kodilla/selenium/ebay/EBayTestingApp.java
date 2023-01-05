package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        //webdriver.chrome.driver wskazuje, gdzie na dysku znajduje się zainstalowany sterownik do przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        //obiekt typu WebDriver – jest to interfejs pochodzący z biblioteki Selenium
        WebDriver driver = new ChromeDriver();
        //polecenia otwarcia strony o wskazanym adresie
        driver.get("https://www.ebay.com/");
        //szukamy nazwy pola input
        WebElement inputField = driver.findElement(By.name("_nkw"));
        //wpisujemy w to pole szukaną frazę
        inputField.sendKeys("Laptop");
        inputField.submit();

    }
}
