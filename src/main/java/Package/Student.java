package Package;

public class Student {

    private long ID;
    protected String name;
    protected String lastName;
    public int age;
    public int degree;


    /**
     * Constructor que intancia los atributos.
     * @param ID
     * @param name
     * @param lastName
     * @param age
     * @param degree
     */
    public Student(long ID, String name, String lastName, int age, int degree){
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.degree = degree;
    }

    /**
     * Este método hace posible la modificación del valor del atributo
     * identificación de las clase Estudiante.
     *
     * @param ID
     */
    protected void setID(long ID){
        this.ID = ID;
    }

    /**
     * Este método muestra el atributo Identificación de la clase Estudiante
     * @return el valor del atributo identificación.
     */
    public Long getID(){
        return ID;
    }
}
