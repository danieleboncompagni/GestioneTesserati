package org.leganordsannazzaro;

public class Tesserato {

	public int idTesserato;
	public String nome;
	public String cognome;
	public String dataNascita;
	public String luogoNascita;
	public String comuneResidenza;
	public String indirizzo;
	public String telefono;
	public String email;
	
	public Tesserato(int id,String nome,String cognome,String dataNascita,String luogoNascita,String comuneResidenza,String indirizzo,String telefono,String email) {
		this.idTesserato=id;
		this.nome=nome;
		this.cognome=cognome;
		this.dataNascita=dataNascita;
		this.luogoNascita=luogoNascita;
		this.comuneResidenza=comuneResidenza;
		this.indirizzo=indirizzo;
		this.telefono=telefono;
		this.email=email;
	}
	
}
