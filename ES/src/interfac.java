import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;



public class interfac {
	
	
	private JFrame frame;

	public interfac() {
		frame = new JFrame("BDA");
		

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		

		frame.setLayout(new FlowLayout());
		
		addFrameContent();
		
		frame.pack();
	}

	
	public void addFrameContent() {
		
		frame.setLayout(new GridLayout(3,0));

//		JLabel label = new JLabel("label");
	//	frame.add(label);

//		JTextField text = new JTextField("text");
	//	frame.add(text);
		
//		JCheckBox check = new JCheckBox("check");
	//	frame.add(check);
		
		JButton button = new JButton("Update");

		JButton button1 = new JButton("Twitter");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("dkdkd");
			}
		});
	
				
		JButton button2 = new JButton("Facebook");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("dkdkd");
			}
		});
		frame.add(button);	
	}
		
		
		
	
	public void open() {
		// para abrir a janela (torna-la visivel)
		frame.setVisible(true);
	}


	public static void main(String[] args) {
		interfac window = new interfac();
		window.open();
		// TODO Auto-generated method stub

	}

}
