package edu.practikum.sprint4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestOrderInHeader {
    private WebDriver driver;
    private Order order;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String comment;

    @Parameterized.Parameters
    public static Collection<String[]> testData() {
        return Arrays.asList(new String[][]{
                {"Татьяна", "Варфоломеева", "Иркутск", "98347363233", "я вам не открою"},
                {"Джеймс", "Бщнд", "Пермь", "89456335432", "no"}
        });
    }

    public TestOrderInHeader(String name, String surname, String address, String phone, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.comment = comment;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        order = new Order(driver, 3);
    }

    @Test
    public void openOrderInHeader() {
        order
                .clickCloseCookie()
                .clickButtonOrderHeader()
                .setUsername(name)
                .setSurname(surname)
                .setAddress(address)
                .chooseStation()
                .setPhone(phone)
                .clickNextButton()
                .fillInTimeOfDelivery()
                .fillInRentalPeriod()
                .chooseColor()
                .setComment(comment)
                .clickOrderButtonInForm()
                .clickButtonYes()
                .checkSuccessMessage()
                .checkUrlOrder();
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}
