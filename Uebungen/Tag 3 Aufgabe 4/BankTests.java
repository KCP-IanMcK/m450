package ch.schule.bank.junit5;

import ch.schule.Account;
import ch.schule.Bank;
import ch.schule.SalaryAccount;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests f�r die Klasse 'Bank'.
 *
 * @author xxxx
 * @version 1.0
 */
public class BankTests {
    /**
     * Tests to create new Accounts
     */
    @Test
    public void testCreate() {
        Bank bank = new Bank();
        assertNotNull(bank);
    }
    /**
     * Testet das Einzahlen auf ein Konto.
     */
    @Test
    public void testDeposit() {
        Bank bank = new Bank();
        String id = bank.createSalaryAccount(-100);

        bank.deposit(id, 1, 1);

        assertEquals(1, bank.getBalance(id));
    }
    /**
     * Testet das Abheben von einem Konto.
     */
    @Test
    public void testWithdraw() {
        Bank bank = new Bank();
        String id = bank.createSalaryAccount(-100);
        bank.deposit(id, 1, 100);

        bank.withdraw(id, 1, 10);

        assertEquals(90, bank.getBalance(id));
    }

    /**
     * Experimente mit print().
     */
    @Test
    public void testPrint() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Bank bank = new Bank();
        String id = bank.createSalaryAccount(-100);

        bank.print(id);

        System.setOut(originalOut);

        assertNotNull(outContent.toString());
    }

    /**
     * Experimente mit print(year, month).
     */
    @Test
    public void testMonthlyPrint() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Bank bank = new Bank();
        String id = bank.createSalaryAccount(-100);

        bank.print(id, 1, 1);

        System.setOut(originalOut);

        assertNotNull(outContent.toString());
    }

    /**
     * Testet den Gesamtkontostand der Bank.
     */
    @Test
    public void testBalance() {
        Bank bank = new Bank();
        String id = bank.createSalaryAccount(-100);
        bank.deposit(id, 1, 100);

        Long result = bank.getBalance(id);

        assertEquals(100, result);
    }

    /**
     * Tested die Ausgabe der "top 5" konten.
     */
    @Test
    public void testTop5() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Bank bank = new Bank();
        bank.createSalaryAccount(-100);

        bank.printTop5();

        System.setOut(originalOut);

        assertNotNull(outContent.toString());
    }

    /**
     * Tested die Ausgabe der "top 5" konten.
     */
    @Test
    public void testBottom5() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Bank bank = new Bank();
        bank.createSalaryAccount(-100);

        bank.printBottom5();

        System.setOut(originalOut);

        assertNotNull(outContent.toString());
    }

}
