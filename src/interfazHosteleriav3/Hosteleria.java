package interfazHosteleriav3;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import com.toedter.calendar.JDateChooser;

public class Hosteleria extends JFrame implements ActionListener,ItemListener {

	/**
	 * 
	 */
	private Coordinador miCoordinador;
	private static final long serialVersionUID = 1L;
	//COMPONENTES VENTANA PRINCIPAL
	private ImageIcon icon;
	private JLabel imagen, titulo, etiquetaNombre, etiquetaTelefono, fecha, etiquetaReserva, etiquetaPersona, etiquetaCocina;
	private JTextField nombre, telefono;
	private JDateChooser dateChooser;
	private JComboBox<String> reservas, cocina;
	private JComboBox<Integer> personas;
	
	
	
	//Container panel = getContentPane();
	JPanel panel =  (JPanel) getContentPane();

	private  JButton btnReserva;
	
	String tipoReservas = "Banquete";
	int nPersonas = 0;
	String tipoCocina = null;
	

	public Hosteleria() {
		
		icon = new ImageIcon("src/Platos_Hosteleria2.png");
		imagen = new JLabel(icon);
		imagen.setBounds(0, 0, 600, 500);
		panel.setLayout(null);
		panel.add(imagen);

		titulo = new JLabel("Salon Habana");
		titulo.setBounds(665, 20, 200, 50);
		titulo.setFont(new Font("Blackadder ITC", Font.BOLD, 30));
		panel.add(titulo);

		etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setBounds(630, 100, 200, 50);
		panel.add(etiquetaNombre);

		etiquetaTelefono = new JLabel("Telefono");
		etiquetaTelefono.setBounds(800, 100, 200, 50);
		panel.add(etiquetaTelefono);

		nombre = new JTextField();
		nombre.setBounds(630, 140, 100, 20);
		panel.add(nombre);

		telefono = new JTextField();
		telefono.setBounds(800, 140, 100, 20);
		panel.add(telefono);

		fecha = new JLabel("Fecha");
		fecha.setBounds(630, 140, 100, 100);
		panel.add(fecha);

		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(630, 210, 270, 30);
		dateChooser.setDateFormatString("dd/MM/yyyy hh:mm");
		panel.add(dateChooser);

		etiquetaReserva = new JLabel("Tipo reserva");
		etiquetaReserva.setBounds(630, 250, 200, 50);
		panel.add(etiquetaReserva);

		etiquetaPersona = new JLabel("Personas");
		etiquetaPersona.setBounds(800, 250, 200, 50);
		panel.add(etiquetaPersona);

		reservas = new JComboBox<String>();
		reservas.setBounds(630, 290, 100, 20);
		reservas.addItem("Banquete");
		reservas.addItem("Jornada");
		reservas.addItem("Congreso");
		reservas.addItemListener(this);
		panel.add(reservas);

		personas = new JComboBox<Integer>();
		personas.setBounds(800, 290, 100, 20);
		
		for(int i = 1; i<=50;i++) {
			personas.addItem(i);
		}
		personas.setMaximumRowCount(5);
		personas.addItemListener(this);
		panel.add(personas);

		etiquetaCocina = new JLabel("Tipo cocina");
		etiquetaCocina.setBounds(735, 320, 200, 50);
		panel.add(etiquetaCocina);

		cocina = new JComboBox<String>();
		cocina.setBounds(725, 360, 100, 20);
		cocina.addItem("Bufet");
		cocina.addItem("Carta");
		cocina.addItem("Cita con chef");
		cocina.addItem("No precisa");
		cocina.addItemListener(this);
		panel.add(cocina);

		btnReserva = new JButton("Continuar con la reserva");
		btnReserva.setBounds(645, 400, 250, 40);
		btnReserva.setBackground(Color.GRAY);
		btnReserva.setBorder(new BotonRedondo(40));
		panel.add(btnReserva);

		panel.setBackground(Color.LIGHT_GRAY);	

		btnReserva.addActionListener(this);
		
		setTitle("Salon Habana");
		setVisible(true);
		setSize(950, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		miCoordinador.deshabilitarOpciones();
		miCoordinador.mostrarDialogo();
	
	
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==reservas) {
			setTipoReservas(reservas.getSelectedItem().toString());
			
		}
		
		if(e.getSource()==personas) {
			nPersonas = Integer.parseInt(personas.getSelectedItem().toString());
			
		}
		
		if(e.getSource()==cocina) {
			tipoCocina = cocina.getSelectedItem().toString();
			
		}
		
	}

	
	public String getTipoReservas() {
		return tipoReservas;
	}




	public void setTipoReservas(String tipoReservas) {
		this.tipoReservas = tipoReservas;
	}




	public int getnPersonas() {
		return nPersonas;
	}




	public void setnPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}




	public String getTipoCocina() {
		return tipoCocina;
	}




	public void setTipoCocina(String tipoCocina) {
		this.tipoCocina = tipoCocina;
	}


	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	public JLabel getFecha() {
		return fecha;
	}

	public void setFecha(JLabel fecha) {
		this.fecha = fecha;
	}

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JTextField getTelefono() {
		return telefono;
	}

	public void setTelefono(JTextField telefono) {
		this.telefono = telefono;
	}

	public JDateChooser getDateChooser() {
		return dateChooser;
	}

	public void setDateChooser(JDateChooser dateChooser) {
		this.dateChooser = dateChooser;
	}

	public JComboBox<String> getReservas() {
		return reservas;
	}

	public void setReservas(JComboBox<String> reservas) {
		this.reservas = reservas;
	}

	public JComboBox<String> getCocina() {
		return cocina;
	}

	public void setCocina(JComboBox<String> cocina) {
		this.cocina = cocina;
	}

	public JComboBox<Integer> getPersonas() {
		return personas;
	}

	public void setPersonas(JComboBox<Integer> personas) {
		this.personas = personas;
	}

	public JButton getBtnReserva() {
		return btnReserva;
	}

	public  void setBtnReserva(JButton btnReserva) {
		this.btnReserva = btnReserva;
	}





	
	
	
	
	
	
	

}
