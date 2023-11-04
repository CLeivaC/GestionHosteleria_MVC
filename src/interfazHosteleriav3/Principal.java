package interfazHosteleriav3;



public class Principal {

	Logica miLogica;
	Coordinador miCoordinador;
	Hosteleria miHosteleria;
	Dialogo miDialogo;
	
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.iniciar();
		
	}
	
	
	public void iniciar() {
		
		miLogica = new Logica();
		miCoordinador = new Coordinador();
		miHosteleria = new Hosteleria();
		miDialogo = new Dialogo();
		
		miHosteleria.setMiCoordinador(miCoordinador);
		miLogica.setMiCoordinador(miCoordinador);
		miDialogo.setMiCoordinador(miCoordinador);
		
		miCoordinador.setMiHosteleria(miHosteleria);
		miCoordinador.setMiLogica(miLogica);
		miCoordinador.setMiDialogo(miDialogo);
		
		
		
	}
}
