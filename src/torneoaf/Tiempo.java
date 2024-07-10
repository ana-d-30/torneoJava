package torneoaf;

public class Tiempo extends Goles {

    public int tiempo() {
        int tiempo = 90 + (int) (Math.random() * (120 - 90));
        return tiempo;
    }
}