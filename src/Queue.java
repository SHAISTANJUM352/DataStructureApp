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
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[], size, r=-1, f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE  DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(164, 25, 286, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER THE QUEUE SIZE:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1.setBounds(44, 78, 224, 22);
		contentPane.add(lblNewLabel_1);		
		
		JButton queue = new JButton("CREATE QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code for creating queue
				size = Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Queue of size "+size+" Created";
				JOptionPane.showMessageDialog(contentPane, message);				
				}
		});
		queue.setForeground(new Color(139, 0, 0));
		queue.setFont(new Font("Cambria", Font.BOLD, 18));
		queue.setBounds(397, 74, 177, 31);
		contentPane.add(queue);
		
		JLabel lblNewLabel_1_1 = new JLabel("INSERT AN INTEGER ELEMENT: ");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 136, 269, 22);
		contentPane.add(lblNewLabel_1_1);
		
		
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem;
				if(r == size-1) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else {
					 elem=Integer.valueOf(element.getText());
					 ++r;
					 s[r]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push Successfull");
					element.setText("");
				}
			}
		});
		push.setForeground(new Color(139, 0, 0));
		push.setFont(new Font("Cambria", Font.BOLD, 18));
		push.setBounds(397, 134, 177, 27);
		contentPane.add(push);
		
		
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				if(r == -1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "pop not possible");
				}
				else {
					String message="Element deleted is"+s[f];
					JOptionPane.showMessageDialog(contentPane, message);
					++f;
				}
			}
		});
		pop.setForeground(new Color(139, 0, 0));
		pop.setFont(new Font("Cambria", Font.BOLD, 18));
		pop.setBounds(247, 193, 146, 27);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				if(r == -1 || f>r) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=f;i<=r;i++) {
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setForeground(new Color(139, 0, 0));
		display.setFont(new Font("Cambria", Font.BOLD, 18));
		display.setBounds(247, 250, 146, 27);
		contentPane.add(display);
		
		sizefield = new JTextField();
		sizefield.setBackground(new Color(211, 211, 211));
		sizefield.setFont(new Font("Cambria", Font.BOLD, 20));
		sizefield.setForeground(new Color(0, 0, 0));
		sizefield.setBounds(278, 78, 86, 27);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setBackground(new Color(211, 211, 211));
		element.setForeground(Color.BLACK);
		element.setFont(new Font("Cambria", Font.BOLD, 20));
		element.setColumns(10);
		element.setBounds(278, 133, 86, 27);
		contentPane.add(element);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(152, 251, 152));
		displaybox.setForeground(Color.BLACK);
		displaybox.setFont(new Font("Cambria", Font.BOLD, 20));
		displaybox.setColumns(10);
		displaybox.setBounds(139, 303, 342, 35);
		contentPane.add(displaybox);
		
			}

}
