package vehiculo;

/**
 *
 * @author David_Acaro
 */
public class Motocicleta extends Vehiculo {

    //Crear varibles
    protected boolean tieneCasco;

    public Motocicleta(boolean tieneCasco, int numRuedas, int velocidadMaxima) {
        super(numRuedas, velocidadMaxima);
        this.tieneCasco = tieneCasco;
    }


    //Creacion de metodos unicos
    public void Motocicleta() {

        System.out.println("\nPosees casco? " + tieneCasco + "\nLa motocicleta tiene " + numRuedas + " ruedas");
    }

    //Heredacion de Metodos
    @Override
    public void acelerar() {
        System.out.println("La motocicleta esta acelerando a " + velocidadMaxima+ "km/h");
    }

    @Override
    public void Vehiculo() {
        Motocicleta();
        acelerar();
    }
}
