import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	RomanNumerals rom = new RomanNumerals ();

	@Test
	public void test_I_is_1() {
		int number = rom.convertToIntegerStupid("I");
		
		
		assertEquals (1, number);
	}
	public void test_II_is_2() {
		int number = rom.convertToIntegerStupid("II");
		
		
		assertEquals (2, number);
	}

	public void test_I_is_1b() {
		int number = rom.convertToInteger("I");
		
		
		assertEquals (1, number);
	}
}
