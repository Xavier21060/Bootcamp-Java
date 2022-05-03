import java.util.Scanner;

public class NotasAlumnos extends SofwareNotas {

    public void sofware(){
        System.out.println("Ingrese la cantidad de alumos de la escuela");
        Scanner sc= new Scanner(System.in);
        setCantidadAlumno(sc.nextLine());

        setNombreAlumno(new String[Integer.parseInt(getCantidadAlumno())]);
        setApellido(new String[Integer.parseInt(getCantidadAlumno())]);
        setNotasEstudiante(new int[Integer.parseInt(getCantidadAlumno())]);




        for (int i = 0; i < getNombreAlumno().length; i++) {
            int control = i+1;
            System.out.println(control + ". digite el nombrre completo del estudiante");
            getNombreAlumno()[i] = sc.next();
            getApellido()[i] = sc.next();
        }

        for (int j = 0; j < getNotasEstudiante().length; j++) {
            System.out.println("Digite la nota del estudiande " + getNombreAlumno()[j] + " " + getApellido()[j] );
            getNotasEstudiante()[j] = sc.nextInt();
            do {
                System.out.println("Por favor digite una nota correcta del estudiande " + getNombreAlumno()[j] + " " + getApellido()[j] );
                getNotasEstudiante()[j] = sc.nextInt();
            }while (getNotasEstudiante()[j] <0 || getNotasEstudiante()[j]>10  );



        }

        int notaMayor = getNotasEstudiante()[0];
        int notaMenor = getNotasEstudiante()[0];
        int promedio = 0;

        for (int j = 0; j < getNotasEstudiante().length ; j++) {
            if (getNotasEstudiante()[j] > notaMayor){
                notaMayor = getNotasEstudiante()[j];
            }if (getNotasEstudiante()[j] < notaMenor) {
                notaMenor = getNotasEstudiante()[j];
            }

        }
        System.out.println("La nota mayor es " + notaMayor);
        // nota menor
        System.out.println( "La nota menor es " + notaMenor);

        for (int i = 0; i < getNotasEstudiante().length; i++) {
            int j = 0;
            String alumnosAprobados[];

            /*if (getNotasEstudiante()[j] >= 7) {
                alumnosAprobados = new String[getNombreAlumno()[i]];
            }*/
        }


    }
    public void alumnosAprobados(){
        String alumnoAprobado[];

        for (int i = 0; i < getNotasEstudiante()[i]; i++) {
            if (getNotasEstudiante()[i]>=7){
                alumnoAprobado = new String[getNombreAlumno().length];
            }
        }
    }
}
