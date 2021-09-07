package final_410477020;

/**
 * 繼承三角函數的Sin類別
 * 
 * @author 蘇信嘉
 */
final class Sin extends TrigonometricFunction {
	/**
	 * 使用sin函數計算
	 */
	@Override
	double getSingleValue(int x) {
		double value;
		value = Math.sin(Math.toRadians(x));
		return value;
	}

}
