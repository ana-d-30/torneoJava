package torneoaf;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorEquipos {
    private LinkedList<Equipo> equipos = new LinkedList<>();

    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString(){
        return "\nGestorEquipo [equipos=" + equipos + "]";
    }

    public void jugar(Equipo equipo1, Equipo equipo2){
        JOptionPane.showMessageDialog(null, "Se enfrentan " + equipo1.getNombre() + " vs " + equipo2.getNombre());
			
			int goles1;
			int goles2;
			do {
				goles1 = (int)(Math.random()*5);
				goles2 = (int)(Math.random()*5);
				if (goles1==goles2) {
					JOptionPane.showMessageDialog(null, "Hay penales");
				}
			} while (goles1==goles2);

			if (goles1>goles2) {
				
				JOptionPane.showMessageDialog(null, "Gano equipo 1");
			} else {
				
				JOptionPane.showMessageDialog(null, "Gano equipo 2");
			}
    }

    public void agregarE(){
        //Equipo grupo6 = new Equipo("Racin", "CIUDAD1");
        //Equipo grupo7 = new Equipo("Independiente", "CIUDAD2");
        Jugador jugador_agregado1 = new Jugador("Messi", "Delantero", 10, 25);
        Jugador jugador_agregado = new Jugador("Leo", "Delantero", 10, 25);
        this.getEquipos().add(new Equipo("Racing", "CIUDAD1"));
        this.getEquipos().add(new Equipo("Boca", "CIUDAD2"));
        this.getEquipos().add(new Equipo("River", "CIUDAD3"));

        this.getEquipos().get(0).getJugadores().add(jugador_agregado);
        this.getEquipos().get(1).getJugadores().add(jugador_agregado1);
        this.getEquipos().get(2).getJugadores().add(jugador_agregado);
        JOptionPane.showMessageDialog(null, "Equipos generados "+equipos);
    }

    public void buscarE(String nombre_equipo){
    	boolean encontrado = false;

        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombre_equipo)) {
                JOptionPane.showMessageDialog(null, "Se ha encontrado al Equipo " + equipo);
                encontrado = true;
                break; // Salir del bucle 
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el Equipo");
        }
    }
    public void eliminarE(int can_eliminado){
        if(can_eliminado>0){
            for (int j = 0; j < can_eliminado; j++){
                this.getEquipos().removeLast();
            }
            JOptionPane.showMessageDialog(null, "Cantidad de equipos que quedan son "+equipos.size());

        }
    }
    
   // public void agregar_equipos()

}
