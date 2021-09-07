package final_410477020;
/**
 * 繼承三角函數的Cot類別
 * @author 蘇信嘉
 */
final class Cot extends TrigonometricFunction {
	/**
	 * 使用cot函數計算
	 */
	@Override
	double getSingleValue(int x) {
		double value;
		if (x % 180 == 0) {
			value = 1000;
		} else {
			value = 1 / Math.tan(Math.toRadians(x));
		}
		return value;
	}

}
