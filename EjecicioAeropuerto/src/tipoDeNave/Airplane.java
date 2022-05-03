package tipoDeNave;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Airplane extends AeroNave  {

    //metodo constructor
    public Airplane(String tipoAeronave, int cantidadDeAsientos){
        //Aplicando Herencia
        super(tipoAeronave, cantidadDeAsientos);
    }
    /*1) un metodo para añadir las fechas
    de los viajes disponibles, y las muestres
    2).UNA coleccion de objetos de la clase ViajesDisponibles
     */
    ArrayList<ViajesDisponibles> viajesDisponibles = new ArrayList<>();
    public void addViajesDisponibles(String date, String time){
        //Añadir los elementos del arrayList
        //Cada vez que ñade un nuevo viajes se añada un nuevo objetos
        viajesDisponibles.add(new Airplane.ViajesDisponibles(date, time));
    }
    //se crea este metodo para obtener y agregar los datos del arrayList
    public ArrayList<ViajesDisponibles> getViajesDisponibles() {
        return viajesDisponibles; //devolver el Array
    }

    @Override
    public void mostrarDatosAeronaves() {
        System.out.println("Aerropuerto Terricola");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAirplane " +
                "\nviajesDisponibles: " + viajesDisponibles.toString() ;
    }

    //CLase anidada de tipo static para saber que fechas se puede viajar en el avion
    public static class ViajesDisponibles{

        private int id_viajesDisponibles;
        private Date date;
        private String time;

        SimpleDateFormat formato = new SimpleDateFormat("DD/MM/AAAA");
        /*1). Un metodo constructor para saber que fecha
        se puede viajar en un avion
         */
        public ViajesDisponibles(String date, String time) {
            try {
                this.date = formato.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int gId_viajesDisponibles() {
            return id_viajesDisponibles;
        }

        public void setId_viajesDisponibles(int id_viajesDisponibles) {
            this.id_viajesDisponibles = id_viajesDisponibles;
        }

        public Date getDate() {
            return date;
        }
        public String getDate(String DATE) {
            return formato.format(date);
        }


        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "ViajesDisponibles: " +
                    "\nid_viajesDisponibles: " + id_viajesDisponibles +
                    "\ndate:" + date +
                    "\ntime: " + time + '\n';
        }
    }
}
