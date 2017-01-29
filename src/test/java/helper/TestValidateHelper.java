package helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValidateHelper {

	@Test
	public void isEmpty_文字列_値あり() {
		String value = "a";
		assertFalse(ValidateHelper.isEmpty(value));
	}

	@Test
	public void isEmpty_文字列_空白文字() {
		String value = "";
		assertTrue(ValidateHelper.isEmpty(value));
	}

	@Test
	public void isEmpty_文字列_null() {
		String value = null;
		assertTrue(ValidateHelper.isEmpty(value));
	}

}
