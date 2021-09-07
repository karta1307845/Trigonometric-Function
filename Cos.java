package final_410477020;

/**
 * 繼承三角函數的Cos類別
 * 
 * @author 蘇信嘉
 */
final class Cos extends TrigonometricFunction {
	/**
	 * 使用cos函數計算
	 */
	@Override
	double getSingleValue(int x) {
		double value;
		value = Math.cos(Math.toRadians(x));
		return value;
	}

}
