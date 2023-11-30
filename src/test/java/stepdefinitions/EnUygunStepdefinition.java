package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.FlightListPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.fillFormField;
import static utilities.ReusableMethods.waitFor;

public class EnUygunStepdefinition {

    HomePage homePage = new HomePage();
    FlightListPage flightListPage = new FlightListPage();


    @Given("User goes to {string}")
    public void userGoesTo(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("User chooses the {string} tab")
    public void userChoosesTheTab(String vehicleType) {
        switch (vehicleType) {
            case "Ucak bileti":
                homePage.ucakBileti.click();
                break;
            case "Otel":
                homePage.otel.click();
                break;
            case "Otobus":
                homePage.otobus.click();
                break;
            case "Arac Kiralama":
                homePage.aracKiralama.click();
                break;
            case "Transfer":
                homePage.transfer.click();
                break;
        }

    }


    @When("User chooses the {string}")
    public void userChoosesThe(String options) {
        switch (options) {
            case "Tek Yon":
                homePage.tekYon.click();
                break;
            case "Gidis-Donus":
                homePage.gidisDonus.click();
                break;
            case "Coklu Ucus":
                homePage.cokluUcus.click();
                break;

        }
    }


    @When("User enters departure location {string}")
    public void userEntersDepartureLocation(String departure_location) {
        fillFormField(homePage.nereden, departure_location);

    }

    @When("User enters arrival location {string}")
    public void userEntersArrivalLocation(String arrivallocation) {
        fillFormField(homePage.nereye, arrivallocation);

    }

    @When("User enters departure date {int} {string}")
    public void userEntersDepartureDate(int day, String month) {
        homePage.gidisTarihi.click();

        List<String> date = new ArrayList<>();

        do {

            for (int i = 0; i < homePage.mountYearDepartureDate.size(); i++) {
                date.add(homePage.mountYearDepartureDate.get(i).getText());
            }

            if (date.contains(month)) {
                Driver.
                        getDriver().
                        findElement(By.xpath("//*[text()='" + month + "']/parent::div/following-sibling::div[2]//button[@data-day='" + day + "']")).click();

                break;
            }
            date.clear();
            homePage.calendarRightArrowDepartureDate.click();
        } while (true);

    }

    @When("User enters arrival date {int} {string}")
    public void userEntersArrivalDate(int day, String month) {
        homePage.donusTarihi.click();

        List<String> date = new ArrayList<>();

        do {

            for (int i = 0; i < homePage.mountYearReturnDate.size(); i++) {
                date.add(homePage.mountYearReturnDate.get(i).getText());
            }

            if (date.contains(month)) {
                Driver.
                        getDriver().
                        findElement(By.xpath("//*[text()='" + month + "']/parent::div/following-sibling::div[2]//button[@data-day='" + day + "']")).click();

                break;
            }
            date.clear();
            homePage.calendarRightArrowReturnDate.click();
        } while (true);
        waitFor(5);
    }


    @When("User clicks on Aktarmasiz checkbox")
    public void userClicksOnAktarmasizCheckbox() {
        homePage.aktarmasiz.click();


    }

    @When("User enters the passenger count \\(Yetiskin {int} Cocuk {int} Bebek {int})")
    public void userEntersThePassengerCountYetiskinCocukBebek(int yetiskin, int cocuk, int bebek) {
        homePage.yolcuSayisiKabin.click();

        for (int i = 1; i < yetiskin; i++) {
            homePage.adult.click();
        }
        for (int i = 0; i < cocuk; i++) {
            homePage.child.click();
        }
        for (int i = 0; i < bebek; i++) {
            homePage.infant.click();
        }
        homePage.tamam.click();

    }

    @When("User chooses cabin class {string}")
    public void userChoosesCabinClass(String cabinClasses) {
        homePage.yolcuSayisiKabin.click();
        switch (cabinClasses) {
            case "Ekonomi":
                homePage.ekonomi.click();
                break;
            case "Business":
                homePage.business.click();
                break;
            case "Premium Ekonomi":
                homePage.premiumEkonomi.click();
                break;
            case "First Class":
                homePage.firstClass.click();
                break;
        }

        homePage.tamam.click();

    }

    @When("User clicks Ucuz bilet bul button")
    public void userClicksUcuzBiletBulButton() {
        homePage.ucuzBiletBulButton.click();

    }

    @Then("User verifies that flight list page is visible")
    public void userVerifiesThatFlightListPageIsVisible() {
        assertTrue(flightListPage.addFavorite.isDisplayed());

    }


}
