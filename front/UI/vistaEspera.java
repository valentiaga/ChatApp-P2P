package UI;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class vistaEspera extends JFrame implements IVistaModoEscucha {

	private JPanel contentPane;
	private ActionListener actionListener =null;
	private JButton btnVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaEspera frame = new vistaEspera();
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
	public vistaEspera() {
		setTitle("MODO ESCUCHA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setVisible(true);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Se encuentra en modo escucha");
		
		JLabel lblNewLabel_1 = new JLabel("Le notificaremos cuando alguien intente contactarlo...");
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(30);
		
		btnVolver = new JButton("Volver");
		btnVolver.setActionCommand("VOLVER");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(135))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(59, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(41))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(126, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(120))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(progressBar, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVolver, Alignment.TRAILING)))
		);
		contentPane.setLayout(gl_contentPane);
		//JOptionPane.showConfirmDialog(null, "El tiempo de espera ha finalizado. Desea intentar nuevamente?");
		JOptionPane.showConfirmDialog(null, "El usuario con puerto 1234 e IP 192.158.1.38 busca comunicarse. Desea conectarse?");
	}


	public void addActionListener(ActionListener actionListener) {
		this.actionListener = actionListener; 
		
	}

	public void mostrarVentana() {
		this.setVisible(true);
		
	}

	public void ConfirmarConexion() {
		// TODO Auto-generated method stub
		
	}

	public void Temporizador() {
		// TODO Auto-generated method stub
		
	}
}
