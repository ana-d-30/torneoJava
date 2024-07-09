package torneoaf;

import javax.swing.JOptionPane;

public class Piloto {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("A","ciudad");
        Equipo equipo2 = new Equipo("B", "ciudadB");
        Goles cantidad_de_goles = new Goles();
        Partido partido = new Partido();
        JOptionPane.showMessageDialog(null, cantidad_de_goles.cant_gol(equipo));
       // cantidad_de_goles.cant_gol();
       JOptionPane.showMessageDialog(null, cantidad_de_goles.tiempo(equipo));
       partido.resultado(equipo, equipo2);
        
    }
}
