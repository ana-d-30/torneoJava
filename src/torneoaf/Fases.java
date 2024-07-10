package torneoaf;

import javax.swing.JOptionPane;
import java.util.LinkedList;

public class Fases {

    private LinkedList<Partido> partidos;

    public Fases() {
        this.partidos = new LinkedList<>();
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void jugarFase() {
        int numeroFase = 1;
        for (Partido partido : partidos) {
            JOptionPane.showMessageDialog(null, "Comienza la fase " + numeroFase);
            Equipo equipo1 = partido.getEquipos().get(0);
            Equipo equipo2 = partido.getEquipos().get(1);
            Equipo ganador = partido.resultado(equipo1, equipo2);
            JOptionPane.showMessageDialog(null, "El ganador de la fase " + numeroFase + " es: " + ganador.getNombre());
            numeroFase++;
        }
    }
}