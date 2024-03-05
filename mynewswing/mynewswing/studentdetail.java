package mynewswing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Student extends JFrame implements ActionListener
{
JLabel nm=new JLabel("NAME");
JLabel hdr=new JLabel("STUDENT DETAIL",JLabel.CENTER);
JTextField jtn=new JTextField(10);
JFrame jf=new JFrame("student detail");
JLabel id=new JLabel("REGISTER NO");
JTextField jtr=new JTextField(10);
JButton bt=new JButton("submit");
Student()
{
	jf.setLayout(null);;
	jf.setSize(800,800);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
	jf.add(nm);
	jf.add(jtn);
	jf.add(id);
	jf.add(jtr);
	jf.add(hdr);
	jf.add(bt);
	nm.setBounds(50,50,100,100);
	jtn.setBounds(200,77,200,30);
	id.setBounds(50,100,100,100);
	jtr.setBounds(200,135,200,30);
	//hdr.setSize(500,500);
	hdr.setBounds(350,10,300,50);
	hdr.setFont(new Font(null,Font.HANGING_BASELINE,30));
	jtn.setVerifyInputWhenFocusTarget(isFocusable());
	hdr.setPreferredSize(new Dimension(50,50));
	bt.setBounds(250,180,100,50);
	bt.addActionListener(this);
	jtn.addActionListener(this);
	jtr.addActionListener(this);

}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nmae=jtn.getText();
		String reg=jtr.getText();
		String url="jdbc:mysql://localhost:3306/studentdetails";
		String usrname="root";
		String passwrd="sabari1517";
		String query="insert into form(stname,regid) values(?,?)";
		
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, usrname, passwrd);
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, nmae);
			ps.setString(2,reg);
			int row=ps.executeUpdate();
			JOptionPane.showMessageDialog(this, row+"affected");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this, ex);
		}
		if(e.getSource()==bt)	
		{
			jf.dispose();
			NewPage nw=new NewPage();
			
		}
		
	}
	
}
public class studentdetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student();

	}

}

