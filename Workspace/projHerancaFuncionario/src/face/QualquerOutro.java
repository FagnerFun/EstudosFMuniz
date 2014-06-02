package face;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import controle.CtrlFuncionario;
import dominio.Diretor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class QualquerOutro extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfSalario;
	private JTextField tfMatricula;
	private JTextField tfBonificação;
	
	private CtrlFuncionario controlador;

	/**
	 * Create the frame.
	 */
	public QualquerOutro() {
		controlador = new CtrlFuncionario();
		
		setTitle("Diretor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 44, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 75, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(10, 106, 46, 14);
		contentPane.add(lblSalario);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(10, 131, 58, 14);
		contentPane.add(lblMatricula);
		
		JLabel lblBonificao = new JLabel("Bonifica\u00E7\u00E3o:");
		lblBonificao.setBounds(8, 168, 58, 14);
		contentPane.add(lblBonificao);
		
		tfNome = new JTextField();
		tfNome.setBounds(76, 41, 200, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(76, 72, 200, 20);
		contentPane.add(tfCPF);
		tfCPF.setColumns(10);
		
		tfSalario = new JTextField();
		tfSalario.setBounds(76, 103, 200, 20);
		contentPane.add(tfSalario);
		tfSalario.setColumns(10);
		
		tfMatricula = new JTextField();
		tfMatricula.setEnabled(false);
		tfMatricula.setBounds(76, 134, 200, 20);
		contentPane.add(tfMatricula);
		tfMatricula.setColumns(10);
		
		tfBonificação = new JTextField();
		tfBonificação.setBounds(76, 165, 200, 20);
		contentPane.add(tfBonificação);
		tfBonificação.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Random gerador = new Random();

				String nome = tfNome.getText();
				String cpf = tfCPF.getText();
				int matricula = gerador.nextInt();
				float salario =  Float.parseFloat(tfSalario.getText());
				float bonificacao = Float.parseFloat(tfBonificação.getText());
				
				String retorno =  controlador.inserirFuncionario(nome, cpf,matricula , salario, bonificacao, "Diretor");
				
				tfMatricula.setText(Integer.toString(controlador.getUltimoFuncionario().getMatr()));
				JOptionPane.showMessageDialog(null,retorno);
			}
		});
		btnCadastrar.setBounds(76, 196, 89, 23);
		contentPane.add(btnCadastrar);
	}

}
