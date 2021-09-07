package final_410477020;
/**
 * 繼承三角函數的Csc類別
 * @author 蘇信嘉
 */
final class Csc extends TrigonometricFunction {
	/**
	 * 使用csc函數計算
	 */
	@Override
	double getSingleValue(int x) {
		double value;
		if (x % 180 == 0) {
			value = 1000;
		} else {
			value = 1 / Math.sin(Math.toRadians(x));
		}
		return value;
	}

}
