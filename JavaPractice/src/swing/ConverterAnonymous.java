package swing;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

// here an anonymous class is used to act as the Action Listener

public class ConverterAnonymous extends JFrame {
	
	JTextField dollarField;
	JTextField rupeeField;
	public static final String RUPEE  = "\u20BA";
	
	public ConverterAnonymous() {
		dollarField = new JTextField(8);
		rupeeField = new JTextField(8);
		
		JLabel dollarLabel = new JLabel("Dollars ($)");
		JLabel rupeeLabel = new JLabel("Rupees ("+RUPEE+")");
		
		JButton convertBtn = new JButton("Convert");
		convertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double dollars = Double.valueOf(dollarField.getText());
				rupeeField.setText(Double.toString(dollars * 63.84));
			}
		});
		
		add(dollarLabel);
		add(dollarField);
		add(rupeeLabel);
		add(rupeeField);
		add(convertBtn);
	}

	public static void main(String[] args) {
		JFrame frame = new ConverterAnonymous();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setVisible(true);		
	}
}

