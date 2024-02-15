package calculatrice;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Operations extends frame implements ActionListener {
	
	JButton button_add = new JButton();
	JButton button_sub = new JButton();
	JButton button_mul = new JButton();
	JButton button_div = new JButton();
	JButton zero = new JButton();
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JButton five = new JButton();
	JButton six = new JButton();
	JButton seven = new JButton();
	JButton eight = new JButton();
	JButton nine = new JButton();
	JButton equal_sign = new JButton();
	JButton comma = new JButton();
	JButton Ac = new JButton();
	JButton sup = new JButton();
	JButton power = new JButton();
	JLabel output = new JLabel();
	TextField input = new TextField();

	
	Operations(){
		//addition
		button_add.setBounds(325, 135, 50, 50);
		button_add.addActionListener(e -> input.setText(input.getText()+"+"));
		this.add(button_add);
		button_add.setText("+");
		button_add.setFocusable(false);
		
		//subtract
		button_sub.setBounds(325, 195, 50, 50);
		button_sub.addActionListener(e -> input.setText(input.getText()+"-"));
		this.add(button_sub);
		button_sub.setText("-");
		button_sub.setFocusable(false);
		
		//multiple
		button_mul.setBounds(325, 255, 50, 50);
		button_mul.addActionListener(e -> input.setText(input.getText()+"x"));
		this.add(button_mul);
		button_mul.setText("x");
		button_mul.setFocusable(false);
		
		//division
		button_div.setBounds(325, 315, 50, 50);
		button_div.addActionListener(e -> input.setText(input.getText()+"/"));
		this.add(button_div);
		button_div.setText("/");
		button_div.setFocusable(false);
		
		// numbers 
		// zero
		zero.setBounds(75, 315, 50, 50);
		zero.addActionListener(e -> input.setText(input.getText()+"0"));
		this.add(zero);
		zero.setText("0");
		zero.setFocusable(false);
		
		// one button
		one.setBounds(75, 255, 50, 50);
		one.addActionListener(e -> input.setText(input.getText()+"1"));
		this.add(one);
		one.setText("1");
		one.setFocusable(false);
		
		// two button
		two.setBounds(135, 255, 50, 50);
		two.addActionListener(e -> input.setText(input.getText()+"2"));
		this.add(two);
		two.setText("2");
		two.setFocusable(false);
		
		// three button
		three.setBounds(195, 255,50, 50);
		three.addActionListener(e -> input.setText(input.getText()+"3"));
		this.add(three);
		three.setText("3");
		three.setFocusable(false);
		
		// four  button
		four.setBounds(75, 195, 50, 50);
		four.addActionListener(e -> input.setText(input.getText()+"4"));
		this.add(four);
		four.setText("4");
		four.setFocusable(false);
		
		// five button
		five.setBounds(135, 195, 50, 50);
		five.addActionListener(e -> input.setText(input.getText()+"5"));
		this.add(five);
		five.setText("5");
		five.setFocusable(false);
		
		// six button
		six.setBounds(195, 195, 50, 50);
		six.addActionListener(e -> input.setText(input.getText()+"6"));
		this.add(six);
		six.setText("6");
		six.setFocusable(false);
		
		// seven button
		seven.setBounds(75, 135, 50, 50);
		seven.addActionListener(e -> input.setText(input.getText()+"7"));
		this.add(seven);
		seven.setText("7");
		seven.setFocusable(false);
		
		// eight button
		eight.setBounds(135, 135, 50,50);
		eight.addActionListener(e -> input.setText(input.getText()+"8"));
		this.add(eight);
		eight.setText("8");
		eight.setFocusable(false);
		
		// nine button
		nine.setBounds(195, 135, 50, 50);
		nine.addActionListener(e -> input.setText(input.getText()+"9"));
		this.add(nine);
		nine.setText("9");
		nine.setFocusable(false);
		
		// equal sign button 
		equal_sign.setBounds(195, 315, 50, 50);
		equal_sign.addActionListener(this);
		this.add(equal_sign);
		equal_sign.setText("=");
		equal_sign.setFocusable(false);
		
		// comma button
		comma.setBounds(135, 315, 50, 50);
		comma.addActionListener(e -> input.setText(input.getText()+"."));
		this.add(comma);
		comma.setText(".");
		comma.setFocusable(false);
		
		// Ac button
		Ac.setBounds(260, 135, 50, 50);
		Ac.addActionListener(e -> {
			input.setText("");
			output.setText("0");}
		);
		this.add(Ac);
		Ac.setText("Ac");
		Ac.setFocusable(false);
	
		// input 
		input.setBounds(75, 50, 300, 40);
		this.add(input);
		
		// output 
		output.setText("0");
		output.setForeground(Color.black);
		output.setFont(new Font("BOLD",Font.BOLD,20));
		output.setBounds(75, 100, 300, 30);
		this.add(output);
		
		// delete last Button
		sup.setBounds(260, 195, 50, 50);
		this.add(sup);
		sup.addActionListener(
				e -> 
				input.setText(input.getText().substring(0,input.getText().length() - 1)));
		sup.setText("C");
		sup.setFocusable(false);
		
		// power button
		power.setBounds(260, 255, 50, 50);
		power.addActionListener(e -> input.setText(input.getText()+"^"));
		this.add(power);
		power.setText("^");
		power.setFocusable(false);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		String oper = input.getText();
		char[] characters = oper.toCharArray();
 		ArrayList<String> opr = new ArrayList<String>();
 		ArrayList<Double> nums = new ArrayList<Double>();
		if (characters[0] == '+' || 
			characters[0] == '-'  ||
			characters[0] == 'x'  ||
			characters[0] == '/' ||
			characters[0] == '^')   {
			    output.setText("ERROR");}
		 else if (characters[characters.length-1] == '+' ||
					characters[characters.length-1] == '-' ||
					characters[characters.length-1] == 'x' ||
					characters[characters.length-1] == '/' ||
					characters[characters.length-1] == '^') {
			    		output.setText("ERROR");}
		 	else {
		 		String char_join = "";
		 		for (char i : characters) {
		 			if (i == '+' || 
		 				i == '-'  ||
		 				i == 'x'  ||
		 				i == '/'  ||
		 				i == '^'
		 				  )	{
		 					 opr.add(Character.toString(i));
		 					 nums.add(Double.parseDouble(char_join));
		 					 char_join = "";
		 			}
		 			else {
		 				char_join = char_join + i;
		 			}
		 			}
		 		nums.add(Double.parseDouble(char_join));
		 		
		 		clc(opr,nums);
		 		
					}	   
				}
	
	
	
	void clc(ArrayList<String> opr, ArrayList<Double> nums) {
		int b = 0;
		Double tmp = nums.get(0);
		while (b != opr.size()) {
			for (String i : opr) {
				char j = i.charAt(0);
				System.out.println(b);
				if (j == '+') {
					tmp = tmp + nums.get(b+1);
				}
				else if(i.equals("-")) {
					tmp = tmp - nums.get(b+1);
				}
				else if(i.equals("x")) {
					tmp = tmp * nums.get(b+1);
				}
				else if(i.equals("^")) {
					Double tp = tmp;
					for (int h=1 ; h<nums.get(b+1) ; h++) {
						System.out.println(nums.get(b+1));
						tmp = tmp * tp;
					}
				}
				else {
					tmp = tmp / nums.get(b+1);
				}
				b++;
				}
			
			}
		output.setText(Double.toString(tmp));
	}
}
