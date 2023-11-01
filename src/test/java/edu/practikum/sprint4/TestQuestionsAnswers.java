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

import static locators.Locators.*;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestQuestionsAnswers {
    private WebDriver driver;
    private String questionLocator;
    private String answerLocator;

    public TestQuestionsAnswers(String questionLocator, String answerLocator) {
        this.questionLocator = questionLocator;
        this.answerLocator = answerLocator;
    }
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { question1, answer1 },
                { question2, answer2 },
                { question3, answer3 },
                { question4, answer4 },
                { question5, answer5 },
                { question6, answer6 },
                { question7, answer7 },
                { question8, answer8 },
        });
    }
    @Test
    public void testCheckAllQuestions() {

        Questions questions = new Questions(driver);
        questions
                .scroll()
                .clickQuestion(questionLocator);
        assertTrue(questions.isAnswerDisplayed(answerLocator));

    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}




