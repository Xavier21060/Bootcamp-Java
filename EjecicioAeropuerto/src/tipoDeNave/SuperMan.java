package tipoDeNave;

public class SuperMan extends AeroNave  {

    private String poderes;

    public SuperMan(String tipoAeronave, int cantidadDeAsientos) {
        super(tipoAeronave, cantidadDeAsientos);
        this.poderes = poderes;
    }

    @Override
    public void mostrarDatosAeronaves() {

    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

}
