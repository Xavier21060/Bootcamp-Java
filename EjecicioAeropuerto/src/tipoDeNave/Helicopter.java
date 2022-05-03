package tipoDeNave;

public class Helicopter extends AeroNave{


    public Helicopter(String tipoAeronave, int cantidadDeAsientos) {
        super(tipoAeronave, cantidadDeAsientos );
    }



    @Override
    public void mostrarDatosAeronaves() {
        System.out.println("Aeropuerto Del Ejercito Nacional");
    }

}

