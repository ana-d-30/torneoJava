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

    public String jugarFase() {
        LinkedList<Equipo> ganadores = new LinkedList<>();
        int numeroFase = 1;

        while (partidos.size() > 1) {
            JOptionPane.showMessageDialog(null, "Comienza la fase " + numeroFase);
            for (Partido partido : partidos) {
                Equipo equipo1 = partido.getEquipos().get(0);
                Equipo equipo2 = partido.getEquipos().get(1);
                Equipo ganador = partido.resultado(equipo1, equipo2);
                ganadores.add(ganador);
                JOptionPane.showMessageDialog(null, "El ganador del partido es: " + ganador.getNombre());
            }

            // Preparar para la siguiente fase
            partidos.clear();
            for (int i = 0; i < ganadores.size(); i += 2) {
                Partido nuevoPartido = new Partido();
                nuevoPartido.getEquipos().add(ganadores.get(i));
                nuevoPartido.getEquipos().add(ganadores.get(i + 1));
                agregarPartido(nuevoPartido);
            }
            ganadores.clear();
            numeroFase++;
        }

        // Jugar la fase final
        JOptionPane.showMessageDialog(null, "Comienza la fase final");
        Equipo equipo1 = partidos.get(0).getEquipos().get(0);
        Equipo equipo2 = partidos.get(0).getEquipos().get(1);
        Equipo ganadorFinal = partidos.get(0).resultado(equipo1, equipo2);
        JOptionPane.showMessageDialog(null, "El ganador del torneo es: " + ganadorFinal.getNombre());
        return ganadorFinal.getNombre();
    }
}