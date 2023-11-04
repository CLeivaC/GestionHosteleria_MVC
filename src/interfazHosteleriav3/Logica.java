package interfazHosteleriav3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;


public class Logica {
	
	private Coordinador miCoordinador;

	public Coordinador getMiCoordinador() {
		return miCoordinador;
	}

	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private boolean comprobacionNombre() {
		boolean comprobar = false;
		 Pattern pat = Pattern.compile("[a-zA-Z]*");
	     Matcher mat = pat.matcher(miCoordinador.getMiHosteleria().getNombre().getText());  
								
				if(mat.matches() && !miCoordinador.getMiHosteleria().getNombre().getText().isBlank()) {
					
					comprobar = true;
					
					
				}else {
					JOptionPane.showMessageDialog(null,"El nombre solo permite letras","Advertencia",JOptionPane.WARNING_MESSAGE);
				}
				
				return comprobar;

	}
	
	private boolean comprobarTelefono() {
			boolean comprobar = false;
			Pattern pat = Pattern.compile("[0-9]{9}");
			Matcher mat = pat.matcher(miCoordinador.getMiHosteleria().getTelefono().getText());  
								
				if(mat.matches() && !miCoordinador.getMiHosteleria().getTelefono().getText().isBlank()) {
					comprobar = true;
					
					
				}else {
					JOptionPane.showMessageDialog(null,"El telefono introducido es incorrecto.(ej: 654321232)","Advertencia",JOptionPane.WARNING_MESSAGE);
				}

		return comprobar;
	}
	
	public void deshabilitarOpciones() {
		
		
			
			if(miCoordinador.getMiHosteleria().getTipoReservas().equals("Banquete")) {
				
				miCoordinador.getMiDialogo().getnPMesa().setEnabled(false);
				miCoordinador.getMiDialogo().getTipoMesa().setEnabled(false);
				
				checkListeners();
				
				
			}else if(miCoordinador.getMiHosteleria().getTipoReservas().equals("Congreso")) {
				
				miCoordinador.getMiDialogo().getnJornadas().setEnabled(false);
				miCoordinador.getMiDialogo().getSelectSi().setEnabled(false);
				miCoordinador.getMiDialogo().getSelectNo().setEnabled(false);
				miCoordinador.getMiDialogo().getnHabitaciones().setEnabled(false);
				
			}else {
				checkListeners();
			}
			
	}
	
	private void checkListeners() {
		
		miCoordinador.getMiDialogo().getSelectSi().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				miCoordinador.getMiDialogo().getEnHabitaciones().setVisible(true);
				miCoordinador.getMiDialogo().getnHabitaciones().setVisible(true);
				
			}
		});
		
		
		miCoordinador.getMiDialogo().getSelectNo().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				miCoordinador.getMiDialogo().getEnHabitaciones().setVisible(false);
				miCoordinador.getMiDialogo().getnHabitaciones().setVisible(false);
				
			}
		});
	}
	
	
	public boolean comprobaciones() {
		
		boolean comprobar = false;
		
		if(comprobacionNombre() == false) {
			
			JOptionPane.showMessageDialog(null,"El nombre solo permite letras","Advertencia",JOptionPane.WARNING_MESSAGE);
		}else if(comprobarTelefono() == false) {
			JOptionPane.showMessageDialog(null,"El telefono introducido es incorrecto.(ej: 654321232)","Advertencia",JOptionPane.WARNING_MESSAGE);
		}else if(comprobacionNombre() == false && comprobarTelefono() == false) {
			JOptionPane.showMessageDialog(null,"Campos incorrectos","Advertencia",JOptionPane.WARNING_MESSAGE);
		}else if (comprobacionNombre() == true && comprobarTelefono() == true) {
			comprobar = true;
		}
		
		return comprobar;
		
	}
	
	

	
	

}
