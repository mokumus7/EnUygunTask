package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {


    @FindBy(xpath = "//button[@id=\"headlessui-tabs-tab-:rd:\"]")
    public WebElement ucakBileti;
    @FindBy(xpath = "//button[@id=\"headlessui-tabs-tab-:re:\"]")
    public WebElement otel;
    @FindBy(xpath = "//button[@id=\"headlessui-tabs-tab-:rf:\"]")
    public WebElement otobus;
    @FindBy(xpath = "//button[@id=\"headlessui-tabs-tab-:rg:\"]")
    public WebElement aracKiralama;
    @FindBy(xpath = "//button[@id=\"headlessui-tabs-tab-:rh:\"]")
    public WebElement transfer;


    @FindBy(xpath = "//*[@data-testid=\"search-one-way-input\"]")
    public WebElement tekYon;
    @FindBy(xpath = "//*[@data-testid=\"search-round-trip-text\"]")
    public WebElement gidisDonus;
    @FindBy(xpath = "//*[@data-testid=\"search-multi-destination-label\"]")
    public WebElement cokluUcus;

    @FindBy(xpath = "//input[@data-testid=\"endesign-flight-origin-autosuggestion-input\"]")
    public WebElement nereden;

    @FindBy(xpath = "//input[@data-testid=\"endesign-flight-destination-autosuggestion-input\"]")
    public WebElement nereye;


    @FindBy(xpath = "//*[@data-testid=\"enuygun-homepage-flight-departureDate-datepicker-input\"]")
    public WebElement gidisTarihi;
    @FindBy(xpath = "//*[@data-testid=\"enuygun-homepage-flight-returnDate-input-comp\"]")
    public WebElement donusTarihi;


    @FindBy(xpath = "//h3[@data-testid=\"enuygun-homepage-flight-departureDate-month-name-and-year\"]")
    public List<WebElement> mountYearDepartureDate;

    @FindBy(xpath = "//h3[@data-testid=\"enuygun-homepage-flight-returnDate-month-name-and-year\"]")
    public List<WebElement> mountYearReturnDate;



    @FindBy(xpath = "//*[@data-testid=\"enuygun-homepage-flight-departureDate-month-forward-button\"]")
    public WebElement calendarRightArrowDepartureDate;



    @FindBy(xpath = "//*[@data-testid=\"enuygun-homepage-flight-returnDate-month-forward-button\"]")
    public WebElement calendarRightArrowReturnDate;

    @FindBy(xpath = "//div[text()=\"Aktarmasız\"]")
    public WebElement aktarmasiz;

    @FindBy(xpath = "//div[text()=\"Yolcu Sayısı, Kabin\"]")
    public WebElement yolcuSayisiKabin;


    @FindBy(xpath = "//button[@data-testid=\"flight-adult-counter-plus-button\"]")
    public WebElement adult;

    @FindBy(xpath = "//button[@data-testid=\"flight-child-counter-plus-button\"]")
    public WebElement child;

    @FindBy(xpath = "//button[@data-testid=\"flight-infant-counter-plus-button\"]")
    public WebElement infant;

    @FindBy(xpath = "//button[@data-testid=\"enuygun-homepage-flight-doneBtn\"]")
    public WebElement tamam;


    @FindBy(xpath = "//button[@data-testid=\"enuygun-homepage-flight-ekonomiCabin\"]")
    public WebElement ekonomi;

    @FindBy(xpath = "//button[@data-testid=\"enuygun-homepage-flight-businessCabin\"]")
    public WebElement business;

    @FindBy(xpath = "//button[@data-testid=\"enuygun-homepage-flight-comfortCabin\"]")
    public WebElement premiumEkonomi;
    @FindBy(xpath = "//button[@data-testid=\"enuygun-homepage-flight-firstCabin\"]")
    public WebElement firstClass;

    @FindBy(xpath = "//button[@data-testid=\"enuygun-homepage-flight-submitButton\"]")
    public WebElement ucuzBiletBulButton;



}
