package preprod.thrundz.fr;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import preprod.thrundz.fr.Models.Ticket;
import preprod.thrundz.fr.POM.gestionticketsPage;

public class GestionTest {
    WebDriver driver;// definir une variable globale
    gestionticketsPage gp;
    ArrayList<Ticket> tickets;
    Faker faker;

    // visiter le site et se connecter
    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();

        gp = new gestionticketsPage(driver);
        driver.get("https://preprod.thrundrz.fr/admin/login");
        gp.loginPar("admin@thrundrz.fr", "Admin1234");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(gp.getAffichage()));
        System.out.println("=====================>");
        faker = new Faker();

        // preparer les jdd
        tickets = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String tit=faker.internet().slug();
            tickets.add(new Ticket(tit));
            System.out.println("====================>"+tit);
            System.out.println("=====================> arraylist add  ticket titre");

        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {// designe que le navigateur est ouvert
            driver.quit();// pour fermer le navigateur auromatiquement
            driver = null;// comme le navigateur rest fermer le driver est null
        }
    }

    @Test
    @Tag("e2e")
    public void GestionTicket() {
        System.out.println("=====================>"+"debut test");

        for (Ticket ticket : tickets) {
            gp.setNvTitre(ticket.getTitreTicket(),driver);
            gp.setBtnAdd();
        }
        System.out.println("=====================>"+"fin de test");


    }

}
