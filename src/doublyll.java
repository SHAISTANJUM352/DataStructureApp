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

public class doublyll extends JFrame {

	private JPanel contentPane;
	private JTextField insertrear;
	private JTextField insertfront;
	private JTextField displaybox;
	class Node{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doublyll frame = new doublyll();
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
	public doublyll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(188, 143, 143));
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(101, 25, 393, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1.setBounds(44, 78, 224, 22);
		contentPane.add(lblNewLabel_1);		
		
		JButton insertr = new JButton("INSERT REAR");
		insertr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for insert rear
				Node temp;
				int elem=Integer.valueOf(insertrear.getText());	
				Node newnode =new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				if(first == null) {
					first=newnode;
				}
				else {
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
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
		lblNewLabel_1_1.setBounds(44, 136, 201, 22);
		contentPane.add(lblNewLabel_1_1);
		
		
		
		JButton insertf = new JButton("INSERT FRONT");
		insertf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert front
				int elem=Integer.valueOf(insertfront.getText());
				Node newnode =new Node();
				newnode.data=elem;
				newnode.nextlink=null;
				newnode.prelink=null;
				if(first == null) {
					first=newnode;
				}
				else {
					newnode.nextlink=first;
					first.prelink=newnode;
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
				else if(first.nextlink==null) {
					String message="Element deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					temp=first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					String message="Element deleted is"+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink=null;
				}
			}
		});
		deleter.setForeground(new Color(139, 0, 0));
		deleter.setFont(new Font("Cambria", Font.BOLD, 18));
		deleter.setBounds(224, 182, 169, 27);
		contentPane.add(deleter);
		
		JButton deletef = new JButton("DELETE FRONT");
		deletef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete front
				Node temp;
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Deletion not possible");
				}
				else if(first.nextlink==null) {
					String message="Element deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=null;
				}
				else {
					String message="Element deleted is"+first.data;
					JOptionPane.showMessageDialog(contentPane, message);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		deletef.setForeground(new Color(139, 0, 0));
		deletef.setFont(new Font("Cambria", Font.BOLD, 18));
		deletef.setBounds(224, 226, 169, 27);
		contentPane.add(deletef);
		
		JButton displayfor = new JButton("DISPLAY FORWARD");
		displayfor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for display forward
				Node temp;
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null) {
					msg=msg+" "+first.data;
				}
				else {
					temp=first;
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}
				}
				displaybox.setText(msg);
			}
		});
		displayfor.setForeground(new Color(139, 0, 0));
		displayfor.setFont(new Font("Cambria", Font.BOLD, 18));
		displayfor.setBounds(101, 264, 199, 27);
		contentPane.add(displayfor);
		
		JButton displayrev = new JButton("DISPLAY REVERSE");
		displayrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for display reverse
				Node temp;
				String msg="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else if(first.nextlink==null) {
					msg=msg+" "+first.data;
				}
				else {
					temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
				}
				displaybox.setText(msg);
			}
		});
		displayrev.setForeground(new Color(139, 0, 0));
		displayrev.setFont(new Font("Cambria", Font.BOLD, 18));
		displayrev.setBounds(325, 264, 201, 27);
		contentPane.add(displayrev);
		
		insertrear = new JTextField();
		insertrear.setBackground(new Color(211, 211, 211));
		insertrear.setFont(new Font("Cambria", Font.BOLD, 20));
		insertrear.setBounds(254, 78, 104, 24);
		contentPane.add(insertrear);
		insertrear.setColumns(10);
		
		insertfront = new JTextField();
		insertfront.setFont(new Font("Cambria", Font.BOLD, 20));
		insertfront.setColumns(10);
		insertfront.setBackground(new Color(211, 211, 211));
		insertfront.setBounds(254, 134, 104, 24);
		contentPane.add(insertfront);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Cambria", Font.BOLD, 20));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(144, 238, 144));
		displaybox.setBounds(166, 302, 300, 37);
		contentPane.add(displaybox);
		
	}

}
