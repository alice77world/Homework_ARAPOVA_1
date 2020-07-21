package ru.bellintegrator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PageObjectBell {
    private WebDriver chromeDriver;
    WebElement inputSearch;
    List<WebElement> findElements;

    PageObjectBell(WebDriver chromeDriver){ //конструктор
        this.chromeDriver = chromeDriver;
        inputSearch = chromeDriver.findElement(By.name("q"));
    }

    public List<WebElement> getFindElements() { //результат поиска
        return chromeDriver.findElements(By.xpath("//span[@class='st']"));
    }

    public void findWord(String word){ //поиск по слову
        inputSearch.sendKeys(word);
        inputSearch.submit();
    }
}
