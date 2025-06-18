package entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles=new ArrayList<>();
	private ArrayList<Carta> cartas=new ArrayList<>();
	
	
	public ArrayList<Carta> barajar() {
	    ArrayList<Carta> auxiliar = new ArrayList<>();
	    Palos palos = new Palos();

	    // Jugador 1: 5 + 5 + 5 + 5 + 4 = 24
	    auxiliar.add(new Carta(new Numero("5", 5), palos.getTrebol()));
	    auxiliar.add(new Carta(new Numero("10", 10), palos.getTrebol())); 
	    auxiliar.add(new Carta(new Numero("7", 7), palos.getTrebol()));  

	    auxiliar.add(new Carta(new Numero("5", 5), palos.getTrebol()));
	    auxiliar.add(new Carta(new Numero("10", 10), palos.getTrebol()));
	    auxiliar.add(new Carta(new Numero("7", 7), palos.getTrebol()));

	    auxiliar.add(new Carta(new Numero("5", 5), palos.getTrebol()));
	    auxiliar.add(new Carta(new Numero("10", 10), palos.getTrebol()));
	    auxiliar.add(new Carta(new Numero("7", 7), palos.getTrebol()));

	    auxiliar.add(new Carta(new Numero("5", 5), palos.getTrebol()));
	    auxiliar.add(new Carta(new Numero("10", 10), palos.getTrebol()));
	    auxiliar.add(new Carta(new Numero("7", 7), palos.getTrebol()));

	    auxiliar.add(new Carta(new Numero("4", 4), palos.getTrebol()));   
	    auxiliar.add(new Carta(new Numero("2", 2), palos.getTrebol()));   
	    auxiliar.add(new Carta(new Numero("7", 7), palos.getTrebol()));   

	    return auxiliar;
	}
	
	public Naipe() {
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		Palos palos = new Palos();
		for(int i=0;i<numerosPosibles.size();i++) {
			Numero elementoPosibles=numerosPosibles.get(i);
			cartas.add(new Carta(elementoPosibles,palos.getCorazonNegro()));
			cartas.add(new Carta(elementoPosibles,palos.getCorazonRojo()));
			cartas.add(new Carta(elementoPosibles,palos.getDiamante()));
			cartas.add(new Carta(elementoPosibles,palos.getTrebol()));
		}
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}
}
