package torneoaf;

import javax.swing.JOptionPane;

public class Piloto {
    public static void main(String[] args) {
        //Equipo equipo = new Equipo("A","ciudad");
        //Equipo equipo2 = new Equipo("B", "ciudadB");
        //Goles cantidad_de_goles = new Goles();
        //Partido partido = new Partido();
        //JOptionPane.showMessageDialog(null, cantidad_de_goles.cant_gol(equipo));
       // cantidad_de_goles.cant_gol();
       //JOptionPane.showMessageDialog(null, cantidad_de_goles.tiempo(equipo));
       //partido.resultado(equipo, equipo2);
        
               // Crear instancias de equipos
               Equipo equipo1 = new Equipo("Boca", "CIUDAD2");
               Equipo equipo2 = new Equipo("River", "CIUDAD2");
               Equipo equipo3 = new Equipo("A", "CIUDAD2");
               Equipo equipo4 = new Equipo("B", "CIUDAD2");
               Equipo equipo5 = new Equipo("C", "CIUDAD2");
               Equipo equipo6 = new Equipo("D", "CIUDAD2");
               Equipo equipo7 = new Equipo("E", "CIUDAD2");
               Equipo equipo8 = new Equipo("F", "CIUDAD2");
       
               // Crear instancias de partidos y asignar equipos
               Partido partido1 = new Partido();
               partido1.getEquipos().add(equipo1);
               partido1.getEquipos().add(equipo2);
       
               Partido partido2 = new Partido();
               partido2.getEquipos().add(equipo3);
               partido2.getEquipos().add(equipo4);
       
               Partido partido3 = new Partido();
               partido3.getEquipos().add(equipo5);
               partido3.getEquipos().add(equipo6);
       
               Partido partido4 = new Partido();
               partido4.getEquipos().add(equipo7);
               partido4.getEquipos().add(equipo8);
       
               // Crear instancia de fase y agregar partidos
               Fases fase = new Fases();
               fase.agregarPartido(partido1);
               fase.agregarPartido(partido2);
               fase.agregarPartido(partido3);
               fase.agregarPartido(partido4);
       
               // Simular la fase del torneo
               fase.jugarFase();
    }
}
