package ru.bellintegrator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

public class Tests extends WebDriverSettings {

    @Test
    public void checkMore3ResultsGladiolus(){
        chromeDriver.get("https://www.google.com/");
        PageObjectBell bellPO = new PageObjectBell(chromeDriver);
        bellPO.findWord("Гладиолус");
        Assertions.assertTrue(bellPO.getFindElements().size()>2,"Less than 3 results");
    }

    @Test
    public void checkWordWikipedia() {
        chromeDriver.get("https://www.google.com/");
        PageObjectBell bellPO1 = new PageObjectBell(chromeDriver);
        bellPO1.findWord("Гладиолус");
        boolean present;
        try {
            chromeDriver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
            present = true;
        } catch (NoSuchElementException e) {
            present = false;
        }
        Assertions.assertTrue(present == true,"No such Шпажник - Википедия");
        }

}

