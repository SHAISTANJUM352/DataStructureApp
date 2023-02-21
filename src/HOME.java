import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HOME extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HOME frame = new HOME();
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
	public HOME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new CompoundBorder(new EmptyBorder(2, 2, 2, 2), new LineBorder(new Color(171, 173, 179))));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE  DATASTRUCTURE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel.setBounds(107, 26, 268, 47);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place array window opening  code 
			new Array().setVisible(true);				
			}
		});
		array.setBackground(new Color(144, 238, 144));
		array.setForeground(new Color(128, 0, 0));
		array.setFont(new Font("Cambria", Font.BOLD, 18));
		array.setBounds(161, 84, 150, 33);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place stack window opening code here
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(128, 0, 0));
		stack.setFont(new Font("Cambria", Font.BOLD, 18));
		stack.setBackground(new Color(144, 238, 144));
		stack.setBounds(21, 138, 204, 33);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place queue window opening code here
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(128, 0, 0));
		queue.setFont(new Font("Cambria", Font.BOLD, 18));
		queue.setBackground(new Color(144, 238, 144));
		queue.setBounds(257, 138, 204, 33);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place circular queue window opening  code 
				new circularqueue().setVisible(true);	
			}
		});
		cqueue.setForeground(new Color(128, 0, 0));
		cqueue.setFont(new Font("Cambria", Font.BOLD, 18));
		cqueue.setBackground(new Color(144, 238, 144));
		cqueue.setBounds(21, 207, 204, 33);
		contentPane.add(cqueue);
		
		JButton sll = new JButton("SINGLYLINKEDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place singly linked list window opening  code 
				new singlyll().setVisible(true);	
			}
		});
		sll.setForeground(new Color(128, 0, 0));
		sll.setFont(new Font("Cambria", Font.BOLD, 18));
		sll.setBackground(new Color(144, 238, 144));
		sll.setBounds(257, 207, 204, 33);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLYLINKEDLIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//place doubly linked list window opening  code 
				new doublyll().setVisible(true);	
			}
		});
		dll.setForeground(new Color(128, 0, 0));
		dll.setFont(new Font("Cambria", Font.BOLD, 18));
		dll.setBackground(new Color(144, 238, 144));
		dll.setBounds(125, 272, 246, 33);
		contentPane.add(dll);
	}
}
