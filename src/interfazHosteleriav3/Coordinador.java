package interfazHosteleriav3;


public class Coordinador {

	private Logica miLogica;
	private Hosteleria miHosteleria;
	private Dialogo miDialogo;
	
	
	public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	public Hosteleria getMiHosteleria() {
		return miHosteleria;
	}
	public void setMiHosteleria(Hosteleria miHosteleria) {
		this.miHosteleria = miHosteleria;
	}
	
	public Dialogo getMiDialogo() {
		return miDialogo;
	}
	public void setMiDialogo(Dialogo miDialogo) {
		this.miDialogo = miDialogo;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void mostrarDialogo() {
		if(miLogica.comprobaciones()) {
			miDialogo.setVisible(true);
		}
	}
		
	
	
	public void deshabilitarOpciones() {
	
		miLogica.deshabilitarOpciones();
			
	}
	
	

	
	
}
