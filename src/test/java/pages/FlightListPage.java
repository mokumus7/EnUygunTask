package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightListPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid=\"favorite-search-add-button\"]")
    public WebElement addFavorite;

}
