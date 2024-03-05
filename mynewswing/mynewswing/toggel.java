package mynewswing;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Tgle extends JFrame  implements ItemListener
{
	
	JFrame frm=new JFrame("togglebutton");
	JToggleButton tg=new JToggleButton("on");
	JLabel lb=new JLabel();
	JCheckBox c=new JCheckBox("java",false);
	JRadioButton bj=new JRadioButton("java");
	JRadioButton bp=new JRadioButton("python");
	Tgle(){
		frm.setSize(800,800);
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.add(tg);
	//	frm.add(c);
		frm.add(bj);
		frm.add(bp);
		tg.setBounds(40,40,100,40);
	//	c.setBounds(40,200,300,300);
	    bj.setBounds(40,400,300,300);
		bp.setBounds(200,400,300,300);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
	if(tg.isSelected())
	{
//		lb.setText("on");
		//lb.setBounds(40,80,80,40);
	}
	}
	
}
public class toggel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tgle();

	}

}
