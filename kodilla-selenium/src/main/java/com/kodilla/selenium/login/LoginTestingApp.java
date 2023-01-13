package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestingApp {
        public static void main(String[] args) {
            //webdriver.chrome.driver wskazuje, gdzie na dysku znajduje się zainstalowany sterownik do przeglądarki Chrome
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
            //obiekt typu WebDriver – jest to interfejs pochodzący z biblioteki Selenium
            WebDriver driver = new ChromeDriver();
            //polecenia otwarcia strony o wskazanym adresie
            driver.get("https://kodilla.com/pl/test/login");
            //szukamy pola email przy pomocy metody By.xpath(String xpath)
            WebElement emailField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input"));
            //wpisujemy w to pole szukaną frazę
            emailField.sendKeys("testuser@gmail.com");
            //szukamy pola hasło przy pomocy metody By.xpath(String xpath)
            WebElement passwordField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input"));
            //wpisujemy w to pole szukaną frazę
            passwordField.sendKeys("Haslo");
        }
    }

