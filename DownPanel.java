package final_410477020;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * 下半部的JPanel
 * 
 * @author 蘇信嘉
 */
final class DownPanel extends JPanel {
	/**
	 * 三角函數物件
	 */
	static TrigonometricFunction obj;
	/**
	 * 繪圖工具
	 */
	Graphics g = getGraphics();
	/**
	 * 三角函數名稱
	 */
	String str;
	/**
	 * 箭頭設定值
	 */
	int number;

	/**
	 * 設定大小，給予屬性預設值
	 */
	DownPanel() {
		setPreferredSize(new Dimension(600, 600));
		str = "";
		number = 0;
		obj = null;
	}

	/**
	 * 繪圖方法
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (str != "") {
			/**
			 * 畫出上下panel的界線及右上角的文字
			 */
			g.setColor(Color.RED);
			g.drawLine(0, 0, 600, 0);
			g.setFont(new Font(Font.DIALOG, Font.PLAIN, 35));
			g.drawString(str + " 的圖形", 400, 50);
			/**
			 * 畫出X座標軸
			 */
			g.setColor(Color.BLUE);
			g.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
			g.drawLine(0, 250, 430, 250);
			g.drawString("0", 0, 260);
			g.drawString("90", 90, 260);
			g.drawString("180", 180, 260);
			g.drawString("270", 270, 260);
			g.drawString("360", 360, 260);
			g.drawString("deg", 405, 260);
			/**
			 * 畫出三角形
			 */
			int[] x = { 430, 430, 430 + number, };
			int[] y = { 250 - number, 250 + number, 250 };
			g.fillPolygon(x, y, 3);
			/**
			 * 畫出三角函數圖形及漸進線
			 */
			g.translate(0, 250);
			drawAllAbstractLine(g, str);
			double[] value = obj.getAllValue();
			g.setColor(Color.BLACK);
			drawTrigonometricFunction(g, value);
		}
	}

	/**
	 * 改變屬性
	 * 
	 * @param str
	 *            選擇的三角函數
	 * @param number
	 *            箭頭大小
	 */
	void setData(String str, int number) {
		this.str = str;
		this.number = number;
	}

	/**
	 * 畫出所有虛線，並產生對應三角函數物件
	 * 
	 * @param g
	 *            繪圖工具
	 * @param str
	 *            三角函數
	 */
	private static void drawAllAbstractLine(Graphics g, String str) {
		if (str.equals("sin")) {
			obj = new Sin();
			drawAbstractLine(g, 90, -60, 0);
			drawAbstractLine(g, 270, 0, 60);
		} else if (str.equals("cos")) {
			obj = new Cos();
			drawAbstractLine(g, 0, -60, 0);
			drawAbstractLine(g, 180, 0, 60);
			drawAbstractLine(g, 360, -60, 0);
		} else if (str.equals("tan")) {
			obj = new Tan();
			drawAbstractLine(g, 90, -250, 200);
			drawAbstractLine(g, 270, -250, 200);
		} else if (str.equals("csc")) {
			obj = new Csc();
			drawAbstractLine(g, 0, -250, 0);
			drawAbstractLine(g, 90, -60, 0);
			drawAbstractLine(g, 180, -250, 200);
			drawAbstractLine(g, 270, 0, 60);
			drawAbstractLine(g, 360, 0, 200);
		} else if (str.equals("sec")) {
			obj = new Sec();
			drawAbstractLine(g, 0, -60, 0);
			drawAbstractLine(g, 90, -250, 200);
			drawAbstractLine(g, 180, 0, 60);
			drawAbstractLine(g, 270, -250, 200);
			drawAbstractLine(g, 360, -60, 0);
		} else if (str.equals("cot")) {
			obj = new Cot();
			drawAbstractLine(g, 0, -250, 0);
			drawAbstractLine(g, 180, -250, 200);
			drawAbstractLine(g, 360, 0, 200);
		}
	}

	/**
	 * 畫出三角函數
	 * 
	 * @param g
	 *            繪圖工具
	 * @param value
	 *            各點函數值
	 */
	private static void drawTrigonometricFunction(Graphics g, double[] value) {
		for (int i = 0; i < 360; i++) {
			if (value[i] == 1000 || value[i + 1] == 1000) {
				continue;
			}
			g.drawLine(i, (int) (value[i] * -70), i + 1, (int) (value[i + 1] * -70));
		}
	}

	/**
	 * 畫出單一條鉛直虛線
	 * 
	 * @param g
	 *            繪圖工具
	 * @param x
	 *            X座標
	 * @param start
	 *            起始Y座標
	 * @param end
	 *            結束Y座標
	 */
	private static void drawAbstractLine(Graphics g, int x, int start, int end) {
		for (int i = start; i <= end; i += 10) {
			g.drawLine(x, i, x, i + 5);
		}
	}
}
