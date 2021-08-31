package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import entities.FechaHoraActual;

import javax.swing.JTabbedPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNombre;
	private JTextField textFieldGithub;
	private JTextField textFieldEmail;
	private JTextField textFieldApellido;
	private JTextField textFieldNombre;
	private JTextField textFieldLegajo;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(700, 275));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(440, 250));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		//LABELS
		JLabel lblLu = new JLabel("LU:");
		lblLu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblGithuburl = new JLabel("Github-URL:");
		lblGithuburl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		//Imagen
		JLabel lblImagen = new JLabel("");
		lblImagen.setSize(new Dimension(200, 200));
		ImageIcon iconCara = new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto()));
		Image fotoEscalada = iconCara.getImage().getScaledInstance(-1,lblImagen.getHeight(), Image.SCALE_SMOOTH);
		iconCara.setImage(fotoEscalada);
		lblImagen.setIcon(iconCara);
		
		//Fecha y hora
		FechaHoraActual fecha = new FechaHoraActual();
		JLabel lblFechaHora = new JLabel(fecha.getMensajeFecha());
		lblFechaHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		//TEXTFIELDS
		textFieldLegajo = new JTextField(String.valueOf(studentData.getId()));
		textFieldLegajo.setColumns(10);
		
		textFieldNombre = new JTextField(studentData.getFirstName());
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField(studentData.getLastName());
		textFieldApellido.setColumns(10);
		
		textFieldEmail = new JTextField(studentData.getMail());
		textFieldEmail.setColumns(10);
		
		textFieldGithub = new JTextField(studentData.getGithubURL());
		textFieldGithub.setColumns(10);

		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblLu, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addComponent(textFieldLegajo, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addComponent(textFieldApellido, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGithuburl, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textFieldGithub)
								.addComponent(textFieldEmail, GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLu, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldLegajo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGithuburl, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(textFieldGithub, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(152, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblImagen, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
						.addComponent(lblFechaHora, GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblImagen, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblFechaHora, GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
