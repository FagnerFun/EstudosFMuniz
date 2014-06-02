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

import com.sun.xml.internal.ws.api.message.Message;

import controle.CtrlFuncionario;
import sun.io.Converters;
import dominio.Vendedor;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class QualquerUm extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JTextField tfMatricula;
	private JTextField tfSalario;
	private JTextField tfComissao;
	private CtrlFuncionario controlador;
	
	public QualquerUm() {
		controlador = new CtrlFuncionario();
		setTitle("Vendedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 58, 46, 14);
		contentPane.add(lblNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(87, 55, 160, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCPF = new JTextField();
		tfCPF.setColumns(10);
		tfCPF.setBounds(87, 86, 160, 20);
		contentPane.add(tfCPF);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 89, 46, 14);
		contentPane.add(lblCpf);
		
		tfMatricula = new JTextField();
		tfMatricula.setEnabled(false);
		tfMatricula.setColumns(10);
		tfMatricula.setBounds(87, 117, 160, 20);
		contentPane.add(tfMatricula);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(10, 120, 67, 14);
		contentPane.add(lblMatricula);
		
		JButton btnCadastrar = new JButton("cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Random gerador = new Random();

				String nome = tfNome.getText();
				String cpf = tfCPF.getText();
				int matricula = gerador.nextInt();
				float salario =  Float.parseFloat(tfSalario.getText());
				float comissao = Float.parseFloat(tfComissao.getText());
				
				String retorno =  controlador.inserirFuncionario(nome, cpf,matricula , salario, comissao, "vendedor");
				
				tfMatricula.setText(Integer.toString(controlador.getUltimoFuncionario().getMatr()));
				JOptionPane.showMessageDialog(null,retorno);
			}
		});
		btnCadastrar.setBounds(87, 228, 89, 23);
		contentPane.add(btnCadastrar);
		
		JLabel label = new JLabel("Salario:");
		label.setBounds(10, 151, 46, 14);
		contentPane.add(label);
		
		tfSalario = new JTextField();
		tfSalario.setColumns(10);
		tfSalario.setBounds(87, 148, 160, 20);
		contentPane.add(tfSalario);
		
		tfComissao = new JTextField();
		tfComissao.setBounds(87, 179, 160, 20);
		contentPane.add(tfComissao);
		tfComissao.setColumns(10);
		
		JLabel lblComisso = new JLabel("Comiss\u00E3o:");
		lblComisso.setBounds(10, 182, 67, 14);
		contentPane.add(lblComisso);
	}
}
