package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomStoreApplication {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        storePom.insertPhrase("NoteBook",2);
        storePom.insertPhrase("School",1);
        storePom.insertPhrase("Brand",1);
        storePom.insertPhrase("Business",0);
        storePom.insertPhrase("Gaming",1);
        storePom.insertPhrase("Powerful",0);
    }
}
