import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExercicioUnidade1 extends JFrame implements ActionListener{
	
	private JLabel labelName;
	private JTextField inputText;
	private JButton buttonFood, buttonSendFood, buttonSetBlue, buttonClick, buttonOut;
	private JPanel panel;
	
	public ExercicioUnidade1() {
		this.setTitle("Favorite Food");
		this.setSize(480, 260);
		this.setLocation(700, 400);
		this.setResizable(false);
		
		labelName = new JLabel("Comida Favorita", JLabel.RIGHT);
		
		inputText = new JTextField(30);
		inputText.setToolTipText("Digite a Sua Comida Favorita!");
		
		buttonFood = new JButton("Comida");
		buttonFood.setMnemonic('F');
		buttonFood.setToolTipText("Clique aqui para mostrar a Comida Favorita!");
		buttonFood.addActionListener(this);
		
		buttonSendFood = new JButton("Informar Comida");
		buttonSendFood.setMnemonic('I');
		buttonSendFood.setToolTipText("Clique aqui para Informar a Comida Favorita!");
		buttonSendFood.addActionListener(this);
		
		buttonSetBlue = new JButton("Azul");
		buttonSetBlue.setMnemonic('A');
		buttonSetBlue.setToolTipText("Clique aqui para Alterar o Fundo da tela!");
		buttonSetBlue.addActionListener(this);
		
		buttonClick = new JButton("Click");
		buttonClick.setMnemonic('C');
		buttonClick.addActionListener(this);
		
		buttonOut = new JButton("Sair");
		buttonOut.setMnemonic('S');
		buttonOut.setToolTipText("Clique aqui para Sair da Tela!");
		buttonOut.addActionListener(this);
		
		panel = new JPanel();
		panel.add(labelName);
		panel.add(inputText);
		
		panel.add(buttonFood);
		panel.add(buttonSendFood);
		panel.add(buttonSetBlue);
		panel.add(buttonClick);
		panel.add(buttonOut);
		
		add(panel);
		
	}
	
	public void actionPerformed(ActionEvent evento) {
		Object buttonClicked = evento.getSource();
		
		if(buttonClicked == buttonSetBlue) {
			panel.setBackground(Color.BLUE);
		} else if(buttonClicked == buttonFood) {
			if(inputText.getText().length() > 0) {
				
				JOptionPane.showMessageDialog(null, "Comida Favorita: " + inputText.getText(), "Comida", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Informe uma Comida Favorita", "Comida", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}else if(buttonClicked == buttonSendFood) {
			String nome = JOptionPane.showInputDialog(null, "Informe a Comida Favorita", "Nome", JOptionPane.QUESTION_MESSAGE);
			inputText.setText(nome);
		}else if(buttonClicked == buttonClick) {
			JOptionPane.showMessageDialog(null, "Botão Click foi Pressionado!", "Click", JOptionPane.INFORMATION_MESSAGE);
		}else {
			Object[] opcoes = {"Sim", "Não"};
			
			int retorno = JOptionPane.showOptionDialog(null, 
					"Tem Certeza que Deseja Fechar o Software?", 
					"Fechar", 
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE, null,opcoes, opcoes[0]);
			
			if(retorno == 0) {
				System.exit(0);
			}
		}
		
		
	}

	
	

	public static void main(String[] args) {
		ExercicioUnidade1 exercicio = new ExercicioUnidade1();
		exercicio.setVisible(true);

	}

}
