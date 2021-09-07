package final_410477020;
/**
 * 繼承三角函數的Sec類別
 * @author 蘇信嘉
 */
final class Sec extends TrigonometricFunction {
	/**
	 * 使用sec函數計算
	 */
	@Override
	double getSingleValue(int x) {
		double value;
		if ((x - 90) % 180 == 0) {
			value = 1000;
		} else {
			value = 1 / Math.cos(Math.toRadians(x));
		}
		return value;
	}

}
