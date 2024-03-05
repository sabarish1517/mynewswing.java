package mynewswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MarkDetail extends JFrame implements ActionListener {
	JFrame fra=new JFrame("marksdetail");
	JLabel lb=new JLabel("Marks Detail");
	JLabel lt=new JLabel("Tamil mark");
	JLabel le=new JLabel("english mark");
	JLabel lm=new JLabel("maths mark");
	JLabel lsc=new JLabel("science mark");
	JLabel lso=new JLabel("social mark");
	JLabel tot=new JLabel();
	JTextField ta=new JTextField(10);
	JTextField te=new JTextField(10);
	JTextField tm=new JTextField(10);
	JTextField tsc=new JTextField(10);
	JTextField tso=new JTextField(10);
	JButton bt=new JButton("sum");
	MarkDetail()
	{
		fra.setSize(800, 800);
		fra.setVisible(true);
		fra.setLayout(null);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fra.add(lb);
		lb.setBounds(50, 20, 400, 30);
		lb.setFont((new Font(null,Font.ITALIC,30)));
		fra.add(lt);
		fra.add(le);
		fra.add(lm);
		fra.add(lsc);
		fra.add(lso);
		fra.add(ta);
		fra.add(te);
		fra.add(tm);
		fra.add(tsc);
		fra.add(tso);
		fra.add(bt);
	    lt.setBounds(100,200,100,50);
	    ta.setBounds(300,210,150,30);
	    le.setBounds(100,250,100,50);
	    te.setBounds(300,260,150,30);
	    lm.setBounds(100,290,100,50);
	    tm.setBounds(300,300,150,30);
	    lsc.setBounds(100,330,100,50);
	    tsc.setBounds(300,340,150,30);
	    lso.setBounds(100,370,100,50);
	    tso.setBounds(300,380,150,30);
	    bt.setBounds(350,410,100,30);
	    bt.addActionListener(this);
	    ta.addActionListener(this);
	    te.addActionListener(this);
	    tm.addActionListener(this);
	    tsc.addActionListener(this);
	    tso.addActionListener(this);
	    fra.add(tot);
	    

	    
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
		Double tam=Double.parseDouble(ta.getText());
		Double eng=Double.parseDouble(te.getText());
		Double mat=Double.parseDouble(tm.getText());
		Double sci=Double.parseDouble(tsc.getText());
		Double soc=Double.parseDouble(tso.getText());
		Double total=tam+eng+mat+sci+soc;
		tot.setText(String.format("%.0f",total));
		
		tot.setBounds(300,450,100,50);
		}
		catch(Exception ex)
		{
		     JOptionPane.showMessageDialog(this,"invalid no" ,"error on textfield", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
