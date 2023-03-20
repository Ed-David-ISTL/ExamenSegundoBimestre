package vehiculo;

/**
 *
 * @author David_Acaro
 */
public class Automovil extends Vehiculo {

    //Crear varibles
    protected int numPuertas;

    public Automovil(int numPuertas, int numRuedas, int velocidadMaxima) {
        super(numRuedas, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    //Creacion de metodos unicos
    public void Automovil() {

        System.out.println("El automovil posee " + numPuertas + " puertas y " + numRuedas + " ruedas");
    }

    //Heredacion de Metodos
    @Override
    public void acelerar() {
        System.out.println("El Automovil esta acelerando a " + velocidadMaxima + "km/h");
    }

    @Override
    public void Vehiculo() {
        Automovil();
        acelerar();
    }
}
