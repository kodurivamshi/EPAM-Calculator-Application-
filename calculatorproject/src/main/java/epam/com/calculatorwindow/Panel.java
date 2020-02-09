package epam.com.calculatorwindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel {
	
	public JTextField jf;
	public JPanel jp;
	Buttons b;
	
	Panel(){
		jp=new JPanel();
		b=new Buttons();
		
	}
	
	public void addtextfield(JFrame f) {
		jf=new JTextField(11);
		Font font=new Font("Serif",Font.BOLD,20);
		jf.setFont(font);
		jp.add(jf);
		f.getContentPane().add(jp);
	}

	public void addbuttons(JFrame f) {
		b.add(jp,f,jf);
	}

}
