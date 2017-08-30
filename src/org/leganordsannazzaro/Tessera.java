package org.leganordsannazzaro;

public class Tessera {

	public int idTesserato;
	public int numero;
	public String tipo;
	public String anno;
	public String rilasciataDa;
	
	public Tessera(int idTesserato,int numero,String tipo,String anno,String rilasciataDa) {
		this.idTesserato=idTesserato;
		this.numero=numero;
		this.tipo=tipo;
		this.anno=anno;
		this.rilasciataDa=rilasciataDa;
	}
}
