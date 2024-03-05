package mynewswing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class NewPage extends JFrame implements ActionListener {
	JFrame fr=new JFrame("new page");
	JLabel lb=new JLabel("students form");
	JLabel fa=new JLabel("FATHER NAME");
	JLabel mo=new JLabel("MOTHER NAME");
	JLabel adrs=new JLabel("address");
	JTextField fn=new JTextField(10);
	JTextField mn=new JTextField(10);
	JLabel dob=new JLabel("DOB:");
	JLabel da=new JLabel("date");
	JLabel mon=new JLabel("month");
	JLabel yr=new JLabel("year");
	JButton bu=new JButton("submit detail");
	String date[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String month[]= {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
	String year[]= {"1999","2000","2001","2002","2003","2004","2005"};
	JComboBox dt=new JComboBox(date);
	JComboBox mot=new JComboBox(month);
	JComboBox yrt=new JComboBox(year);
	TextArea ar=new TextArea();
	NewPage()
	{
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		fr.setSize(800,800);
		fr.setVisible(true);
		fr.add(lb);
		lb.setBounds(50,10,2000,30);
		lb.setFont(new Font(null,Font.ROMAN_BASELINE,30));
		fr.add(fa);
		fr.add(mo);
		fr.add(fn);
		fr.add(mn);
		fr.add(dob);
		fr.add(da);
		fr.add(mon);
		fr.add(yr);
	    fr.add(dt);
	    fr.add(mot);
	    fr.add(yrt);
	    fr.add(adrs);
	    fr.add(ar);
	    fr.add(bu);
	    fa.setBounds(30,100,100,20);
		fn.setBounds(120,100,150,25);
		mo.setBounds(400,100,100,20);
		mn.setBounds(490,100,150,25);
		dob.setBounds(30,150,100,30);
		da.setBounds(65,150,100,30);
		dt.setBounds(100,150,75,40);
		mon.setBounds(200,150,100,30);
		mot.setBounds(250,150,75,40);
		yr.setBounds(350,150,100,30);
		yrt.setBounds(390,150,75,40);
	    adrs.setBounds(30,200,100,100);
		ar.setBounds(65,235,400,50);
		bu.setBounds(250,400,200,30);
		bu.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource()==bu)
	{
		fr.dispose();
		MarkDetail md=new MarkDetail();
	}
		
	}

	

}

