import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String leerdatos;


        ArrayList<CollectionCustum> descripcion = new ArrayList<CollectionCustum>();

        descripcion.add(new CollectionCustum<>("xavier", 23, 3000));
        descripcion.add(new CollectionCustum<>("Andres", 22, 3400));
        descripcion.add(new CollectionCustum<>("Carlos", 32, 3200));
        descripcion.add(new CollectionCustum<>("Pedro", 19, 2500));
        descripcion.add(new CollectionCustum<>("Maria", 24, 4500));
        descripcion.add(new CollectionCustum<>("Carmen", 34, 6000));

        descripcion.add(new CollectionCustum<>("Francia", 29, 1500));
        descripcion.add(new CollectionCustum<>("Gustavo", 45, 1800));
        descripcion.add(new CollectionCustum<>("Margarita", 55, 2000));
        descripcion.add(new CollectionCustum<>("Alexandra", 66, 6000));

        for (Object empleado: descripcion){
            System.out.println(empleado.toString());
        }

        System.out.println("--------------------------------------");

        Set<CollectionCustum> clientes = new HashSet<>();
        clientes.add(new CollectionCustum<>("Xavier", 23, 300));
        clientes.add(new CollectionCustum<>("Carlos", 34, 3000));
        clientes.add(new CollectionCustum<>("Maria", 18, 2500));
        clientes.add(new CollectionCustum<>("antonio", 31, 1500));
        clientes.add(new CollectionCustum<>("Harold", 43, 18500));
        clientes.add(new CollectionCustum<>("Juan", 17, 22000));

        for (CollectionCustum client: clientes){
            System.out.println(client);

        }


    }
}
