package helper;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestValidateHelper {

	@Test
	public void isEmpty_文字列_値あり() {
		String value = "a";
		boolean expected = false;
		boolean actual = ValidateHelper.isEmpty(value);
		assertThat(actual, is(expected));
	}

	@Test
	public void isEmpty_文字列_空白文字() {
		String value = "";
		boolean expected = true;
		boolean actual = ValidateHelper.isEmpty(value);
		assertThat(actual, is(expected));
	}

	@Test
	public void isEmpty_文字列_null() {
		String value = null;
		boolean expected = true;
		boolean actual = ValidateHelper.isEmpty(value);
		assertThat(actual, is(expected));
	}

}
