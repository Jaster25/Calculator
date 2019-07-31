import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private String func = "ADD";
	private int firstNumber;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel answer = new JLabel("0");
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setFont(new Font("±¼¸²", Font.BOLD, 50));
		answer.setBounds(12, 10, 356, 112);
		frame.getContentPane().add(answer);

		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn0.setBounds(104, 479, 80, 80);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn1.setBounds(12, 390, 80, 80);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn2.setBounds(104, 389, 80, 80);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn3.setBounds(196, 389, 80, 80);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn4.setBounds(12, 300, 80, 80);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn5.setBounds(104, 299, 80, 80);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn6.setBounds(196, 299, 80, 80);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn7.setBounds(12, 209, 80, 80);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn8.setBounds(104, 209, 80, 80);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btn9.setBounds(196, 209, 80, 80);
		frame.getContentPane().add(btn9);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnDot.setBounds(12, 480, 80, 80);
		frame.getContentPane().add(btnDot);

		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(func) {
					case "ADD": {
						int currValue = Integer.parseInt(answer.getText());
						answer.setText((firstNumber + currValue) + ""); 
						break;
					}
					
					case "SUB": {
						int currValue = Integer.parseInt(answer.getText());
						answer.setText((firstNumber - currValue) + "");
						break;
					}
					
					case "MUL": {
						int currValue = Integer.parseInt(answer.getText());
						
						answer.setText((firstNumber * currValue) + "");
						break;
					}
					
					case "DIV": {
						int currValue = Integer.parseInt(answer.getText());
						answer.setText((firstNumber / currValue) + "");
						break;
					}
				}
			}
		});
		btnEnter.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnEnter.setBounds(196, 479, 80, 80);
		frame.getContentPane().add(btnEnter);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "ADD";
			}
		});
		btnPlus.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnPlus.setBounds(288, 209, 80, 80);
		frame.getContentPane().add(btnPlus);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "SUB";
			}
		});
		btnSub.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnSub.setBounds(288, 299, 80, 80);
		frame.getContentPane().add(btnSub);

		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "MUL";
			}
		});
		btnMul.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnMul.setBounds(288, 389, 80, 80);
		frame.getContentPane().add(btnMul);

		JButton btnDiv = new JButton("%");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "DIV";
			}
		});
		btnDiv.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnDiv.setBounds(288, 479, 80, 80);
		frame.getContentPane().add(btnDiv);

		btn0.addActionListener(new NumberActionListener(answer, "0"));		
		btn1.addActionListener(new NumberActionListener(answer, "1"));
		btn2.addActionListener(new NumberActionListener(answer, "2"));
		btn3.addActionListener(new NumberActionListener(answer, "3"));
		btn4.addActionListener(new NumberActionListener(answer, "4"));
		btn5.addActionListener(new NumberActionListener(answer, "5"));
		btn6.addActionListener(new NumberActionListener(answer, "6"));
		btn7.addActionListener(new NumberActionListener(answer, "7"));
		btn8.addActionListener(new NumberActionListener(answer, "8"));
		btn9.addActionListener(new NumberActionListener(answer, "9"));
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(0 + ""); 
				firstNumber = 0;
			}
		});
		btnClear.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnClear.setBounds(288, 119, 80, 80);
		frame.getContentPane().add(btnClear);
		
		JButton btnDel = new JButton("\u2190");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currValue = Integer.parseInt(answer.getText());
				answer.setText((currValue / 10) + "");
			}
		});
		btnDel.setFont(new Font("±¼¸²", Font.BOLD, 35));
		btnDel.setBounds(196, 119, 80, 80);
		frame.getContentPane().add(btnDel);
		
	}
}

class NumberActionListener implements ActionListener {

	private JLabel label;
	private String text;

	public NumberActionListener(JLabel l, String s) {
		label = l;
		text = s;
	}

	public void actionPerformed(ActionEvent e) {
		String curr = label.getText();
		if (curr.equals("0")) {
			label.setText(text);
		} else {
			label.setText(label.getText() + text);
		}
	}
}
