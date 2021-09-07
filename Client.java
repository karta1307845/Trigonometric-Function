package final_410477020;

import javax.swing.JFrame;

/**
 * 用來控制frame設定的類別
 * 
 * @author 蘇信嘉
 */
final public class Client {
	/**
	 * 程式進入點
	 * 
	 * @param args
	 *            無
	 */
	public static void main(String[] args) {
		Frame obj = new Frame();
		obj.setTitle("期末專案 : 三角函數繪圖");
		obj.setSize(600, 720);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setResizable(false);
		obj.setVisible(true);
	}
}
