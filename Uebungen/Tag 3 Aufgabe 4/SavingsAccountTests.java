package ch.schule.bank.junit5;

import ch.schule.SavingsAccount;



/**
 * Tests f�r die Klasse SavingsAccount.
 *
 * @author Roger H. J&ouml;rg
 * @version 1.0
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests für die Klasse SavingsAccount.
 *
 * @author XXX
 * @version 1.0
 */
public class SavingsAccountTests
{
	@Test
	public void test_init()
	{
		SavingsAccount savingsAccount = new SavingsAccount("1");
		assertNotNull(savingsAccount);
	}

	@Test
	public void test_withdraw_smallAmount() {
		SavingsAccount savingsAccount = new SavingsAccount("1");
		savingsAccount.deposit(1, 10);

		savingsAccount.withdraw(1, 1);

		assertEquals(9, savingsAccount.getBalance());
	}

	@Test
	public void test_withdraw_bigAmount() {
		SavingsAccount savingsAccount = new SavingsAccount("1");
		savingsAccount.deposit(1, 10);

		savingsAccount.withdraw(1, 11);

		assertEquals(10, savingsAccount.getBalance());
	}
}

