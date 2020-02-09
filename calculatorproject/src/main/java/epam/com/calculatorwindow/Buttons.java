package epam.com.calculatorwindow;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import epam.com.calculatoraction.ActionEvent;


public class Buttons{
	
	private JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bd,bm,bc,be,bq;
	
	public void add(JPanel jp,JFrame f,JTextField tf) {
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		ba=new JButton("+");
		bs=new JButton("-");
		bm=new JButton("*");
		bd=new JButton("/");
		bc=new JButton("C");
		be=new JButton(".");
		bq=new JButton("=");
		
		
		
		ActionEvent ae=new ActionEvent(b1,tf);
		b1.addActionListener(ae);
		b2.addActionListener(ae);
		b3.addActionListener(ae);
		b4.addActionListener(ae);
		b5.addActionListener(ae);
		b6.addActionListener(ae);
		b7.addActionListener(ae);
		b8.addActionListener(ae);
		b9.addActionListener(ae);
		b0.addActionListener(ae);
		ba.addActionListener(ae);
		bs.addActionListener(ae);
		bm.addActionListener(ae);
		bd.addActionListener(ae);
		be.addActionListener(ae);
		bc.addActionListener(ae);
		bq.addActionListener(ae);
		
		jp.add(ba);
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		jp.add(bs);
		jp.add(b4);
		jp.add(b5);
		jp.add(b6);
		jp.add(bm);
		jp.add(b7);
		jp.add(b8);
		jp.add(b9);
		jp.add(bd);
		jp.add(bc);
		jp.add(b0);
		jp.add(be);
		jp.add(bq);
		
		jp.setBackground(Color.blue);
		f.getContentPane().add(jp);
		
	}
}
