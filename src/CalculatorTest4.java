import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void  testAddNumberPositive() {
		Calculator c1 = new Calculator();
		assertEquals(14,c1.addNumber(5,9));
		assertEquals(57,c1.addNumber(5,52));
	}
	@Test
	public void  testAddNumberNagative() {
		Calculator c1 = new Calculator();
		assertEquals(-4,c1.addNumber(5,-9));
		assertEquals(-107,c1.addNumber(-55,-52));
   }

}
