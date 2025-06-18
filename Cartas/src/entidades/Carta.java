package entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado="N";
	
	public void mostrarCartaPalo() {
		System.out.println(numero+"-"+palo);
	}
	
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
