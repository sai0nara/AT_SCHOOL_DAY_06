package ru.lanit.atschool.steps;

import cucumber.api.java.ru.Пусть;
import org.openqa.selenium.WebDriver;
import ru.lanit.atschool.webdriver.WebDriverManager;

public class MainPageSteps{


    @Пусть("открыт браузер и введен адрес \"(.*)\"$")
    public void открытБраузерИВведенАдрес(String url) {
        WebDriver driver = WebDriverManager.getDriver();
        driver.get(url);
    }
}
