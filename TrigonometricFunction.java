package final_410477020;
/**
 * 抽象三角函數類別
 * @author 蘇信嘉
 */
abstract class TrigonometricFunction {
	/**
	 * 計算0-360函數值
	 * @return 0-360函數值
	 */
	double[] getAllValue() {
		double[] value = new double[361];
		for (int i = 0; i < 361; i++) {
			value[i] = getSingleValue(i);
		}
		return value;
	}
	/**
	 * 計算單一點函數值
	 * @param x X座標
	 * @return 對應函數值
	 */
	abstract double getSingleValue(int x);
}
