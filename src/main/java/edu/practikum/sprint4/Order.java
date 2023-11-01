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

    public Order(WebDriver driver, long timeoutInSeconds) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public Order setUsername(String username) {
        driver.findElement(nameField).sendKeys(username);
        return this;
    }

    public Order setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
        return this;
    }

    public Order setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
        return this;
    }

    //метод клика в поле "Станция метро" и заполнения
    public Order chooseStation() {
        driver.findElement(stationField).sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }

    public Order setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    //метод нажатия на кнопку "Заказать" вверху старницы
    public Order clickButtonOrderHeader() {
        driver.findElement(buttonOrderHeader).click();
        return this;
    }

    //метод нажатия на кнопку "Заказать" в середине старницы
    public Order clickButtonOrderMiddle() {
        driver.findElement(buttonOrderMiddle).click();
        return this;
    }
    //прокрутка до кнопки "Заказать" в середине страницы
    public Order scroll() {
        WebElement element = driver.findElement(By.xpath(".//div[@class='Home_FinishButton__1_cWm']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }

    //метод нажатия на кнопку "Далее"
    public Order clickNextButton() {
        driver.findElement(nextButton).click();
        return this;
    }

    //метод нажатия на кнопку "Далее"
    public Order clickCloseCookie() {
        driver.findElement(closeCookie).click();
        return this;
    }

    //метод клика в поле "Когда привезти самокат" и заполнения
    public Order fillInTimeOfDelivery() {
        driver.findElement(timeOfDelivery).click();
        driver.findElement(By.xpath(".//div[@aria-label='Choose воскресенье, 5-е ноября 2023 г.']")).click();
        return this;
    }
    //метод клика в поле "Срок аренды" и выбора значения
    public Order fillInRentalPeriod() {
        driver.findElement(rentalPeriod).click();
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
        driver.findElement(commentField).sendKeys(comment);
        return this;
    }

    //метод нажатия на кнопку заказать
    public Order clickOrderButtonInForm() {
        driver.findElement(buttonOrderInForm).click();
        return this;
    }
    //метод ля наатия на кнопку "Да" в форме подтвержения заказа
    public Order clickButtonYes() {
        driver.findElement(buttonYes).click();
        return this;
    }
/*метод для ожидания загрузки формы заказа "Для кого самокат"
    public void waitForLoadOrderContent() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(orderContent).getText() != null
                && !driver.findElement(orderContent).getText().isEmpty()
        ));
    }
    //метод для ожидания загрузки формы заказа "Про аренду"
    public void waitForLoadOrderRentContent() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(orderRentContent).getText() != null
                && !driver.findElement(orderRentContent).getText().isEmpty()
        ));
    }
    //метод для ожидания загрузки подтверждения заказа
    public void waitForLoadOrderConfirm() {
        new WebDriverWait(driver, 3).until(driver -> (driver.findElement(orderConfirm).getText() != null
                && !driver.findElement(orderConfirm).getText().isEmpty()
        ));
    }

 */
    //метод проверки успешности заказа
    public Order checkSuccessMessage(){
        Assert.assertFalse("Заказ оформлен ", driver.findElements(orderDone).isEmpty());
        return this;
    }
    public void checkUrlOrder() {
        wait.until(ExpectedConditions.urlToBe("https://qa-scooter.praktikum-services.ru/order"));
    }
}


