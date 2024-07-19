package Tarea220724;

import java.util.Arrays;
import java.time.LocalDate;

public class Relaciones {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Blas");
        persona.setDni(1234567);
        persona.setFechaDeNacimiento();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Marca");


        persona.setVehiculo(vehiculo);

        System.out.println(persona.getVehiculo().getMarca());
        System.out.println("ArrancarVehiculo");

    }
}
