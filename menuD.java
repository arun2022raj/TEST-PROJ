import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menuD extends JFrame implements ActionListener{
	public menuD(){
		setTitle("menuDemo");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar mb = new JMenuBar();
		
		JMenu fm= new JMenu("File");
		
		JMenu hm = new JMenu("home");
		
		JMenuItem newfi = new JMenuItem("new");
		JMenuItem open = new JMenuItem("open");
		JMenuItem save = new JMenuItem("save");
		JMenuItem exit = new JMenuItem("exit");
		
		fm.add(newfi);
		fm.add(open);
		fm.add(save);
		fm.addSeparator();
		fm.add(exit);
		
		mb.add(fm);
		mb.add(hm);
		
		setJMenuBar(mb);
		
		newfi.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
		
		}
		public void actionPerformed(ActionEvent e){
			String ml= "opetion clicked"+((JMenuItem) e.getSource()).getText();
			JOptionPane.showMessageDialog(this,ml);
			}
		public static void main(String[] args){
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					menuD md=new menuD();
					md.setVisible(true);
					}
				});
			}


}
