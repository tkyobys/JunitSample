package helper;

/**
 * 値を検証するヘルパークラス
 */
public class ValidateHelper {

	/** コンストラクタ */
	private ValidateHelper() {
	}

	/**
	 * 引数で与えられた文字列に値があるか検査します。
	 * @param value 文字列
	 * @return {@code true}:null もしくは空白文字 {@code false}:それ以外
	 */
	public static boolean isEmpty(String value) {
		return value == null || value.isEmpty();
	}

}
