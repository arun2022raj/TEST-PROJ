import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class tls extends JFrame implements ActionListener{
	JLabel ml;
	JRadioButton rb,gb,yb;
	
	public tls(){
		setTitle("tls");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		rb=new JRadioButton("red");
		gb=new JRadioButton("green");
		yb=new JRadioButton("yeollow");
		
		ButtonGroup g=new ButtonGroup();
		g.add(rb);
		g.add(yb);
		g.add(gb);
		
		rb.addActionListener(this);
		gb.addActionListener(this);
		yb.addActionListener(this);
		
		ml = new JLabel();
		ml.setHorizontalAlignment(JLabel.CENTER);
		ml.setFont(new Font("Arial" , Font.BOLD , 20));
		
		JPanel p= new JPanel();
		p.add(rb);
		p.add(yb);
		p.add(gb);
		
		add(ml,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		}
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==rb){
				ml.setText("Red");
				ml.setForeground(Color.RED);
				}else if (e.getSource()==yb){
				ml.setText("yellow");
				ml.setForeground(Color.YELLOW);
				}else if (e.getSource()==gb){
				ml.setText("GREEN");
				ml.setForeground(Color.GREEN);
				}
			}
		public static void main(String[] arr){
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					tls tl= new tls();
					tl.setVisible(true);
					}
				});
			}
		
	}
