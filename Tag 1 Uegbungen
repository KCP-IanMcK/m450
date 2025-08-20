# Tag 1 Übungen
## Aufgabe 1
JUnit-Tests, um Java Code zu testen.
Jasmine-Tests, um TypeScript zu testen.
Selenium-Tests, um die Funktionalität einer Website zu testen.

## Aufgabe 2
SW-Fehler: Eine Berechnung ergibt ein falschse Ergebnis.
SW-Mangel: Die Input-Felder für die Berechnung sind verschoben.
Schaden durch SW-Fehler: Ein Berechnungsfehler verursacht eine Geldüberweisung eines zu hohen Betrags.

## Aufgabe 3
```Java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void calculatePrice_NoDiscount() {
        double result = Main.calculatePrice(100, 0, 0, 0, 0);
        assertEquals(100, result);
    }

    @Test
    void calculatePrice_WithDiscount() {
        double result = Main.calculatePrice(100, 0, 0, 0, 10);
        assertEquals(90, result);
    }

    @Test
    void calculatePrice_With1Extra() {
        double result = Main.calculatePrice(100, 0, 10, 1, 0);
        assertEquals(110, result);
    }

    @Test
    void calculatePrice_With3Extra() {
        double result = Main.calculatePrice(100, 0, 10, 3, 0);
        assertEquals(127, result);
    }

    @Test
    void calculatePrice_With5Extra() {
        double result = Main.calculatePrice(100, 0, 10, 5, 0);
        assertEquals(142.5, result);
    }

    @Test
    void calculatePrice_WithSpecial() {
        double result = Main.calculatePrice(100, 10, 0, 0, 0);
        assertEquals(110, result);
    }

    @Test
    void calculatePrice_WithAll() {
        double result = Main.calculatePrice(100, 10, 10, 3, 10);
        assertEquals(127, result);
    }
}
```

## Augabe 3 Bonus
Wenn im If zuerst überprüft wird, ob extras >= 3, dann wird auch bei extras = 5 dieses Codestück ausgeführt. Um das zu beheben, muss man zuerst auf extras >= 5 überprüfen. Ausserdem muss am Ende bei der Preisberechnung noch die Anzahl der Extras berücksichtigt werden, da sonst immer nur für ein Extra gezahlt wird.
