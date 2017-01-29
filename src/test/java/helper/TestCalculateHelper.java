package helper;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCalculateHelper {

	@BeforeClass
	public static void setUpClass() {
		// Do once before first test.
	}

	@Before
	public void setUp() {
		// Do before each test.
	}

	@After
	public void tearDown() {
		// Do after each test.
	}

	@AfterClass
	public static void tearDownClass() {
		// Do once after last test.
	}

	@Test
	public void add_通常() {
		int expected = 3;
		int actual = CalculateHelper.add(1, 2);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void add_足す数_マイナス値() {
		int expected = 99;
		int actual = CalculateHelper.add(-1, 100);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void add_足される数_マイナス値() {
		int expected = 99;
		int actual = CalculateHelper.add(100, -1);
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void add_両方_マイナス値() {
		int expected = -2;
		int actual = CalculateHelper.add(-1, -1);
		assertThat(actual, is(expected));
	}

	@Ignore
	public void ignoreTest() {
		fail("うっかり実行してしまいました。");
	}

}
