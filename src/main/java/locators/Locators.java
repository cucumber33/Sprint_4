package locators;

import org.openqa.selenium.By;

public class Locators {
    //локаторы для Questions
    public static final String question1 = ".//*[@id='accordion__heading-0']";
    public static final String answer1 = ".//*[@id='accordion__panel-0']";
    public static final String question2 = ".//*[@id='accordion__heading-1']";
    public static final String answer2 = ".//*[@id='accordion__panel-1']/p";
    public static final String question3 = ".//*[@id='accordion__heading-2']";
    public static final String answer3 = ".//*[@id='accordion__panel-2']/p";
    public static final String question4 = ".//*[@id='accordion__heading-3']";
    public static final String answer4 = ".//*[@id='accordion__panel-3']/p";
    public static final String question5 = ".//*[@id='accordion__heading-4']";
    public static final String answer5 = ".//*[@id='accordion__panel-4']/p";
    public static final String question6 = ".//*[@id='accordion__heading-5']";
    public static final String answer6 = ".//*[@id='accordion__panel-5']/p";
    public static final String question7 = ".//*[@id='accordion__heading-6']";
    public static final String answer7 = ".//*[@id='accordion__panel-6']/p";
    public static final String question8 = ".//*[@id='accordion__heading-7']";
    public static final String answer8 = ".//*[@id='accordion__panel-7']/p";

    //локаторы для Order

    //закрыть куки
    public static final By closeCookie = By.xpath(".//button[@class='App_CookieButton__3cvqF']");

    //переменная для пути к кнопке "Заказать" вверху страницы
    public static final By buttonOrderHeader = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']");
    //переменная для пути к кнопке "Заказать" в середине странице
    public static final By buttonOrderMiddle = By.xpath(".//div[@class='Home_FinishButton__1_cWm']");
    //переменная для пути к кнопке "Заказать" в форме заказа
    public static final By buttonOrderInForm = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By nameField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']");
    public static final By surnameField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    public static final By addressField = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    public static final By stationField = By.className("select-search__input");
    public static final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    public static final By timeOfDelivery = By.className("react-datepicker__input-container");
    public static final By rentalPeriod = By.className("Dropdown-placeholder");
    public static final By commentField = By.xpath(".//input[@class = 'Input_Input__1iN_Z Input_Responsible__1jDKN']");
    public static final By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public static final By buttonYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    public static final By orderDone = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']");

}