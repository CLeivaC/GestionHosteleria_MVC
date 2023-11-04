package interfazHosteleriav3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dialogo extends JDialog implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Coordinador miCoordinador;
	
	private JLabel EnJornadas,EtipoMesa,EHabitaciones,EPMesa,EnHabitaciones;
	private JComboBox<Integer> nJornadas,nPMesa,nHabitaciones;
	private JComboBox<String> tipoMesa;
	private JCheckBox selectSi,selectNo;
	private JButton confReserva;
	
	
	public Dialogo() {
	
	setTitle("Confirmación de reserva");
	setSize(463, 341);
	setLocationRelativeTo(null);
	

	
	JPanel panel = new JPanel();
	panel.setBackground(Color.LIGHT_GRAY);
	panel.setLayout(null);
	
	
	
	
	EnJornadas = new JLabel("Número de jornadas");
	EnJornadas.setBounds(70, 20, 200, 50);
	
	
	EtipoMesa = new JLabel("Tipo de mesa");
	EtipoMesa.setBounds(280, 20, 200, 50);
	
	
	nJornadas = new JComboBox<Integer>();
	nJornadas.setBounds(70, 60, 100, 20);
	nJornadas.setMaximumRowCount(5);
	for(int i = 1; i<=50;i++) {
		nJornadas.addItem(i);
	}
	
	tipoMesa = new JComboBox<String>();
	tipoMesa.setBounds(280, 60, 100, 20);
	tipoMesa.addItem("Rectangular");
	tipoMesa.addItem("Redonda");
	
	
	EHabitaciones = new JLabel("Habitaciones");
	EHabitaciones.setBounds(70, 100, 200, 50);
	
	selectSi = new JCheckBox("Si");
	selectSi.setBounds(66, 140,40 , 20);
	selectSi.setBackground(Color.LIGHT_GRAY);
	
	selectNo = new JCheckBox("No");
	selectNo.setBounds(120, 140,40 , 20);
	selectNo.setBackground(Color.LIGHT_GRAY);
	
	ButtonGroup grupoCheck = new ButtonGroup();
	grupoCheck.add(selectSi);
	grupoCheck.add(selectNo);
	
	
	EPMesa = new JLabel("Personas por mesa");
	EPMesa.setBounds(280, 100, 200, 50);
	
	nPMesa = new JComboBox<Integer>();
	nPMesa.setBounds(280, 140, 100, 20);
	nPMesa.setMaximumRowCount(5);
	for(int i = 1; i<=50;i++) {
		nPMesa.addItem(i);
	}
	
	EnHabitaciones = new JLabel("Número habitaciones");
	EnHabitaciones.setBounds(70, 170, 200, 50);
	EnHabitaciones.setVisible(false);
	
	
	nHabitaciones = new JComboBox<Integer>();
	nHabitaciones.setBounds(70, 210, 100, 20);
	nHabitaciones.setMaximumRowCount(5);
	for(int i = 1; i<=50;i++) {
		nHabitaciones.addItem(i);
	}
	nHabitaciones.setVisible(false);
	
	
	confReserva = new JButton("Confirmar reserva");
	confReserva.setBounds(120, 250, 210, 40);
	confReserva.setBackground(Color.GRAY);
	confReserva.setBorder(new BotonRedondo(40));
	
	panel.add(EnJornadas);
	panel.add(EtipoMesa);
	panel.add(nJornadas);
	panel.add(tipoMesa);
	panel.add(EHabitaciones);
	panel.add(selectSi);
	panel.add(selectNo);
	panel.add(EPMesa);
	panel.add(nPMesa);
	panel.add(EnHabitaciones);
	panel.add(nHabitaciones);
	panel.add(confReserva);
	add(panel);
	setModal(true);
	
	confReserva.addActionListener(this);
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== confReserva) {
		
			JOptionPane.showMessageDialog(null,"Reserva confirmada.","Salon Habana",JOptionPane.DEFAULT_OPTION);
		}
	}


	public JComboBox<Integer> getnJornadas() {
		return nJornadas;
	}


	public void setnJornadas(JComboBox<Integer> nJornadas) {
		this.nJornadas = nJornadas;
	}


	public JComboBox<Integer> getnPMesa() {
		return nPMesa;
	}


	public void setnPMesa(JComboBox<Integer> nPMesa) {
		this.nPMesa = nPMesa;
	}


	public JComboBox<Integer> getnHabitaciones() {
		return nHabitaciones;
	}


	public void setnHabitaciones(JComboBox<Integer> nHabitaciones) {
		this.nHabitaciones = nHabitaciones;
	}


	public JComboBox<String> getTipoMesa() {
		return tipoMesa;
	}


	public void setTipoMesa(JComboBox<String> tipoMesa) {
		this.tipoMesa = tipoMesa;
	}


	public JCheckBox getSelectSi() {
		return selectSi;
	}


	public void setSelectSi(JCheckBox selectSi) {
		this.selectSi = selectSi;
	}


	public JCheckBox getSelectNo() {
		return selectNo;
	}


	public void setSelectNo(JCheckBox selectNo) {
		this.selectNo = selectNo;
	}


	public JButton getConfReserva() {
		return confReserva;
	}


	public void setConfReserva(JButton confReserva) {
		this.confReserva = confReserva;
	}

	
	

	public JLabel getEHabitaciones() {
		return EHabitaciones;
	}


	public void setEHabitaciones(JLabel eHabitaciones) {
		EHabitaciones = eHabitaciones;
	}


	public JLabel getEnHabitaciones() {
		return EnHabitaciones;
	}


	public void setEnHabitaciones(JLabel enHabitaciones) {
		EnHabitaciones = enHabitaciones;
	}


	public Coordinador getMiCoordinador() {
		return miCoordinador;
	}


	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}


	
	
	
	
}
