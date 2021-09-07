package final_410477020;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 上半部的JPanel
 * 
 * @author 蘇信嘉
 */
final class UpPanel extends JPanel {
	private JPanel pan1 = new JPanel(new GridLayout(8, 1));
	private JPanel pan2 = new JPanel(new GridLayout(2, 1));
	private JPanel pan3 = new JPanel();
	RadioButtons group = new RadioButtons();
	JButton btn1 = new JButton("繪圖");
	JButton btn2 = new JButton("清除");
	JLabel label = new JLabel("箭頭(0<=100)");
	JTextField field = new JTextField("5");

	/**
	 * 設定panel大小，加入元件
	 */
	UpPanel() {
		setPreferredSize(new Dimension(600, 250));
		pan1.add(group.sin);
		pan1.add(group.cos);
		pan1.add(group.tan);
		pan1.add(group.csc);
		pan1.add(group.sec);
		pan1.add(group.cot);
		pan1.add(btn1);
		pan1.add(btn2);
		pan2.add(label);
		pan2.add(field);
		add(pan1);
		add(pan2);
		pan3.setPreferredSize(new Dimension(370, 250));
		add(pan3);
	}
}
