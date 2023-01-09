package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaStorePomTestSuite {

    KodillaStorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }

    @Test
    public void testStorePage() throws InterruptedException {
        int search1 = storePom.insertPhrase ("NoteBook", 2);
        int search11 = storePom.insertPhrase ("NoteBOOK", 2);

        int search2 = storePom.insertPhrase ("School", 1);
        int search22 = storePom.insertPhrase ("SCHOOl", 1);

        int search3 = storePom.insertPhrase ("Brand", 1);
        int search33 = storePom.insertPhrase ("BRANd", 1);

        int search4 = storePom.insertPhrase ("Business", 0);
        int search44 = storePom.insertPhrase ("BUSINESs", 0);

        int search5 = storePom.insertPhrase ("Gaming", 1);
        int search55 = storePom.insertPhrase ("GAMINg", 1);

        int search6 = storePom.insertPhrase ("Powerful", 0);
        int search66 = storePom.insertPhrase ("POWERFUl", 0);

        assertEquals(2, search1);
        assertEquals(2, search11);
        assertEquals(1, search2);
        assertEquals(1, search22);
        assertEquals(1, search3);
        assertEquals(1, search33);
        assertEquals(0, search4);
        assertEquals(0, search44);
        assertEquals(1, search5);
        assertEquals(1, search55);
        assertEquals(0, search6);
        assertEquals(0, search66);
    }
}
