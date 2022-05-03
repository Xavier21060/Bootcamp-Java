package tipoDeNave;

public abstract class AeroNave {
    private int id;
    private String tipoAeronave;
    private int cantidadDeAsientos;
    private String marca;
    private String modelo;

    public AeroNave(String tipoAeronave, int cantidadDeAsientos ) {
        this.tipoAeronave = tipoAeronave;
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public String getTipoAeronave() {
        return tipoAeronave;
    }

    public void setTipoAeronave(String tipoAeronave) {
        this.tipoAeronave = tipoAeronave;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.length() > 4){
            System.out.println("La marca debe terner 4 digitos");
        }else if (modelo.length() == 4){
            this.modelo = modelo;
        }
    }
    //No es un metodo de esta clase, está siendo extraido, de la superclase
    @Override
    public String toString() {
        return "AeroNave: " +
                " id=" + id +
                " tipoAeronave= " + tipoAeronave +
                " cantidadDeAsientos=" + cantidadDeAsientos +
                " marca=" + marca +
                " modelo=" + modelo +
                '\n';
    }
    public abstract void mostrarDatosAeronaves();

}
