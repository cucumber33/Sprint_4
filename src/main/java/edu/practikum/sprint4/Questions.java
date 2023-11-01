package edu.practikum.sprint4;

import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Questions {
    private WebDriver driver;

    public Questions(WebDriver driver) {

        this.driver = driver;
    }

    public Questions scroll() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        return this;
    }

    public Questions clickQuestion(String questionLocator) {
        driver.findElement(By.xpath(questionLocator)).click();
        return this;
    }

    public boolean isAnswerDisplayed(String answerLocator) {
        try {
            driver.findElement(By.xpath(answerLocator));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}



