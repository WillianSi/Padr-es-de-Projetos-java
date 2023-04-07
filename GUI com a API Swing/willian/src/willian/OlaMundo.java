package willian;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class OlaMundo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundo window = new OlaMundo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OlaMundo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 509, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPrint = new JLabel("");
		lblPrint.setBackground(new Color(51, 255, 0));
		lblPrint.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrint.setFont(new Font("Impact", Font.PLAIN, 20));
		lblPrint.setForeground(new Color(153, 0, 204));
		lblPrint.setBounds(85, 77, 333, 37);
		frame.getContentPane().add(lblPrint);
		
		JButton btnAciona = new JButton("Clique");
		btnAciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPrint.setText("Olá mundo Java GUI");
			}
		});
		btnAciona.setBackground(Color.LIGHT_GRAY);
		btnAciona.setFont(new Font("Impact", Font.PLAIN, 13));
		btnAciona.setForeground(new Color(102, 0, 204));
		btnAciona.setBounds(208, 146, 89, 23);
		frame.getContentPane().add(btnAciona);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPrint.setText("");
			}
		});
		btnLimpar.setForeground(new Color(102, 0, 204));
		btnLimpar.setFont(new Font("Impact", Font.PLAIN, 13));
		btnLimpar.setBackground(Color.LIGHT_GRAY);
		btnLimpar.setBounds(208, 182, 89, 23);
		frame.getContentPane().add(btnLimpar);
	}
}
