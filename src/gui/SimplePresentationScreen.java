package gui;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;


	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 240));
		setResizable(false);
		setContentPane(contentPane);

		
		init();
	}
	
	private void init() {
		String fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy")
                .format(LocalDateTime.now());
		String hora = DateTimeFormatter.ofPattern("HH:mm:ss")
                .format(LocalDateTime.now());
		
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 172);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		textField = new JTextField(Integer.toString(studentData.getId()));
		textField.setColumns(10);
		
		textField_1 = new JTextField(studentData.getLastName());
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(studentData.getFirstName());
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(studentData.getMail());
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(studentData.getGithubURL());
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("LU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Github URL");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel_1_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1_1_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1_2)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		
		
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
	
		lblNewLabel_2 = new JLabel("Esta ventana fue generada el "+fecha+" a las "+hora );
		lblNewLabel_2.setBounds(5, 180, 425, 23);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/fotoSantiago.jpg")));
		lblNewLabel_3.setBounds(472, 39, 100, 100);
		contentPane.add(lblNewLabel_3);
	
	}
}
