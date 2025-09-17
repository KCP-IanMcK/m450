package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EndToEndTest {

    private WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.of(15, ChronoUnit.SECONDS));
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    @Order(1)
    void testHomePageTitle() {
        driver.get("http://localhost:4200");

        String title = driver.getTitle();
        assertEquals("TBZ Students", title);
    }

    @Test
    @Order(2)
    void testListStudents() {
        driver.get("http://localhost:4200");
        WebElement listStudentsButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("listStudents"))
        );

        listStudentsButton.click();

        WebElement studentList = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("studentList"))
        );
        assertTrue(studentList.isDisplayed());
    }

    @Test
    @Order(3)
    void testAddStudent() {
        driver.get("http://localhost:4200");

        WebElement addStudentButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("addStudent"))
        );

        addStudentButton.click();

        WebElement nameInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("name"))
        );

        nameInput.sendKeys("Test");

        WebElement emailInput = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("email"))
        );

        emailInput.sendKeys("test@tbz.ch");

        WebElement submitButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("submit"))
        );

        submitButton.click();

        WebElement studentList = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("studentList"))
        );

        assertTrue(studentList.isDisplayed());
    }
}
