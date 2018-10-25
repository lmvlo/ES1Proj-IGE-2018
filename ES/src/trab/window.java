package trab;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class window {

	private JFrame frame;

	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public window() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1003, 708);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JButton btnNewButton_2 = new JButton("New button");
		
		JButton btnNewButton_3 = new JButton("Update");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(170)
					.addComponent(btnNewButton)
					.addGap(94)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
					.addComponent(btnNewButton_2)
					.addGap(176))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(411)
					.addComponent(btnNewButton_3)
					.addContainerGap(455, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(88)
					.addComponent(btnNewButton_3)
					.addPreferredGap(ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addGap(125))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
