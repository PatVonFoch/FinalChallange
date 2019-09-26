package ZadanieFinalne;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BookingFlightsPHPStepsDefinition {
    WebDriver driver;
   // WebDriverWait wait = new WebDriverWait(driver,10);


    @Given("an open PHP Travels page")
    public void anOpenPHPTravelsPage() {
        System.setProperty("webdriver.gecko.driver",
                    "src/test/resources/geckodriver");
        driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/demo/");
    }


    @When("^main page opened user clicks flights menu$")
    public void mainPageOpenedUserClicksFlightsMenu() {
        driver.findElement(By.cssSelector(".nav-tabs > li:nth-child(2) > a:nth-child(1)")).click();
    }

    @And("^clicks ROUND TRIP,$")
    public void clicksROUNDTRIP() {
       //List <WebElement> tripTypeRadio = driver.findElement(By.name("triptype"));
        //tripTypeRadio.get(1).click();

    }


    @And("^user enters location from \"([^\"]*)\", location to \"([^\"]*)\",$")
   public void userEntersLocationFromLocationTo(String arg0, String arg1) throws Throwable {
        driver.switchTo().frame(0);
        WebElement PoleMiejscaWylotu = driver.findElement(By.xpath("/html/body/div[5]/section/div[2]/div/div/div[2]/div[1]/div[1]/form/div[1]/div/div/div[2]/div/div/input"));
        PoleMiejscaWylotu.click();
        PoleMiejscaWylotu.sendKeys(arg0);


        WebElement PoleMiejscaPrzylotu = driver.findElement(By.cssSelector(""));
        PoleMiejscaPrzylotu.click();
        WebElement MiejscePrzylotu = driver.findElement(By.xpath("/html/body/div[19]/div/input"));
        MiejscePrzylotu.clear();
        MiejscePrzylotu.sendKeys(arg1);
    }



    @And("^departure date \"([^\"]*)\" and Return date \"([^\"]*)\"$")
    public void departureDateAndReturnDate(String arg0, String arg1) throws Throwable {
        driver.switchTo().frame(0);
        WebElement PoleDatyWylotu = driver.findElement(By.cssSelector("a[title='Flights']"));
        PoleDatyWylotu.click();

        //WebElement DataWylotu = wait.until(ExpectedConditions.elementToBeClickable((By.id("departure"))));
        //DataWylotu.clear();
        //DataWylotu.sendKeys(arg0);

    }


    @And("^user chooses number of passengers \"([^\"]*)\" , and clicks done$")
    public void userChoosesNumberOfPassengersAndClicksDone(String arg0) throws Throwable {

    }

    @And("^begin search$")
    public void beginSearch() {
        driver.findElement(By.cssSelector("div.bgfade:nth-child(6) > button:nth-child(2)"));
    }

    @Then("^User chooses second option of flights$")
    public void userChoosesSecondOptionOfFlights() {
    }

    @And("^decides to book as a guest$")
    public void decidesToBookAsAGuest() {
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/a"));
    }

    @And("^user chooses title, fills out name \"([^\"]*)\" and surname \"([^\"]*)\"$")
    public void userChoosesTitleFillsOutNameAndSurname(String arg0, String arg1) throws Throwable {


        WebElement NameInput = driver.findElement(By.id("name"));
        NameInput.clear();
        NameInput.sendKeys(arg0);

        WebElement SurameInput = driver.findElement(By.id("surname"));
        SurameInput.clear();
        SurameInput.sendKeys(arg0);


    }

    @And("^user fills out e-mail \"([^\"]*)\"\\. phone number \"([^\"]*)\"\\. DOB \"([^\"]*)\"$")
    public void userFillsOutEMailPhoneNumberDOB(String arg0, String arg1, String arg2) throws Throwable {
        WebElement EmailInput = driver.findElement(By.id("email"));
        EmailInput.clear();
        EmailInput.sendKeys(arg0);

        WebElement PhoneInput = driver.findElement(By.id("phone"));
        PhoneInput.clear();
        PhoneInput.sendKeys(arg1);

        WebElement BirthdayInput = driver.findElement(By.id("birthday"));
        BirthdayInput.clear();
        BirthdayInput.sendKeys(arg2);

    }

    @And("^user provides ID Number \"([^\"]*)\", Expiry Date \"([^\"]*)\" and nationality \"([^\"]*)\"$")
    public void userProvidesIDNumberExpiryDateAndNationality(String arg0, String arg1) throws Throwable {
        WebElement IDnput = driver.findElement(By.id("cardno"));
        IDnput.clear();
        IDnput.sendKeys(arg0);

        WebElement EXPInput = driver.findElement(By.id("expiration"));
        EXPInput.clear();
        EXPInput.sendKeys(arg1);

        WebElement NationalityInput = driver.findElement(By.id(""));


    }


    @And("^User fills out Payment information by providing CC type and its number \"([^\"]*)\"$")
    public void userFillsOutPaymentInformationByProvidingCCTypeAndItsNumber(String arg0) throws Throwable {

        WebElement CCnumber = driver.findElement(By.id("card-number"));
        CCnumber.clear();
        CCnumber.sendKeys(arg0);



    }

    @And("^User fills expiry month \"([^\"]*)\", expiry year\"([^\"]*)\",  and CVV \"([^\"]*)\"$")
    public void userFillsExpiryMonthExpiryYearAndCVV(String arg0) throws Throwable {

        WebElement CVVnumber = driver.findElement(By.id("cvv"));
        CVVnumber.clear();
        CVVnumber.sendKeys(arg0);

    }



}

