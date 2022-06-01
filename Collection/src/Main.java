import java.util.*;

/**
 * - debe tener los métodos
 * size():int
 * addFirst(T): void
 * addLast(T):void
 * add(T):void
 * remove(T): T remueve el primer elemento indicado y lo retorna
 * removeAll(T): void remueve todos los elementos.
 * boolean empty(): indica si la colección está vacía
 *
 * @return
 */
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

        descripcion.removeAll(descripcion);
        System.out.println("Eliminando todos los datos" + descripcion + "Cero dato encontrado");

        boolean estadoDeDatos = descripcion.isEmpty();
        System.out.println("El estado actual es " + estadoDeDatos);


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



        LinkedList<String> mascotas = new LinkedList<>();
        mascotas.add("Perro");
        mascotas.add("Gato");

        System.out.println("Los elementos son" + mascotas);

        mascotas.addLast("Vaca");
        System.out.println("El elemento agregado al dinal de la fila es " + mascotas );

        mascotas.addFirst("Iguana");
        System.out.println("El elemento agregado al principio de la collecion es: " + mascotas);




    }
}
