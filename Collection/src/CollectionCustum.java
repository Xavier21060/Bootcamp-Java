public class CollectionCustum<T>{



    private  String name;
    private int edad;
    private int salario;

    public CollectionCustum() {
    }

    public CollectionCustum(String name, int
            edad, int salario) {
        this.name = name;
        this.edad = edad;
        this.salario = salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "CollectionCustum{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    private T incentivo;

    public CollectionCustum(T incentivo) {
        this.incentivo = incentivo;
    }

    public T getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(T incentivo) {
        this.incentivo = incentivo;
    }

    public  T incentvo (int values){
        return (T) ("El incentvo es " + values);
    }

    public T salarioFinal (int salarioFinal){
        int values = 0;
        salarioFinal = values + salario;
        return (T) ("El salario final del trabajador es " + values + salario);
    }

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


}
