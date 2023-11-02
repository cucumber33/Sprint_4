package locators;
import org.openqa.selenium.By;


public class Locators {
    //локаторы для Questions
    public static final String QUESTION_ONE = ".//*[@id='accordion__heading-0']";
    public static final String ANSWER_ONE = ".//*[@id='accordion__panel-0']";
    public static final String QUESTION_TWO = ".//*[@id='accordion__heading-1']";
    public static final String ANSWER_TWO = ".//*[@id='accordion__panel-1']/p";
    public static final String QUESTION_THREE = ".//*[@id='accordion__heading-2']";
    public static final String ANSWER_THREE = ".//*[@id='accordion__panel-2']/p";
    public static final String QUESTION_FOUR = ".//*[@id='accordion__heading-3']";
    public static final String ANSWER_FOUR = ".//*[@id='accordion__panel-3']/p";
    public static final String QUESTION_FIVE = ".//*[@id='accordion__heading-4']";
    public static final String ANSWER_FIVE = ".//*[@id='accordion__panel-4']/p";
    public static final String QUESTION_SIX = ".//*[@id='accordion__heading-5']";
    public static final String ANSWER_SIX = ".//*[@id='accordion__panel-5']/p";
    public static final String QUESTION_SEVEN = ".//*[@id='accordion__heading-6']";
    public static final String ANSWER_SEVEN = ".//*[@id='accordion__panel-6']/p";
    public static final String QUESTION_EIGHT = ".//*[@id='accordion__heading-7']";
    public static final String ANSWER_EIGHT = ".//*[@id='accordion__panel-7']/p";

    //локаторы для Order

    //закрыть куки
    public static final By CLOSE_COOKIE = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    //переменная для пути к кнопке "Заказать" вверху страницы
    public static final By BUTTON_ORDER_HEADER = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    //переменная для пути к кнопке "Заказать" в середине странице
    public static final By BUTTON_ORDER_MIDDLE = By.xpath(".//div[@class='Home_FinishButton__1_cWm']");
    //переменная для пути к кнопке "Заказать" в форме заказа
    public static final By BUTTON_ORDER_IN_FORM = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By NAME_FIELD = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']");
    public static final By SURNAME_FIELD = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    public static final By ADDRESS_FIELD = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    public static final By STATION_FIELD = By.className("select-search__input");
    public static final By PHONE_FIELD = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    public static final By TIME_OF_DELIVERY = By.className("react-datepicker__input-container");
    public static final By RENTAL_PERIOD = By.className("Dropdown-placeholder");
    public static final By COMMENT_FIELD = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    public static final By NEXT_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By YES_BUTTON = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    public static final By ORDER_DONE = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

}