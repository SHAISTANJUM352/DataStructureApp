import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField insertpos;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY  DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(164, 25, 286, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER  ARRAY  LENGTH");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1.setBounds(21, 74, 200, 22);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setForeground(new Color(0, 0, 0));
		length.setBackground(new Color(211, 211, 211));
		length.setFont(new Font("Cambria", Font.BOLD, 18));
		length.setBounds(268, 78, 86, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for creating array
				int len = Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);				
				}
		});
		create.setForeground(new Color(139, 0, 0));
		create.setFont(new Font("Cambria", Font.BOLD, 18));
		create.setBounds(397, 74, 177, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("INSERT AN INTEGER ELEMENT  ");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 129, 269, 22);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setForeground(new Color(0, 0, 0));
		element.setBackground(new Color(211, 211, 211));
		element.setFont(new Font("Cambria", Font.BOLD, 18));
		element.setColumns(10);
		element.setBounds(268, 130, 86, 20);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(insertpos.getText());
				arr[pos]=elem;
				String message ="Element "+elem+" Inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				insertpos.setText("");
			}
		});
		insert.setForeground(new Color(139, 0, 0));
		insert.setFont(new Font("Cambria", Font.BOLD, 18));
		insert.setBounds(268, 179, 101, 23);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("DELETE  POSITION");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(55, 223, 186, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("POSITION");
		lblNewLabel_1_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_2.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(364, 129, 86, 22);
		contentPane.add(lblNewLabel_1_1_2);
		
		deletepos = new JTextField();
		deletepos.setForeground(new Color(0, 0, 0));
		deletepos.setFont(new Font("Cambria", Font.BOLD, 18));
		deletepos.setColumns(10);
		deletepos.setBackground(new Color(211, 211, 211));
		deletepos.setBounds(247, 224, 146, 20);
		contentPane.add(deletepos);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deletepos.getText());
				arr[pos]=0;
				String message ="Element Deleted at the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deletepos.setText("");
			}
		});
		delete.setForeground(new Color(139, 0, 0));
		delete.setFont(new Font("Cambria", Font.BOLD, 18));
		delete.setBounds(428, 223, 101, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Cambria", Font.BOLD, 18));
		display.setBounds(247, 272, 146, 23);
		contentPane.add(display);
		
		insertpos = new JTextField();
		insertpos.setForeground(new Color(0, 0, 0));
		insertpos.setFont(new Font("Cambria", Font.BOLD, 18));
		insertpos.setColumns(10);
		insertpos.setBackground(new Color(211, 211, 211));
		insertpos.setBounds(460, 130, 114, 20);
		contentPane.add(insertpos);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setFont(new Font("Cambria", Font.BOLD, 18));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(152, 251, 152));
		displaybox.setBounds(164, 311, 298, 27);
		contentPane.add(displaybox);
	}
}
