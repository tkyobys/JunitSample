package helper;

/**
 * 計算を行うヘルパークラス
 */
public class CalculateHelper {

	/** コンストラクタ */
	private CalculateHelper() {
	}

	/**
	 * 2つの引数の和を返却する。
	 * @param addend1 足される数
	 * @param addend2 足す数
	 * @return 和
	 */
	public static int add(int addend1, int addend2) {
		if(addend1 < 0 || addend2 < 0) {
			throw new IllegalArgumentException("引数が不正です。(addend1=" + addend1 + ":addend2=" + addend2 + ")");
		}
		return addend1 + addend2;
	}

}
