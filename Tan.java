package final_410477020;
/**
 * 繼承三角函數的Tan類別
 * @author 蘇信嘉
 */
final class Tan extends TrigonometricFunction {
	/**
	 * 使用tan函數計算
	 */
	@Override
	double getSingleValue(int x) {
		double value;
		if ((x - 90) % 180 == 0) {
			value = 1000;
		} else {
			value = Math.tan(Math.toRadians(x));
		}
		return value;
	}

}
