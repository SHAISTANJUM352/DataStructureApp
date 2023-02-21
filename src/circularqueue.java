import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;

public class circularqueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[], size, r=-1, f=0, count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					circularqueue frame = new circularqueue();
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
	public circularqueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 130, 238));
		contentPane.setBorder(new CompoundBorder());

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE  DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(101, 25, 368, 27);
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
				cq=new int[size];
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
				if(count == size) {
					JOptionPane.showMessageDialog(contentPane, "Push not possible");
				}
				else {
					elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
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
				if(count == 0) {
					JOptionPane.showMessageDialog(contentPane, "pop not possible");
				}
				else {
					String message="Element deleted is"+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
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
				int f1=f;
				String msg="";
				if(count == 0) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=1;i<=count;i++) {
						msg=msg+" "+cq[i];
						f1=(f1+1)%size;
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
		sizefield.setBackground(new Color(220, 220, 220));
		sizefield.setFont(new Font("Cambria", Font.BOLD, 20));
		sizefield.setBounds(278, 78, 86, 24);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		element = new JTextField();
		element.setFont(new Font("Cambria", Font.BOLD, 20));
		element.setColumns(10);
		element.setBackground(new Color(220, 220, 220));
		element.setBounds(278, 135, 86, 24);
		contentPane.add(element);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(0, 0, 0));
		displaybox.setFont(new Font("Cambria", Font.BOLD, 20));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(144, 238, 144));
		displaybox.setBounds(186, 302, 269, 31);
		contentPane.add(displaybox);
		
	}
}
