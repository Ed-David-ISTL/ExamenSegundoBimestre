package vehiculo;

/**
 *
 * @author David_Acaro
 */
public class PruebaVehiculos {

    public static void main(String args[]) {
        /* Automovil[] Vehiculos = new Automovil[5];
        Vehiculos[i]=new Dado(1,true);
       ;*/
        //Intente hacer la parte del arrays y no me funciono

        //Crear objetos para llamar las clases
        Vehiculo am = new Automovil(4, 200, 4);
        Vehiculo mc = new Motocicleta(true, 2, 125);
        am.Vehiculo();
        mc.Vehiculo();

    }
}
