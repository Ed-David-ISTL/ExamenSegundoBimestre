package vehiculo;

/**
 *
 * @author David_Acaro
 */
public abstract class Vehiculo {

    //Crear varibles
    protected int numRuedas;
    protected int velocidadMaxima;

    public Vehiculo(int numRuedas, int velocidadMaxima) {
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Crera metodos
    public abstract void Vehiculo();

    public abstract void acelerar();

}
