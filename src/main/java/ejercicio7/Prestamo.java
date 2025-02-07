package ejercicio7;

import java.util.Date;

public class Prestamo {
    private Ejemplar ejemplar;
    private Lector lector;
    private Date dataP;

    public Prestamo(Ejemplar ejemplar, Lector lector, Date dataP) {
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.dataP = dataP;
    }
    public Ejemplar getEjemplar() {
        return ejemplar;
    }
    public Lector getLector() {
        return lector;
    }
    public Date getDataP() {
        return dataP;
    }
}
