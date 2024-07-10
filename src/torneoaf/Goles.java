package torneoaf;

import java.util.LinkedList;

public class Goles {
    private LinkedList<Equipo> equipos = new LinkedList<>();
    
    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public int cant_gol(Equipo A){
        int goles = (int)(Math.random()*5);
        return goles;
    }

}
