package torneoaf;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo {
	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> jugadores = new LinkedList<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LinkedList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(LinkedList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Equipo(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "\nEquipo [nombre=" + nombre + ", ciudad=" + ciudad + ", jugadores=" + jugadores + "]";
	}

	public boolean agregarj(int cantidad) {
		// verificar cantidad mayor a 7 y menor a 12
		if (cantidad > 7 && cantidad < 12) {

			for (int i = 0; i < cantidad; i++) {
				this.getJugadores().add(new Jugador("Ale", "CIUDAD", 10, 20));
			}
			JOptionPane.showMessageDialog(null,
					"Se han agregado " + cantidad + " jugadores en el plantel de " + this.nombre + jugadores);

			return true;
		} else {
			// vuelve a consultar si se equivico de valor
			cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de jugadores de " + this.nombre
					+ " incorrecta\nIngrese cantidad de jugadores nuevamente: "));
			if (cantidad > 7 && cantidad < 12) {
				for (int i = 0; i < cantidad; i++) {
					this.getJugadores().add(new Jugador("Ale", "CIUDAD", 10, 20));
				}
				JOptionPane.showMessageDialog(null,
						"Se han agregado " + cantidad + " jugadores en el plantel de " + this.nombre);
				return true;
			} else {
				JOptionPane.showMessageDialog(null, "Cantidad de jugadores de " + this.nombre + " incorrecta");
			}
			return false;
		}

	}

	public boolean agregar() {

		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Leo", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		jugadores.add(new Jugador("Ale", "CIUDAD", 10, 20));
		JOptionPane.showMessageDialog(null,
				"Se han agregado " + jugadores.size() + " jugadores en el plantel de " + this.nombre + jugadores);
		return true;
	}

	public void eliminarj(int cantidad_eliminado) {
		// Verificar cantidad maxima
		if (cantidad_eliminado < 12) {
			for (int j = 0; j < cantidad_eliminado; j++) {
				this.getJugadores().removeLast();
			}
			JOptionPane.showMessageDialog(null,
					"Cantidad de jugadores que quedan en " + this.nombre + "es: " + jugadores.size());
		} else {
			JOptionPane.showMessageDialog(null, "No se puede eliminar la cantidad de jugadores ingresada");
		}
	}

	public void buscarj(int indice_buscado) {
		if (indice_buscado < 12) {
			JOptionPane.showMessageDialog(null, "Se ha encontrado al jugador " + jugadores.get(indice_buscado));
		} else {
			JOptionPane.showMessageDialog(null, "No ha encontrado al jugador ");
		}
	}

	public void buscarn(String nombre_buscado) {

	    for (Jugador jugador : jugadores) {
	        if (jugador.getNombre().equals(nombre_buscado)) {
	            //encontrado = true;
	            JOptionPane.showMessageDialog(null, "Se ha encontrado al jugador: " + jugador);
	            break; 
	        }
	    }
	}

}
