import java.util.Scanner;

public class SofwareNotas {
    private String cantidadAlumno ;
    private  String[] nombreAlumno;
    private  String[] apellido;
    private  int[] notasEstudiante;

    public SofwareNotas() {
    }

    public SofwareNotas(String cantidadAlumno, String[] nombreAlumno, String[] apellido, int notaMayor, int notaMenor, int promedio) {
        this.cantidadAlumno = cantidadAlumno;
        this.nombreAlumno = nombreAlumno;
        this.apellido = apellido;
        this.notasEstudiante = notasEstudiante;

    }

    public String getCantidadAlumno() {
        return cantidadAlumno;
    }

    public void setCantidadAlumno(String cantidadAlumno) {
        this.cantidadAlumno = cantidadAlumno;
    }

    public String[] getNombreAlumno() {
        return nombreAlumno;
    }

    public  void setNombreAlumno(String[] nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String[] getApellido() {
        return apellido;
    }

    public void setApellido(String[] apellido) {
        this.apellido = apellido;
    }

    public int[] getNotasEstudiante() {
        return notasEstudiante;
    }

    public  void setNotasEstudiante(int[] notasEstudiante) {
        this.notasEstudiante = notasEstudiante;
    }
}

