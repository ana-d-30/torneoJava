package torneoaf;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String[] Opciones = {
			
			"Jugar partido","Modificar equipo y jugadores manualmente","Buscar equipo y jugador", "Salir"
				
		};
        int opcion =0;
		opcion = JOptionPane.showOptionDialog(null, "Bienvenido\nMenu pricipal", null, opcion, opcion, null, Opciones, Opciones[0]);
        switch (opcion) {
            case 0:
            Equipo equipo1 = new Equipo("Boca", "CIUDAD2");
            Equipo equipo2 = new Equipo("River", "CIUDAD2");
            Equipo equipo3 = new Equipo("A", "CIUDAD2");
            Equipo equipo4 = new Equipo("B", "CIUDAD2");
            Equipo equipo5 = new Equipo("C", "CIUDAD2");
            Equipo equipo6 = new Equipo("D", "CIUDAD2");
            Equipo equipo7 = new Equipo("E", "CIUDAD2");
            Equipo equipo8 = new Equipo("F", "CIUDAD2");

            // Crear partidos y equipos
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

            // Crear fase
            Fases fase = new Fases();
            fase.agregarPartido(partido1);
            fase.agregarPartido(partido2);
            fase.agregarPartido(partido3);
            fase.agregarPartido(partido4);

            String[] opcionesE = {
                "Boca", "River", "A", "B", "C", "D", "E", "F", "Salir"
            };

            // Mostrar el menú y obtener la opción seleccionada
            int opcionE = 0;
            opcionE = JOptionPane.showOptionDialog(null, "Selecciona un equipo", null,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, opcionesE, opcionesE[0]);

            // Crear un mapa de nombres de equipos a sus instancias
            Equipo equipoSeleccionado = null;
            switch (opcionE) {
                case 0: equipoSeleccionado = equipo1; break;  // Boca
                case 1: equipoSeleccionado = equipo2; break;  // River
                case 2: equipoSeleccionado = equipo3; break;  // A
                case 3: equipoSeleccionado = equipo4; break;  // B
                case 4: equipoSeleccionado = equipo5; break;  // C
                case 5: equipoSeleccionado = equipo6; break;  // D
                case 6: equipoSeleccionado = equipo7; break;  // E
                case 7: equipoSeleccionado = equipo8; break;  // F
                case 8:
                    // "Salir" 
                    return;
                default:
                    // 
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    return;
            }

            // Simular la fase del torneo y verificar el ganador
            String ganadorFinal = fase.jugarFase();
            if (equipoSeleccionado.getNombre().equals(ganadorFinal)) {
                JOptionPane.showMessageDialog(null, "¡Ganó tu equipo " + equipoSeleccionado.getNombre() + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Tu equipo " + equipoSeleccionado.getNombre() + " no ganó. El ganador es " + ganadorFinal + ".");
            }

            break;
                //#endregion


            case 1:
            //#region modificaciones
            String[] Opcionesm = {
                
                "Agregar equipos y jugadores","Eliminar equipo y jugadores","Salir"
                    
            };
            int opcionm =0;
            opcionm = JOptionPane.showOptionDialog(null, "Menu pricipal", null, opcionm, opcionm, null, Opcionesm, Opcionesm[0]);
            switch (opcionm) {
                case 0:

                    String nombre_1 = JOptionPane.showInputDialog("Ingrese un nombre de Equipo:");
                    String ciudad_1 = JOptionPane.showInputDialog("Ingrese la ciudad del equipo");
                    Equipo grupo1 = new Equipo(nombre_1,ciudad_1);
                    int cantidad_grupo1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de jugadores del Plantel: "));
                    Boolean grupo_ok = grupo1.agregarj(cantidad_grupo1);
                    Equipo grupo2 = new Equipo("RIVER", "CIUDAD2");
                    Boolean grupo_ok2 = grupo2.agregarj(9);
    
                    //Verificar Cantidad de jugadores para el partido
                    if (grupo_ok && grupo_ok2){
                        //Inicio de partido
                        JOptionPane.showMessageDialog(null, "Comienza el partido");
                        GestorEquipos partido = new GestorEquipos();
                        partido.jugar(grupo1, grupo2);
    
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede comenzar partido");
                    }
                break;
                    
                case 1:
                    GestorEquipos equipos_lista1 = new GestorEquipos();
                    equipos_lista1.agregarE();
                    int cantidad_de_eliminados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de equipos a eliminar: "));
                    equipos_lista1.eliminarE(cantidad_de_eliminados);

                    break;
                case 2:
                    
                    break;
            
                default:
                    break;
            }


            break;
            //#endregion

            case 2:
            //#region Bucar Equipos. y Jugugadores.
                GestorEquipos equipos_lista = new GestorEquipos();
                //Se genera listado por default
                equipos_lista.agregarE();
                String nombre_Equipo1 = JOptionPane.showInputDialog("Ingrese el nombre del equipo");
                equipos_lista.buscarE(nombre_Equipo1);

                String nombre_jugador = JOptionPane.showInputDialog("Ingrese el nombre del jugador");
                
                boolean jugadorEncontrado = false;

                for (Equipo equipo : equipos_lista.getEquipos()) {
                    equipo.buscarn(nombre_jugador);
                    if (equipo.getNombre().equals(nombre_jugador)) {
                    	jugadorEncontrado = true;
                        JOptionPane.showMessageDialog(null, "Se ha encontrado al Jugador "+equipo);
                        break;
                    }

                }
                //if (!jugadorEncontrado) {
                    //JOptionPane.showMessageDialog(null, "No se ha encontrado al jugador en ningún equipo");
                //}
                break;
            //#endregion
            case 3:
                
                break;
        
            default:
                break;
        }



    }
}