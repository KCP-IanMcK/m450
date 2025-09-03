# Aufgabe 1
```java
package org.example;

import org.junit.jupiter.api.Test;

import java.util.zip.DataFormatException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main = new Main();

    @Test
    void add_naturalNumbers_shouldAdd() {
        //Arrange
        double number1 = 1;
        double number2 = 2;
        double expectedResult = number1 + number2;

        //Act
        double result = main.add(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void add_doubles_shouldAdd() {
        //Arrange
        double number1 = 1.2;
        double number2 = 2.5;
        double expectedResult = number1 + number2;

        //Act
        double result = main.add(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void add_ints_shouldAdd() {
        //Arrange
        int number1 = 1;
        int number2 = 2;
        double expectedResult = number1 + number2;

        //Act
        double result = main.add(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void subtract_positiveNumbers_shouldSubtract() {
        //Arrange
        double number1 = 1;
        double number2 = 2;
        double expectedResult = number1 - number2;

        //Act
        double result = main.subtract(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void subtract_negativeNumbers_shouldSubtract() {
        //Arrange
        double number1 = 1.5;
        double number2 = -2.2;
        double expectedResult = number1 - number2;

        //Act
        double result = main.subtract(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void multiply_positiveNumbers_shouldMultiply() {
        //Arrange
        double number1 = 1;
        double number2 = 2;
        double expectedResult = number1 * number2;

        //Act
        double result = main.multiply(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void multiply_negativeNumbers_shouldMultiply() {
        //Arrange
        double number1 = 1.5;
        double number2 = -2.2;
        double expectedResult = number1 * number2;

        //Act
        double result = main.multiply(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void divide_positiveNumbers_shouldDivide() {
        //Arrange
        double number1 = 1;
        double number2 = 2;
        double expectedResult = number1 / number2;

        //Act
        double result = main.divide(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void divide_negativeNumbers_shouldDivide() {
        //Arrange
        double number1 = 1.5;
        double number2 = -2.2;
        double expectedResult = number1 / number2;

        //Act
        double result = main.divide(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void divide_byZero_shouldReturnInfinity() {
        //Arrange
        double number1 = 1;
        double number2 = 0;
        double expectedResult = number1 / number2;

        //Act
        double result = main.divide(number1, number2);

        //Assert
        assertEquals(expectedResult, result);
        assertThrows(Exception.class, () -> {throw new Exception("");});
    }
}
```
# Aufgabe 3
Klassen: 
    - Bank
    - Account
    - Booking
    - SavingsAccount
    - SalaryAccount
    - BankUtils
    - PromoYouthSavingAccount
Die Bank hat mehrere Accounts, welche verschiedene Konten (Savings | PromoYouthSavings, Salary) haben. Der Account hat auch verschiedene Buchungen.

# Aufgabe 4
