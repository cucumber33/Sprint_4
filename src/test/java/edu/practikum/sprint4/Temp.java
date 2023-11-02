package edu.practikum.sprint4;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Temp {
    protected WebDriver driver;
    protected Order order;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        order = new Order(driver, 10);
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
