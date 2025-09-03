package ch.schule.bank.junit5;

import ch.schule.SalaryAccount;
import ch.schule.SavingsAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests der Klasse SalaryAccount.
 *
 * @author XXX
 * @version 1.1
 */
public class SalaryAccountTests
{
	/**
	 * Der Test.
	 */
	@Test
	public void test_init()
	{
		SalaryAccount salaryAccount = new SalaryAccount("1", -100);
		assertNotNull(salaryAccount);
	}
	@Test
	public void test_deposit() {
		SalaryAccount salaryAccount = new SalaryAccount("1", -100);

		salaryAccount.deposit(1, 1);

		assertEquals(1, salaryAccount.getBalance());
	}

	@Test
	public void test_withdraw_smallAmount() {
		SalaryAccount salaryAccount = new SalaryAccount("1", -100);
		salaryAccount.deposit(1, 10);

		salaryAccount.withdraw(1, 1);

		assertEquals(9, salaryAccount.getBalance());
	}

	@Test
	public void test_withdraw_bigAmount() {
		SalaryAccount salaryAccount = new SalaryAccount("1", -100);
		salaryAccount.deposit(1, 10);

		salaryAccount.withdraw(1, 11);

		assertEquals(-1, salaryAccount.getBalance());
	}

	@Test
	public void test_withdraw_overLimit() {
		SalaryAccount salaryAccount = new SalaryAccount("1", -100);
		salaryAccount.deposit(1, 10);

		salaryAccount.withdraw(1, 111);

		assertEquals(10, salaryAccount.getBalance());
	}
}
