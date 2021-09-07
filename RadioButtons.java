package final_410477020;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 * 繼承ButtonGroup類別
 * 
 * @author 蘇信嘉
 */
final class RadioButtons extends ButtonGroup {
	JRadioButton sin = new JRadioButton("sin");
	JRadioButton cos = new JRadioButton("cos");
	JRadioButton tan = new JRadioButton("tan");
	JRadioButton csc = new JRadioButton("csc");
	JRadioButton sec = new JRadioButton("sec");
	JRadioButton cot = new JRadioButton("cot");

	/**
	 * 將6個JRadioButton加到ButtonGroup，預設為sin
	 */
	RadioButtons() {
		sin.setSelected(true);
		add(sin);
		add(cos);
		add(tan);
		add(csc);
		add(sec);
		add(cot);
	}
}
