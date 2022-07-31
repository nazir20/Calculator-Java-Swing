package mnSharifi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private double result, number;
	int operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Add new values to input
	 */
	public void addToInput(String value) {
		input.setText(input.getText() + value);
	}
	
	/**
	 * calculate method
	 */
	public void calculate() {
		switch(operation) {
		case 1:
			result = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(result));
			break;
		case 2:
			result = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(result));
			break;
		case 3:
			result = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(result));
			break;
		case 4:
			result = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(result));
			break;
		}
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(19, 11, 362, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		input.setBounds(6, 22, 350, 38);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setForeground(new Color(25, 25, 112));
		lbl.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(6, 6, 350, 16);
		screen.add(lbl);
		
		JPanel control = new JPanel();
		control.setBounds(19, 78, 362, 383);
		contentPane.add(control);
		control.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("8");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.setForeground(new Color(46, 139, 87));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_6);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_5);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setForeground(new Color(255, 140, 0));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("3");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_7);
		
		JButton btnNewButton_12 = new JButton("2");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_12.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_12);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.setForeground(new Color(153, 50, 204));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_10.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addToInput(e.getActionCommand());
			}
		});
		btnNewButton_11.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		btnNewButton_13.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_13);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(Color.RED);
		btnC.setBackground(Color.RED);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnC.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnC);
		
		JButton btnNewButton_15 = new JButton("%");
		btnNewButton_15.setForeground(new Color(30, 144, 255));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_15.setFont(new Font("Lucida Grande", Font.BOLD, 19));
		control.add(btnNewButton_15);
	}
}
