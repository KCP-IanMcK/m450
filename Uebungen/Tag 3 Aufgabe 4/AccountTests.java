package ch.schule.bank.junit5;

import ch.schule.Account;
import ch.schule.Booking;
import ch.schule.SalaryAccount;
import ch.schule.SavingsAccount;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests für die Klasse Account.
 *
 * @author xxxx
 * @version 1.0
 */
public class AccountTests {
    /**
     * Tested die Initialisierung eines Kontos.
     */
    @Test
    public void testInit() {
        SalaryAccount salaryAccount = new SalaryAccount("1", -1);
        assertNotNull(salaryAccount);
    }

    /**
     * Testet das Einzahlen auf ein Konto.
     */
    @Test
    public void testDeposit() {
        SalaryAccount salaryAccount = new SalaryAccount("1", -100);
        int deposit = 10;
        salaryAccount.deposit(1, deposit);
        assertEquals(deposit, salaryAccount.getBalance());
    }

    /**
     * Testet das Abheben von einem Konto.
     */
    @Test
    public void testWithdraw() {
        SalaryAccount salaryAccount = new SalaryAccount("1", -100);
        int deposit = 10;
        int withdraw = 5;
        int leftOver = deposit - withdraw;
        salaryAccount.deposit(1, deposit);

        salaryAccount.withdraw(1, withdraw);

        assertEquals(leftOver, salaryAccount.getBalance());
    }

    /**
     * Tests the reference from SavingsAccount
     */
    @Test
    public void testReferences() {
        SalaryAccount salaryAccount = new SalaryAccount("1", -100);
        Booking booking = new Booking(1, 10);
        salaryAccount.setBooking(booking);

        Booking result = salaryAccount.getBooking();

        assertEquals(booking, result);
    }

    /**
     * teste the canTransact Flag
     */
    @Test
    public void testCanTransact() {
        SalaryAccount salaryAccount = new SalaryAccount("1", -100);
        salaryAccount.deposit(1, 10);

        boolean result = salaryAccount.canTransact(1);

        assertTrue(result);

        boolean result2 = salaryAccount.canTransact(0);

        assertFalse(result2);
    }

    /**
     * Experimente mit print().
     */
    @Test
    public void testPrint() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SalaryAccount salaryAccount = new SalaryAccount("1", -100);
        salaryAccount.print();

        System.setOut(originalOut);

        assertNotNull(outContent.toString());
    }

    /**
     * Experimente mit print(year,month).
     */
    @Test
    public void testMonthlyPrint() {
        PrintStream originalOut = System.out;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SalaryAccount salaryAccount = new SalaryAccount("1", -100);
        salaryAccount.print(1, 1);

        System.setOut(originalOut);

        assertNotNull(outContent.toString());
    }

}
