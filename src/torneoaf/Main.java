package torneoaf;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String[] Opciones = {
			
			"Modificar equipo y jugadores manualmente","Jugar partido","Buscar equipo y jugador", "Salir"
				
		};
        int opcion =0;
		opcion = JOptionPane.showOptionDialog(null, "Bienvenido\nMenu pricipal", null, opcion, opcion, null, Opciones, Opciones[0]);
        switch (opcion) {
            case 0:
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
            case 1:
                Equipo grupo4 = new Equipo("BOCA", "CIUDAD1");
                Equipo grupo5 = new Equipo("RIVER", "CIUDAD2");


                if (grupo4.agregar() && grupo5.agregar()){
                    //Inicio de partido
                    JOptionPane.showMessageDialog(null, "Comienza el partido");
                    GestorEquipos partido = new GestorEquipos();
                    partido.jugar(grupo4, grupo5);
    
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede comenzar partido");
                }
                
                //lo que argego ahora
             //   tring[] OpcioneE = {
            			
            //			"Boca","River","Racing", "Independiente", ""
            				
            	//	};
                //    int opcion =0;
            	//	opcion = JOptionPane.showOptionDialog(null, "Elige un equipo\nMenu pricipal", null, opcion, opcion, null, Opciones, Opciones[0]);
                //    switch (opcion) {
                 //       case 0:

                break;
            case 2:

                GestorEquipos equipos_lista = new GestorEquipos();
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
                if (!jugadorEncontrado) {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado al jugador en ningún equipo");
                }


                
                break;
            case 3:
                
                break;
        
            default:
                break;
        }



    }
}
