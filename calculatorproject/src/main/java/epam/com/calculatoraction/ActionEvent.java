package epam.com.calculatoraction;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import epam.com.calculatorwindow.*;
import epam.com.calculatorproject.*;

public class ActionEvent implements ActionListener {
	private String s1="",s2="",s0="";
	
	private JButton b;
	private JTextField tf;
	
	public ActionEvent(JButton b1,JTextField tf) {
		this.b=b1;
		this.tf=tf;
	}

	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		String s=e.getActionCommand();
		
		if((s.charAt(0)>='0' && s.charAt(0)<='9')||s.charAt(0)=='.') {
			if(!s1.equals(""))
				s2=s2+s;
			else
				s0=s0+s;
			tf.setText(s0+s1+s2);
		}
		else if(s.charAt(0)=='C'){
			s0=s1=s2="";
			tf.setText(s0+s1+s2);
		}
		else if(s.charAt(0)=='=') {
			double t = 0;
			
			if(s1.equals("+"))
				t=(Double.parseDouble(s0)+Double.parseDouble(s2));
			else if(s1.equals("-"))
				t=(Double.parseDouble(s0)-Double.parseDouble(s2));
			else if(s1.equals("*"))
				t=(Double.parseDouble(s0)*Double.parseDouble(s2));
			else if(s1.equals("/"))
				t=(Double.parseDouble(s0)/Double.parseDouble(s2));
			
			tf.setText(Double.toString(t));
			s0=Double.toString(t);
			s1=s2="";
		}
		else {
			if(s1.equals("")||s2.equals(""))
				s1=s;
			else {
				double t = 0;
				
				if(s1.equals("+"))
					t=(Double.parseDouble(s0)+Double.parseDouble(s2));
				else if(s1.equals("-"))
					t=(Double.parseDouble(s0)-Double.parseDouble(s2));
				else if(s1.equals("*"))
					t=(Double.parseDouble(s0)*Double.parseDouble(s2));
				else if(s1.equals("/"))
					t=(Double.parseDouble(s0)/Double.parseDouble(s2));
			
				s0=Double.toString(t);
				s1=s;
				s2="";
			}
			tf.setText(s0+s1+s2);
		}
	}
}
