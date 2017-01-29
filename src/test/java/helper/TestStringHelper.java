package helper;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringHelper {

	@Test
	public void joinCommna_通常() {
		String[] strArray = new String[]{"a", "b", "c"};
		String expected = "a, b, c";
		String actual = StringHelper.joinComma(strArray);
		assertThat(actual, is(expected));
	}

	@Test
	public void joinCommna_nullあり() {
		String[] strArray = new String[]{"a", null, "c"};
		String expected = "a, , c";
		String actual = StringHelper.joinComma(strArray);
		assertThat(actual, is(expected));
	}

	@Test
	public void joinCommna_空白文字あり() {
		String[] strArray = new String[]{"a", StringHelper.EMPTY, "c"};
		String expected = "a, , c";
		String actual = StringHelper.joinComma(strArray);
		assertThat(actual, is(expected));
	}

	@Test
	public void joinCommna_要素ゼロ() {
		String[] strArray = new String[]{};
		String expected = StringHelper.EMPTY;
		String actual = StringHelper.joinComma(strArray);
		assertThat(actual, is(expected));

	}

	@Test
	public void convertEmptyIfNull_値あり() {
		String value = "a";
		String expected = "a";
		String actual = StringHelper.convertEmptyIfNull(value);
		assertThat(actual, is(expected));
	}

	@Test
	public void convertEmptyIfNull_空白文字() {
		String value = StringHelper.EMPTY;
		String expected = StringHelper.EMPTY;
		String actual = StringHelper.convertEmptyIfNull(value);
		assertThat(actual, is(expected));
	}

	@Test
	public void convertEmptyIfNull_null() {
		String value = null;
		String expected = StringHelper.EMPTY;
		String actual = StringHelper.convertEmptyIfNull(value);
		assertThat(actual, is(expected));
	}
}
