package servicios;

import java.util.ArrayList;
import entidades.Carta;
import entidades.Naipe;

public class Juego {
    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores = new ArrayList<>();
    private ArrayList<String> nombresJugadores;

    public void entregarCartas(int cartasPorJugador) {
        int cartaActual = 0;
        for (int i = 0; i < cartasPorJugador; i++) {
            for (int i1 = 0; i1 < cartasJugadores.size(); i1++) {
                Carta carta = naipeBarajado.get(cartaActual);
                cartasJugadores.get(i1).add(carta);
                cartaActual++;
            }
        }
    }
    
    public int devolverTotal(int indiceJugador) {
        int total = 0;
        ArrayList<Carta> cartasJugador = cartasJugadores.get(indiceJugador);
        for (Carta carta : cartasJugador) {
            total += carta.getNumero().getValor();
        }
        return total;
    }

    
    public String determinarGanador() {
        int maxPuntos = -1;
        int indiceGanador = -1;

        for (int i = 0; i < cartasJugadores.size(); i++) {
            int puntos = devolverTotal(i);
            if (puntos > maxPuntos) {
                maxPuntos = puntos;
                indiceGanador = i;
            }
        }
        return nombresJugadores.get(indiceGanador);
    }
    
    public Juego(ArrayList<String> idJugadores) {
        this.nombresJugadores = idJugadores; 

        for (int i = 0; i < idJugadores.size(); i++) {
            ArrayList<Carta> cartasJugador = new ArrayList<>();
            cartasJugadores.add(cartasJugador);
        }

        naipe = new Naipe();
        naipeBarajado = naipe.barajar();
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void setCartasJugadores(ArrayList<ArrayList<Carta>> cartasJugadores) {
        this.cartasJugadores = cartasJugadores;
    }

    public ArrayList<Carta> getNaipeBarajado() {
        return naipeBarajado;
    }

    public void setNaipeBarajado(ArrayList<Carta> naipeBarajado) {
        this.naipeBarajado = naipeBarajado;
    }
}