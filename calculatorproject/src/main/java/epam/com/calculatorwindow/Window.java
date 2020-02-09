package epam.com.calculatorwindow;

import javax.swing.JFrame;

public class Window{
	JFrame f;
	Panel p;
	public Window(){
		f=new JFrame("calculator");
		Panel p=new Panel();
		
		p.addtextfield(f);
		p.addbuttons(f);
		
		f.setSize(200,250);
		f.setVisible(true);
	}
}
