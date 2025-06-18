package servicios;

import java.util.ArrayList;
import entidades.Carta;

public class Jugadores {
    private ArrayList<String> nombreJugadores = new ArrayList<>();

    public void jugar() {
        ArrayList<String> jugadores = new ArrayList<>();
        jugadores.add("Jugador 1");
        jugadores.add("Jugador 2");
        jugadores.add("Jugador 3");

        Juego juego = new Juego(jugadores);
        juego.entregarCartas(5);

        System.out.println("Resultados de la partida:");
        ArrayList<ArrayList<Carta>> cartasJugadores = juego.getCartasJugadores();
        ArrayList<Integer> totales = new ArrayList<>();

        for (int i = 0; i < cartasJugadores.size(); i++) {
            ArrayList<Carta> cartas = cartasJugadores.get(i);
            int total = 0;
            for (Carta carta : cartas) {
                total += carta.getNumero().getValor();
            }
            System.out.println(jugadores.get(i) + " - Total: " + total);
            totales.add(total);
        }

        int max = totales.get(0);
        int indiceGanador = 0;
        for (int i = 1; i < totales.size(); i++) {
            if (totales.get(i) > max) {
                max = totales.get(i);
                indiceGanador = i;
            }
        }

        String ganador = jugadores.get(indiceGanador);
        System.out.println("El ganador es: " + ganador + " con un total de " + max);
    }

    public ArrayList<String> getNombreJugadores() {
        return nombreJugadores;
    }

    public void setNombreJugadores(ArrayList<String> nombreJugadores) {
        this.nombreJugadores = nombreJugadores;
    }
}