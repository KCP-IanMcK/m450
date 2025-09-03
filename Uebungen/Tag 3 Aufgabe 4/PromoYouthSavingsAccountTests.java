package ch.schule.bank.junit5;

import ch.schule.PromoYouthSavingsAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests für das Promo-Jugend-Sparkonto.
 *
 * @author XXXX
 * @version 1.0
 */
public class PromoYouthSavingsAccountTests
{
	/**
	 * Der Test.
	 */
	@Test
	public void test_init()
	{
		PromoYouthSavingsAccount promoYouthSavingsAccount = new PromoYouthSavingsAccount("1");
		assertNotNull(promoYouthSavingsAccount);
	}

	@Test
	public void test_deposit() {
		PromoYouthSavingsAccount promoYouthSavingsAccount = new PromoYouthSavingsAccount("1");

		promoYouthSavingsAccount.deposit(1, 100);

		assertEquals(101, promoYouthSavingsAccount.getBalance());
	}
}
