import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoProjectA_Test {

	@Test
	public void additionTest() {
		assertEquals(100, DemoProjectA.addition(50, 50), .00001);
		assertEquals(3, DemoProjectA.addition(1, 2), .00001);
		assertEquals(5, DemoProjectA.addition(4, 1), .00001);
		assertEquals(425, DemoProjectA.addition(214, 211), .00001);
		assertEquals(1.5, DemoProjectA.addition(1, 0.5), .00001);
	}

	@Test
	public void subtractionTest() {
		assertEquals(5, DemoProjectA.subtraction(10, 5), .00001);
		assertEquals(3, DemoProjectA.subtraction(5, 2), .00001);
		assertEquals(0, DemoProjectA.subtraction(2, 2), .00001);
		assertEquals(-5, DemoProjectA.subtraction(5, 10), .00001);
	}

	@Test
	public void multiplicationTest() {
		assertEquals(10, DemoProjectA.multiplication(2, 5), .00001);
		assertEquals(50, DemoProjectA.multiplication(25, 2), .00001);
		assertEquals(30, DemoProjectA.multiplication(15, 2), .00001);
		assertEquals(24, DemoProjectA.multiplication(16, 1.5), .00001);
	}

	@Test
	public void divisionTest() {
		assertEquals(10, DemoProjectA.division(50, 5), .00001);
		assertEquals(6, DemoProjectA.division(12, 2), .00001);
		assertEquals(1.5, DemoProjectA.division(24, 16), .00001);
		assertEquals(Double.NaN, DemoProjectA.division(10, 0), .00001);
	}

	@Test
	public void exponentTest() {
		assertEquals(4, DemoProjectA.exponent(2.0, 2), .00001);
		assertEquals(8, DemoProjectA.exponent(2.0, 3), .00001);
		assertEquals(1, DemoProjectA.exponent(124.0, 0.0), .00001);
		assertEquals(12, DemoProjectA.exponent(144, 0.5), .00001);
	}

}
