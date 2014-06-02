package face;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnVendedor = new JButton("Vendedor");
		btnVendedor.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Menu.dispose();  
				new QualquerUm().setVisible(true);
			}
		});
		contentPane.add(btnVendedor);
		
		JButton btnDiretor = new JButton("Diretor");
		btnDiretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new QualquerOutro().setVisible(true);
			}
		});
		btnDiretor.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(btnDiretor);
	}

}
