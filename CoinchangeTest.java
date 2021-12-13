package coinchange;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CoinchangeTest {
	
	@Test
	public void testMinCoin() {
		assertEquals(1, Coinchange.minCoin(1, new int[] { 1, 5, 7 }, new int[2]));
		assertEquals(4, Coinchange.mincoin(4, new int[] { 7, 5, 1 }, new int[5]));
		assertEquals(1, Coinchange.mincoin(5, new int[] { 7, 5, 1 }, new int[6]));
		assertEquals(2, Coinchange.mincoin(6, new int[] { 1, 7, 5 }, new int[7]));
		assertEquals(3, Coinchange.mincoin(11, new int[] { 1, 7, 5 }, new int[12]));
		assertEquals(4, Coinchange.mincoin(18, new int[] { 1, 7, 5 }, new int[19]));
	}
	
	

}
