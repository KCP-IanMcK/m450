package ch.schule.bank.junit5;

import ch.schule.Bank;
import ch.schule.Booking;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Tests für die Klasse Booking.
 *
 * @author Luigi Cavuoti
 * @version 1.1
 */
public class BookingTests
{
	/**
	 * Tests f�r die Erzeugung von Buchungen.
	 */
	@Test
	public void testInitialization()
	{
		Booking booking = new Booking(1, 1);
		assertNotNull(booking);
	}

	/**
	 * Experimente mit print().
	 */
	@Test
	public void testPrint()
	{
		PrintStream originalOut = System.out;

		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));

		Booking booking = new Booking(1, 1);

		booking.print(1);

		System.setOut(originalOut);

		assertNotNull(outContent.toString());
	}
}
