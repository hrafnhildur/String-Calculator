package is.ru.stringcalculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, calculator.add(" "));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, calculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {
		assertEquals(3, calculator.add("1,2"));
	}

	@Test
	public void testMultiNumbers() {
		assertEquals(45, calculator.add("1,2,3,4,5,6,7,8,9"));
	}

	@Test
	public void testNewLineSplitter() {
		assertEquals(6, calculator.add("1\n2\n3"));
	}

	@Test
	public void testMultiSplitter() {
		assertEquals(6, calculator.add("1\n2,3"));
	}
}