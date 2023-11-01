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
public class TestOrderInTheMiddle {
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
                {"Татьяна", "Варфоломеева", "ирк", "98347363233", "я вам не открою"},
                {"Джеймс", "Бщнд", "Irkuutsk", "89456335432", "no"}

        });
    }

    public void TestOrderInMiddle(String name, String surname, String address, String phone, String comment) {
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
        order = new Order(driver, 10);
    }

    @Test
    public void openOrderInHeader() {
        order
                .clickCloseCookie()
                .scroll()
                .clickButtonOrderMiddle()
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
                .checkSuccessMessage();
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}