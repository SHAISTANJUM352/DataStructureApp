import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;

public class singlyll extends JFrame {

	private JPanel contentPane;
	private JTextField insertrear;
	private JTextField insertfront;
	private JTextField displaybox;
	class Node{
		int data;
		Node link;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					singlyll frame = new singlyll();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public singlyll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 160, 122));
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(104, 25, 385, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1.setBounds(41, 78, 227, 22);
		contentPane.add(lblNewLabel_1);		
		
		JButton insertr = new JButton("INSERT REAR");
		insertr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for insert rear
				Node temp;
				int elem=Integer.valueOf(insertrear.getText());				
				Node newnode =new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first == null) {
					first=newnode;
				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
				}			
				JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
				insertrear.setText("");
				}
		});
		insertr.setForeground(new Color(139, 0, 0));
		insertr.setFont(new Font("Cambria", Font.BOLD, 18));
		insertr.setBounds(397, 74, 177, 31);
		contentPane.add(insertr);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT: ");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(41, 136, 238, 22);
		contentPane.add(lblNewLabel_1_1);
		
		
		
		JButton insertf = new JButton("INSERT FRONT");
		insertf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int elem=Integer.valueOf(insertfront.getText());
				Node newnode =new Node();
				newnode.data=elem;
				newnode.link=null;
				if(first == null) {
					first=newnode;
				}
				else {
					newnode.link=first;
					first=newnode;
					}
				JOptionPane.showMessageDialog(contentPane, "Insert Successfull");
				insertfront.setText("");
			}
		});
		insertf.setForeground(new Color(139, 0, 0));
		insertf.setFont(new Font("Cambria", Font.BOLD, 18));
		insertf.setBounds(397, 134, 177, 27);
		contentPane.add(insertf);
		
		
		
		JButton deleter = new JButton("DELETE REAR");
		deleter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete rear
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					String message="Element deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					String message="Element deleted is"+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.link=null;
				}
			}
		});
		deleter.setForeground(new Color(139, 0, 0));
		deleter.setFont(new Font("Cambria", Font.BOLD, 18));
		deleter.setBounds(225, 183, 168, 27);
		contentPane.add(deleter);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				Node temp;
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.link==null) {
					msg=msg+" "+first.data;
					
				}
				else {
					temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.link;
					}
				}
					displaybox.setText(msg);
					
				
			}
		});
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Cambria", Font.BOLD, 18));
		display.setBounds(225, 269, 168, 27);
		contentPane.add(display);
		
		JButton deletef = new JButton("DELETE FRONT");
		deletef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for delete front
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.link==null) {
					String message="Element deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					String message="Element deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.link;
				}
			}
		});
		deletef.setForeground(new Color(139, 0, 0));
		deletef.setFont(new Font("Cambria", Font.BOLD, 18));
		deletef.setBounds(225, 221, 168, 31);
		contentPane.add(deletef);
		
		insertrear = new JTextField();
		insertrear.setBackground(new Color(220, 220, 220));
		insertrear.setFont(new Font("Cambria", Font.BOLD, 20));
		insertrear.setBounds(257, 78, 105, 24);
		contentPane.add(insertrear);
		insertrear.setColumns(10);
		
		insertfront = new JTextField();
		insertfront.setBackground(new Color(220, 220, 220));
		insertfront.setFont(new Font("Cambria", Font.BOLD, 20));
		insertfront.setColumns(10);
		insertfront.setBounds(257, 135, 105, 24);
		contentPane.add(insertfront);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(144, 238, 144));
		displaybox.setFont(new Font("Cambria", Font.BOLD, 20));
		displaybox.setColumns(10);
		displaybox.setBounds(163, 307, 300, 31);
		contentPane.add(displaybox);
		
	}
}
