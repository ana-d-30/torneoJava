package torneoaf;

public class Jugador {
    private String nombre;
    private String posicion;
    private int nroc;
    private int edad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public int getNroc() {
        return nroc;
    }
    public void setNroc(int nroc) {
        this.nroc = nroc;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Jugador(String nombre, String posicion, int nroc, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroc = nroc;
        this.edad = edad;
    }

    @Override
	public String toString() {
		return "\nJugador [nombre=" + nombre + ", posicion=" + posicion + ", nroc=" + nroc + ", edad=" + edad + "]";
	}
}