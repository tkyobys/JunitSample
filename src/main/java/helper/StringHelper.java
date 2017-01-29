package helper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 文字列を取り扱うヘルパークラス
 */
public class StringHelper {

	/** 空白文字 */
	public static final String EMPTY = "";

	/** コンストラクタ */
	private StringHelper() {
	}

	/**
	 * 引数で与えられた文字列の配列の値をカンマ区切りの文字列に変換して返却する。<br>
	 * 値にnullを含む場合は空白文字列として取り扱う。
	 * @param strArray 文字列の配列
	 * @return カンマ区切りの文字列
	 */
	public static String joinComma(String[] strArray) {
		List<String> strList = Arrays.asList(strArray);
		return strList.stream()
				.map(str -> convertEmptyIfNull(str))
				.collect(Collectors.joining(", "));
	}

	/**
	 * 引数で与えられた文字列がnullの場合は空白文字列に変換して返却する。
	 * @param value 文字列
	 * @return 変換した文字列
	 */
	public static String convertEmptyIfNull(String value) {
		return value == null ? EMPTY : value;
	}

}
