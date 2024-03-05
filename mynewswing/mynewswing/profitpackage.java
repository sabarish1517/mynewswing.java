package mynewswing;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

import javax.swing.*;
class Profit extends JFrame implements ActionListener 
{
	JFrame frm=new JFrame("profit");
	JLabel head=new JLabel("PROFIT CALCULATION");
	JLabel amnt=new JLabel("Amount");
	JLabel dis=new JLabel("Discount");
	JTextField jt=new JTextField(5);
	JButton bt=new JButton("calculate");
	JLabel tot=new JLabel("TOTAL");
	JLabel img=new JLabel();
	JTextField tf=new JTextField(10);
	String i[]= {"10","20","30"};
//NumberFormat nf;
	JComboBox bx=new JComboBox(i);
	Profit()
	{
		frm.setLayout(null);
		frm.setSize(800,800);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.add(head);
		frm.add(amnt);
		frm.add(jt);
		frm.add(dis);
		frm.add(bx);
		frm.add(bt);
		frm.add(tot);
		frm.add(tf);
		head.setBounds(400,5,200,200);
		amnt.setBounds(200,50,200,200);
		dis.setBounds(200,100,200,200);
		jt.setBounds(300,140,200,25);
		bx.setBounds(300,190,200,25);
		bt.setBounds(300,250,100,35);
		tot.setBounds(200,240,200,200);
		tf.setBounds(300,320,200,25);
		//img.setIcon("download.png");
	jt.addActionListener(this);
		bx.addActionListener(this);
		bt.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//	String amnt=jt.getText();
//	String disc=(String)bx.getSelectedItem();
	try
	{
	Double amount=Double.parseDouble(jt.getText());
	String dicoun=bx.getSelectedItem().toString();
	Double discount=Double.parseDouble(dicoun);
	Double total=amount-(amount*discount)/100;
	tf.setText(String.format("%.2f",total));
	
		
	}
	catch(NumberFormatException ex )
	{
		JOptionPane.showMessageDialog(this, "Please enter a valid number for the principal amount.", "Error", JOptionPane.ERROR_MESSAGE);
	}
}
}
public class profitpackage {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable()
				{
			public void run()
			{
				new Profit();
			}
				});
	

	}
}


