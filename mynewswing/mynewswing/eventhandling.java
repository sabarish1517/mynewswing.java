package mynewswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Event extends JFrame implements ActionListener
{
	JFrame frm=new JFrame("CONTAINER");
	JButton bt=new JButton("JAVA");
	JButton pt=new JButton("python");
	JTextField lb=new JTextField();

	Event()
	{
		frm.setSize(500, 500);
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt.setBounds(20,50,100,60);
		pt.setBounds(250,50,100,60);
		lb.setBounds(50,400,300,30);
		frm.add(bt);
		frm.add(pt);
		frm.add(lb);
		bt.addActionListener(this);
		pt.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String st=e.getActionCommand();
		if(st.equals("JAVA"))
		{
			lb.setText("java is clickked");
		}
		else
		{
			lb.setText("python is clicked");
		}
			
		
	}
	
}
public class eventhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event();

	}

}
