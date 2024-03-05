package mynewswing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class View extends JFrame implements ActionListener
{

	JLabel lb=new JLabel("name:");
	JLabel ln=new JLabel();
	JFrame frm=new JFrame("PROJECT2");
	JTextField tf=new JTextField(15);
	JLabel lp=new JLabel("pasword");
	JLabel ls=new JLabel();
	JLabel em=new JLabel();
	JPasswordField tp=new JPasswordField(10);
	View()
	{
		frm.setSize(800, 500);
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.add(lb);
		frm.add(tf);
		frm.add(ln);
		frm.add(lp);
		frm.add(tp);  
		frm.add(ls);
		frm.add(em);
		tf.setBounds(150,60,200,30);
		tp.setBounds(150,100,200,30);
		lp.setBounds(60,100,50,30);
		//lb.setText("hai");
		lb.setBounds(60,60,50,30);
		tf.addActionListener(this);
		tp.addActionListener(this);

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str=tf.getText();
		ln.setText("name is: "+ str);
		ln.setBounds(100,300,500,50);
		String s=new String(tp.getPassword());
		if(s.isEmpty())
		{
			em.setText(" pasword is not set");
			em.setBounds(165,350,1000,50);
		}
		ls.setText("pasword is: "+s);
		ls.setBounds(100,350,500,50);
	}

	
}
public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new View();

	}

}
