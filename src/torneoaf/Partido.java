package torneoaf;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Partido {
    private LinkedList<Equipo> equipos = new LinkedList<>();

    public LinkedList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(LinkedList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Equipo resultado(Equipo equipo1, Equipo equipo2){
        JOptionPane.showMessageDialog(null, "Se enfrentan " + equipo1.getNombre() + " vs " + equipo2.getNombre());
			Goles gol_es1 = new Goles();
            Goles gol_es2 = new Goles();
            int goles1=0;
            int goles2=0;
            boolean penal = false;
			do {
				goles1=gol_es1.cant_gol(equipo1);
				goles2 =gol_es2.cant_gol(equipo2);
				if (goles1==goles2) {
					//JOptionPane.showMessageDialog(null, "Hay penales");
                    penal = true;
				}
			} while (goles1==goles2);

			if (goles1>goles2) {
				if (penal) {
                    JOptionPane.showMessageDialog(null, "Gano equipo 1\nHubo penales \nCantidad de goles de equipo 1: "+goles1+"\nCantidad de goles de equipo 2: " + goles2);
                    return equipo1;
                }else{
				JOptionPane.showMessageDialog(null, "Gano equipo 1\nCantidad de goles de equipo 1: "+goles1+"\nCantidad de goles de equipo 2: " + goles2);
                return equipo1;
                }
			} else {
                if (penal) {
                    JOptionPane.showMessageDialog(null, "Gano equipo 2\nHubo penales \nCantidad de goles de equipo 1: "+goles1+"\nCantidad de goles de equipo 2: " + goles2);
                    return equipo2;
                }
				JOptionPane.showMessageDialog(null, "Gano equipo 2\nCantidad de goles de equipo 1: "+goles1+"\nCantidad de goles de equipo 2: " + goles2);
                return equipo2;
			}

    }


}

