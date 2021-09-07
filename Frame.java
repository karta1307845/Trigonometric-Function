package final_410477020;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 繼承JFrame類別
 * 
 * @author 蘇信嘉
 */
final class Frame extends JFrame {
	private UpPanel up = new UpPanel();
	private DownPanel down = new DownPanel();

	/**
	 * 將2個panel加到frame裡面
	 */
	Frame() {
		add(up, BorderLayout.NORTH);
		add(down);
		/**
		 * "繪圖"按鈕的事件處理
		 */
		up.btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int number = Integer.parseInt(up.field.getText());
					int isError = 0;
					if (number > 100 || number < 0) {
						isError = 1;
					}
					if (isError == 0) {
						if (up.group.sin.isSelected() == true) {
							down.setData("sin", number);
							down.repaint();
						} else if (up.group.cos.isSelected() == true) {
							down.setData("cos", number);
							down.repaint();
						} else if (up.group.tan.isSelected() == true) {
							down.setData("tan", number);
							down.repaint();
						} else if (up.group.csc.isSelected() == true) {
							down.setData("csc", number);
							down.repaint();
						} else if (up.group.sec.isSelected() == true) {
							down.setData("sec", number);
							down.repaint();
						} else if (up.group.cot.isSelected() == true) {
							down.setData("cot", number);
							down.repaint();
						}
					} else {
						JOptionPane.showMessageDialog(null, "請輸入0~100的整數");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "請輸入0~100的整數");
				}
			}
		});
		/**
		 * "清除"按鈕的事件處理
		 */
		up.btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				down.setData("", 0);
				down.repaint();
			}

		});
	}
}
