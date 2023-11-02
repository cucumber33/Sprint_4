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
public class TestQuestionsAnswers extends Temp{
    private String questionLocator;
    private String answerLocator;

    public TestQuestionsAnswers(String questionLocator, String answerLocator) {
        this.questionLocator = questionLocator;
        this.answerLocator = answerLocator;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {QUESTION_ONE, ANSWER_ONE},
                {QUESTION_TWO, ANSWER_TWO},
                {QUESTION_THREE, ANSWER_THREE},
                {QUESTION_FOUR, ANSWER_FOUR},
                {QUESTION_FIVE, ANSWER_FIVE},
                {QUESTION_SIX, ANSWER_SIX},
                {QUESTION_SEVEN, ANSWER_SEVEN},
                {QUESTION_EIGHT, ANSWER_EIGHT},
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
}




