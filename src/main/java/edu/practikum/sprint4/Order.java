package edu.practikum.sprint4;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import static locators.Locators.*;

public class Order {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private static final String URL_ORDER = "https://qa-scooter.praktikum-services.ru/order";

    public Order(WebDriver driver, long timeoutInSeconds) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public Order setUsername(String username) {
        driver.findElement(NAME_FIELD).sendKeys(username);
        return this;
    }

    public Order setSurname(String surname) {
        driver.findElement(SURNAME_FIELD).sendKeys(surname);
        return this;
    }

    public Order setAddress(String address) {
        driver.findElement(ADDRESS_FIELD).sendKeys(address);
        return this;
    }

    //метод клика в поле "Станция метро" и заполнения
    public Order chooseStation() {
        driver.findElement(STATION_FIELD).sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }

    public Order setPhone(String phone) {
        driver.findElement(PHONE_FIELD).sendKeys(phone);
        return this;
    }

    //метод нажатия на кнопку "Заказать" вверху старницы
    public Order clickButtonOrderHeader() {
        driver.findElement(BUTTON_ORDER_HEADER).click();
        return this;
    }

    //метод нажатия на кнопку "Заказать" в середине старницы
    public Order clickButtonOrderMiddle() {
        driver.findElement(BUTTON_ORDER_MIDDLE).click();
        return this;
    }

    //прокрутка до кнопки "Заказать" в середине страницы
    public Order scroll() {
        WebElement element = driver.findElement(By.xpath(".//div[@class='Home_FinishButton__1_cWm']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    //метод нажатия на кнопку "Далеt
    public Order clickNextButton() {
        driver.findElement(NEXT_BUTTON).click();
        return this;
    }

    //метод нажатия на кнопку "Далее"
    public Order clickCloseCookie() {
        driver.findElement(CLOSE_COOKIE).click();
        return this;
    }

    //метод клика в поле "Когда привезти самокат" и заполнения
    public Order fillInTimeOfDelivery() {
        driver.findElement(TIME_OF_DELIVERY).click();
        driver.findElement(By.xpath(".//div[@aria-label='Choose воскресенье, 5-е ноября 2023 г.']")).click();
        return this;
    }

    //метод клика в поле "Срок аренды" и выбора значения
    public Order fillInRentalPeriod() {
        driver.findElement(RENTAL_PERIOD).click();
        driver.findElement(By.xpath(".//div[@class='Dropdown-menu']/div[last()]")).click();
        return this;
    }

    //метод клика по чекбоксу "цвет чёрный жемчуг" в поле "Цвет самоката"
    public Order chooseColor() {
        driver.findElement(By.className("Checkbox_Input__14A2w")).click();
        return this;
    }

    //метод клика в поле "Комментарий" и заполнения
    public Order setComment(String comment) {
        driver.findElement(COMMENT_FIELD).sendKeys(comment);
        return this;
    }

    //метод нажатия на кнопку заказать
    public Order clickOrderButtonInForm() {
        driver.findElement(BUTTON_ORDER_IN_FORM).click();
        return this;
    }

    //метод ля наатия на кнопку "Да" в форме подтвержения заказа
    public Order clickButtonYes() {
        driver.findElement(YES_BUTTON).click();
        return this;
    }

    //метод проверки успешности заказа
    public Order checkSuccessMessage() {
        Assert.assertTrue("Заказ не оформлен ", driver.findElements(ORDER_DONE).isEmpty());
        return this;
    }

    public void checkUrlOrder() {
        wait.until(ExpectedConditions.urlToBe(URL_ORDER));
    }
}


